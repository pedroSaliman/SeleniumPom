package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchPage extends PageBase {


    private static final By Message=By.xpath("//h2[normalize-space()='Products meeting the search criteria']");
    private static final By AddToCompareList=By.xpath("//button[@data-original-title='Compare this Product']");
    private static final By AlertCompare=By.xpath("//a[normalize-space()='product comparison']");


    public ComparePage CompareClick(){
        clickjs(AddToCompareList);
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(AlertCompare));


       clickjs(AlertCompare);
        return new ComparePage();


    }
    public String Text(){
        return find(Message).getText();
    }
}
