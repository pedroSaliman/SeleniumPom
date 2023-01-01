package pages;


import org.openqa.selenium.By;

public class LoginPage extends PageBase {



    private static final By Email=By.xpath("//input[@placeholder='E-Mail Address']");
    private static final By Password=By.xpath("//input[@placeholder='Password']");
    private static final By Button=By.xpath("//input[@value='Login']");


    public MyAccountPage LoginInfo(String theEmail,String ThePass){
        Type(Email,theEmail);
        Type(Password,ThePass);
        click(Button);
        return new MyAccountPage();
    }

}
