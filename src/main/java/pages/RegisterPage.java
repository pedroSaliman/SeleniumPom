package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends PageBase{
    public RegisterPage(WebDriver driver) {
        super(driver);
    }
    private static final By fName= By.xpath("//input[@id='input-firstname']");
    private static final By lName=By.xpath("//input[@id='input-lastname']");
    private static final By Email=By.xpath("//input[@id='input-email']");
    private static final By Telephone=By.xpath("//input[@id='input-telephone']");
    private static final By Password=By.xpath("//input[@id='input-password']");
    private static final By ConfirmPassword=By.xpath("//input[@id='input-confirm']");
    private static final By Check=By.xpath("//label[normalize-space()='Yes']");
    private static final By Privacy=By.xpath("//input[@name='agree']");
    private static final By Button=By.xpath("//input[@value='Continue']");



    public   MyAccountPage Register(String FirstName,String LastName,String email,String telephone,String password,String confirmPassword){
Type(fName,FirstName);
Type(lName,LastName);
Type(Email,email);
Type(Telephone,telephone);
Type(Password,password);
Type(ConfirmPassword,confirmPassword);
click(Check);
click(Privacy);
click(Button);

        return new MyAccountPage(driver);
    }
}
