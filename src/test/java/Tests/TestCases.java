package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class TestCases extends BaseTest{

    @Test
    public void registerInfo(){
        new Home(driver).registerClick().Register(config.fname(), config.lname(), email, config.telephone(), config.password(), config.confirm());
        Assert.assertEquals("Your Account Has Been Created!",new MyAccountPage(driver).messageCreatAccount());

    }

    @Test(dependsOnMethods = {"registerInfo"})
    public void LoginCase(){
        new Home(driver).logout()

        .LoginInfo(email,config.password());
       Assert.assertEquals("My Account",new MyAccountPage(driver).message());
    }
    @Test(dependsOnMethods = {"LoginCase"})
    public void EditAccountCase(){
        new MyAccountPage(driver).edit().editInfo(config.fname());
        Assert.assertEquals("Success: Your account has been successfully updated.", new EditInfo(driver).MessageOfAlertToUpdateMyAccount());

    }

    @Test(dependsOnMethods = {"EditAccountCase"})
    public void ChangePass(){
        new MyAccountPage(driver).change().ChangeInformationAboutPassword(config.changepassword(), config.changepassword());
        Assert.assertEquals("Success: Your password has been successfully updated.",new ChangeInfo(driver).AlertText());
    }



    @Test(dependsOnMethods = {"ChangePass"})
    public void SearchCaseCompare(){
        new MyAccountPage(driver).search(config.product()).CompareClick();
        new MyAccountPage(driver).search(config.anotherproduct()).CompareClick();
        Assert.assertEquals(new ComparePage(driver).MessageOfCompare(),"Product Comparison");
    }


}
