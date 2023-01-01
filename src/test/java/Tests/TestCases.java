package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class TestCases extends BaseTest{

    @Test
    public void registerInfo(){
        new Home().registerClick().Register(config.fname(), config.lname(), email, config.telephone(), config.password(), config.confirm());
        Assert.assertEquals("Your Account Has Been Created!",new MyAccountPage().messageCreatAccount());

    }

    @Test(dependsOnMethods = {"registerInfo"})
    public void LoginCase(){
        new Home().logout()

        .LoginInfo(email,config.password());
       Assert.assertEquals("My Account",new MyAccountPage().message());
    }
    @Test(dependsOnMethods = {"LoginCase"})
    public void EditAccountCase(){
        new MyAccountPage().edit().editInfo(config.fname());
        Assert.assertEquals("Success: Your account has been successfully updated.", new EditInfo().MessageOfAlertToUpdateMyAccount());

    }

    @Test(dependsOnMethods = {"EditAccountCase"})
    public void ChangePass(){
        new MyAccountPage().change().ChangeInformationAboutPassword(config.changepassword(), config.changepassword());
        Assert.assertEquals("Success: Your password has been successfully updated.",new ChangeInfo().AlertText());
    }



    @Test(dependsOnMethods = {"ChangePass"})
    public void SearchCaseCompare(){
        new MyAccountPage().search(config.product()).CompareClick();
        new MyAccountPage().search(config.anotherproduct()).CompareClick();
        Assert.assertEquals(new ComparePage().MessageOfCompare(),"Product Comparison");
    }


}
