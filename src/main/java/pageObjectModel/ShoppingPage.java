package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ShoppingPage extends AbstractClass{
    WebDriver driver;
    public ShoppingPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

}
