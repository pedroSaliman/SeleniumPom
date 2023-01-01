package pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;


public class PageBase {
    public static    WebDriver driver;



    public  void setDriver(WebDriver driver) {
        PageBase.driver = driver;
    }








protected WebElement find(By locator){
        return driver.findElement(locator);
}

protected void clearinput(By locator){
        find(locator).clear();
}
    public void clickjs(By locator) {

        JavascriptExecutor executor=(JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", find(locator));
    }


    protected     void click(By locator){
        find(locator).click();
    }
    protected     void Type(By locator,String value){
        find(locator).sendKeys(value);
    }






}
