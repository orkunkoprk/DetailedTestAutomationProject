package stepsDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjectModel.ContactUsPage;
import utilities.Driver;

public class ContactSteps {
    WebDriver driver;
    ContactUsPage contactUsPage = new ContactUsPage();


    @And("^ContactUs butonuna tiklanir$")
    public void contactusButonunaTiklanir() {
        contactUsPage.setContactUsButton();
    }

    @And("^SubjectHeading seceneklerinden Webmaster secilir$")
    public void subjectheadingSeceneklerindenWebmasterSecilir() {
        contactUsPage.setSubjectHeadingslc();
    }

    @And("^\"([^\"]*)\" EmailAdress girilir$")
    public void emailadressGirilir(String eMail) throws Throwable {
        contactUsPage.setEmail(eMail);

    }

    @And("^\"([^\"]*)\" Order reference girilir$")
    public void orderReferenceGirilir(String order) throws Throwable {
        contactUsPage.setOrderReferance(order);

    }

    @When("^\"([^\"]*)\" Message yazilir$")
    public void messageYazilir(String message) throws Throwable {
        contactUsPage.setMessageBox(message);

    }

    @Then("^Send butonuna tiklanir$")
    public void sendButonunaTiklanir() {
        contactUsPage.setSendButton();

    }
}
