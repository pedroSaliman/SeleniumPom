package pages;


import org.openqa.selenium.By;

public class ComparePage extends PageBase {


    private static final By H1 =By.xpath("//h1[normalize-space()='Product Comparison']");


    public String MessageOfCompare(){
        return find(H1).getText();
    }
}
