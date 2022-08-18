package stepsDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjectModel.RegisterPage;
import utilities.Driver;

public class RegisterSteps {
    WebDriver driver;
    RegisterPage registerPage = new RegisterPage();
    @Given("^Go to Website$")
    public void go_to_Website() throws Throwable {
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");

    }

    @And("^Sign in tiklanir$")
    public void signInTiklanir() {
        registerPage.setRegisterButton();
    }

    @And("^\"([^\"]*)\" adresi girilir$")
    public void adresiGirilir(String mail) throws Throwable {
        registerPage.setMailGiris(mail);

    }

    @And("^Butona tiklanir$")
    public void butonaTiklanir() throws InterruptedException {
        registerPage.setMailGirisButton();

    }

    @And("^Title Belirlenir$")
    public void titleBelirlenir() throws InterruptedException {
        registerPage.setMrOrMrs();

    }

    @And("^\"([^\"]*)\" girilir$")
    public void girilir(String firstname) throws Throwable {
        registerPage.FirstName(firstname);
    }

    @And("^Dogum Tarihi Gun Ay Yil seklinde secilip belirlenir$")
    public void dogumTarihiGunAyYilSeklindeSecilipBelirlenir() throws InterruptedException {
     registerPage.Day();
       // registerPage.Month();
        registerPage.Years();
    }

    @And("^Butonlara Tiklanir$")
    public void butonlaraTiklanir() {
        registerPage.setConfirmButtons();
    }

    @And("^\"<adress> girilir$")
    public void adressGirilir() throws Throwable {

    }

    @And("^Semt secilir$")
    public void semtSecilir() {
       registerPage.setState();
    }


    @When("^acik adress once silinir daha sonra girilir$")
    public void acikAdressOnceSilinirDahaSonraGirilir() throws InterruptedException {
        registerPage.EvAdress();
    }

    @Then("^Register butonuna tiklanir$")
    public void registerButonunaTiklanir() {
        registerPage.setSubmit();
    }

    @And("^\"([^\"]*)\" lastname girilir$")
    public void lastnameGirilir(String lastname) throws Throwable {
        registerPage.LastName(lastname);
    }

    @And("^\"([^\"]*)\" password girilir$")
    public void passwordGirilir(String password) throws Throwable {
        registerPage.Password(password);
    }

    @And("^\"([^\"]*)\" isim girilir$")
    public void isimGirilir(String isim) throws Throwable {
        registerPage.Isim(isim);
    }

    @And("^\"([^\"]*)\" soyisim girilir$")
    public void soyisimGirilir(String soyisim) throws Throwable {
        registerPage.Soyisim(soyisim);

    }

    @And("^\"([^\"]*)\" company girilir$")
    public void companyGirilir(String company) throws Throwable {
        registerPage.Company(company);
    }




    @And("^\"([^\"]*)\" alternativeAdress girilir$")
    public void alternativeadressGirilir(String alternativeAdress) throws Throwable {
        registerPage.AlternativeAdress(alternativeAdress);
    }

    @And("^\"([^\"]*)\" city girilir$")
    public void cityGirilir(String city) throws Throwable {
        registerPage.City(city);
    }

    @And("^\"([^\"]*)\" postaKodu girilir$")
    public void postakoduGirilir(String posta) throws Throwable {
        registerPage.setPostaKodu(posta);

    }

    @And("^\"([^\"]*)\" telefonNo girilir$")
    public void telefonnoGirilir(String telefon) throws Throwable {
        registerPage.setTelefon(telefon);

    }

    @And("^\"([^\"]*)\" evTelefonNo girilir$")
    public void evtelefonnoGirilir(String evTelefon) throws Throwable {
        registerPage.EvTelefonu(evTelefon);
    }

    @And("^\"([^\"]*)\" mobilePhone girilir$")
    public void mobilephoneGirilir(String cep) throws Throwable {
        registerPage.CepTelefonu(cep);

    }

    @And("^\"([^\"]*)\" adress girilir$")
    public void adressGirilir(String adress) throws Throwable {
        registerPage.Adress(adress);

    }
}
