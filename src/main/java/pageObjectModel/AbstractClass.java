package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.Driver;

public class AbstractClass {
    private WebDriver driver= Driver.getDriver();
    WebDriverWait wait =new WebDriverWait(driver,10);

    public void clickFunction(WebElement clickElement){
        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
    }
    public void sendKeysFunction(WebElement sendKeysElement , String value){
        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        sendKeysElement.sendKeys(value);
    }
    public void slc(WebElement dropdown, String element){

        Select a = new Select(dropdown);
        a.selectByVisibleText(element);
    }
    public void slcByValue(WebElement dropdown, String element){

        Select slcBy = new Select(dropdown);
        slcBy.selectByValue(element);
    }
    public void Assertion(WebElement actual, String expected){
        wait.until(ExpectedConditions.visibilityOf(actual));
        Assert.assertEquals(actual,expected);
    }
    public void isElementExist(WebElement actual){
        wait.until(ExpectedConditions.visibilityOf(actual));
        boolean flag=false;
        if (actual == null)
        { flag = false; }
        flag=true;
        Assert.assertTrue(flag);
    }


}
