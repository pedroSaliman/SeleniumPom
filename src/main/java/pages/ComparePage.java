package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComparePage extends PageBase {


    private static final By H1 =By.xpath("//h1[normalize-space()='Product Comparison']");

    public ComparePage(WebDriver driver) {
        super(driver);
    }

    public String MessageOfCompare(){
        return find(H1).getText();
    }
}
