package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ContactUsPage extends  AbstractClass {
    WebDriver driver;
    public ContactUsPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
@FindBy(xpath = "//a[@title='Contact Us']")
    private WebElement contactUsButton;
    public void setContactUsButton(){
        clickFunction(contactUsButton);
    }
@FindBy(xpath = "//select[@id='id_contact']")
    private WebElement subjectHeadingslc;
    public void setSubjectHeadingslc(){
        slc(subjectHeadingslc,"Webmaster");
    }
@FindBy(xpath = "//input[@id='email']")
    private WebElement email;
    public void setEmail(String mail){
        sendKeysFunction(email,mail);
    }
@FindBy(xpath = "//input[@id='id_order']")
    private WebElement orderReferance;
    public void setOrderReferance(String order){
        sendKeysFunction(orderReferance,order);
    }
@FindBy(xpath = "//textarea[@id='message']")
    private WebElement messageBox;
    public void setMessageBox(String message){
        sendKeysFunction(messageBox,message);
    }
@FindBy(xpath = "(//i[@class='icon-chevron-right right'])[3]")
    private WebElement sendButton;
    public void setSendButton(){
        clickFunction(sendButton);
    }




}
