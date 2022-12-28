package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChangeInfo extends PageBase{
    public ChangeInfo(WebDriver driver) {
        super(driver);
    }

    private static final By NewPassword= By.xpath("//input[@placeholder='Password']");
    private static final By ConfirmNewPassword=By.xpath("//input[@placeholder='Password Confirm']");
    private static final By Button=By.xpath("//input[@value='Continue']");
    private static final By Alert=By.xpath("//div[@class='alert alert-success alert-dismissible']");

    ///////////// Return The Text of The Alert
    public String AlertText(){

        return find(Alert).getText();
    }


    /////////////////////////////////////////////////////////////////////////////////
    public void ChangeInformationAboutPassword(String password,String confirm){
        Type(NewPassword,password);
        Type(ConfirmNewPassword,confirm);
        click(Button);

    }
}
