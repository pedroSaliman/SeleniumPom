package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditInfo extends PageBase {


    private static final By fName=By.xpath("//input[@id='input-firstname']");
    private static final By Button=By.xpath("//input[@value='Continue']");
    private static final By Success=By.xpath("//div[@class='alert alert-success alert-dismissible']");

    public void editInfo(String FirstName){
        clearinput(fName);
        Type(fName,FirstName);
        click(Button);


    }
    public String MessageOfAlertToUpdateMyAccount(){

        return find(Success).getText();
    }
}
