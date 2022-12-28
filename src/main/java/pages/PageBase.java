package pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class PageBase {
      WebDriver driver;
    JavascriptExecutor executor;

    public PageBase(WebDriver driver) {
        this.driver = driver;
        this.executor = (JavascriptExecutor) this.driver;
    }


public void clearinput(By locator){
        find(locator).clear();
}
    public void clickjs(By locator) {
        executor.executeScript("arguments[0].click();", find(locator));
    }


    public WebElement find(By locator){
        return driver.findElement(locator);
    }
    public  void click(By locator){
        find(locator).click();
    }
    public  void Type(By locator,String value){
        find(locator).sendKeys(value);
    }






}
