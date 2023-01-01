package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends PageBase {


    private static final By H2=By.xpath("//h2[normalize-space()='My Account']");
    private static final By H1=By.xpath("//h1[normalize-space()='Your Account Has Been Created!']");

    private static final By EditInfo=By.xpath("//a[normalize-space()='Edit Account']");
    private static final By Search=By.xpath("//input[@placeholder='Search']");
    private static final By ChangePassword=By.xpath("//a[normalize-space()='Password']");
    private static final By clicksearch=By.xpath("//button[@class='btn btn-default btn-lg']");



    public String message(){
        return find(H2).getText();
    }
    public String messageCreatAccount(){
        return find(H1).getText();
    }
    public EditInfo edit(){
         click(EditInfo);
        return new EditInfo();
    }
    public SearchPage search(String product){
         Type(Search,product);
         click(clicksearch);

        return new SearchPage();
    }


    public ChangeInfo change(){
        click(ChangePassword);


        return new ChangeInfo();
    }

}
