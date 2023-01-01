package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home extends PageBase {

    ///////////////////////////////////////////////////////
    // private static final    By Register = By.xpath("//a[normalize-space()='Register']");

    private static final By MyAccount =By.xpath("//span[normalize-space()='My Account']");
    private static final    By Register =By.xpath("//a[normalize-space()='Register']");
    private static final By    Logout=By.xpath("//a[normalize-space()='Logout']");
    private static final    By LoginButton=By.xpath("//a[normalize-space()='Login']");



    public LoginPage LoginClick(){
//        new WebDriverWait(driver, Duration.ofSeconds(20))
//                .until(ExpectedConditions.elementToBeClickable(MyAccount));
        click(MyAccount);
        click(LoginButton);
        return new LoginPage();
    }
    public  RegisterPage registerClick() {
        click(MyAccount);
        click(Register);
        return new RegisterPage();
    }


    public LoginPage logout(){
        click(MyAccount);
        click(Logout);
        click(MyAccount);
        click(LoginButton);


        return new LoginPage();
    }
}
