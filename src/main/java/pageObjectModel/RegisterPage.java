package pageObjectModel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class RegisterPage extends AbstractClass {
    WebDriver driver;
    public RegisterPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
@FindBy(xpath = "//a[@class='login']")
    private WebElement registerButton;
    public void setRegisterButton(){
        clickFunction(registerButton);
    }
@FindBy(xpath = "(//input[@class='is_required validate account_input form-control'])[1]")
    private WebElement mailGiris;
    public void setMailGiris(String mail){
        sendKeysFunction(mailGiris,mail);
    }
@FindBy(xpath = "//i[@class='icon-user left']")
    private WebElement mailGirisButton;
    public void setMailGirisButton() throws InterruptedException {
        clickFunction(mailGirisButton);

        Thread.sleep(1000);
    }
@FindBy(xpath = "//div[@id='uniform-id_gender1']")
    private WebElement mrOrMrs;
    public void setMrOrMrs() throws InterruptedException {
        clickFunction(mrOrMrs);
    }
@FindBy(xpath = "//input[@class='is_required validate form-control']")
    private List<WebElement> firstLasteMailPassword;
    public void FirstName(String firstname){
        sendKeysFunction(firstLasteMailPassword.get(0),firstname);
    }
    public void LastName(String lastname){
        sendKeysFunction(firstLasteMailPassword.get(1),lastname);
    }
    public void Password(String password){
        sendKeysFunction(firstLasteMailPassword.get(3),password);
    }
@FindBy(xpath = "//select[@name='days']")
    private WebElement dayMontYears;

    @FindBy(xpath = "(//select[@class='form-control'])[2]")
    private WebElement dayMontYears2;
    @FindBy(xpath = "(//select[@class='form-control'])[3]")
    private WebElement dayMontYears3;
    public void Day() throws InterruptedException {
        Thread.sleep(500);
        slcByValue(dayMontYears,"5");

    }
    public void Month(){
        String ay="5";
        slcByValue(dayMontYears2,ay);
    }
    public void Years(){
        String years="1998";
        slcByValue(dayMontYears3,years);
    }
@FindBy(xpath = "//label[@for='newsletter']")
    private WebElement confirmButton1;
@FindBy(xpath = "//label[@for='optin']")
    private WebElement confirmButton2;
    public void setConfirmButtons(){
        clickFunction(confirmButton1);
        clickFunction(confirmButton2);
    }
@FindBy(xpath = "//input[@class='form-control']")
    private List<WebElement> musterininIlkAltiBilgisi;
    public void Isim(String isim){
        sendKeysFunction(musterininIlkAltiBilgisi.get(0),isim);
    }
    public void Soyisim(String soyisim){
        sendKeysFunction(musterininIlkAltiBilgisi.get(1),soyisim);
    }
    public void Company(String company){
        sendKeysFunction(musterininIlkAltiBilgisi.get(2),company);
    }
    public void Adress(String adress){
        sendKeysFunction(musterininIlkAltiBilgisi.get(3),adress);
    }
    public void AlternativeAdress(String alternativeAdress){
        sendKeysFunction(musterininIlkAltiBilgisi.get(4),alternativeAdress);
    }
    public void City(String city){
        sendKeysFunction(musterininIlkAltiBilgisi.get(5),city);
    }
    public void EvTelefonu(String evTelefonu){
        sendKeysFunction(musterininIlkAltiBilgisi.get(6),evTelefonu);
    }
    public void CepTelefonu(String cepTelefonu){
        sendKeysFunction(musterininIlkAltiBilgisi.get(7),cepTelefonu);
    }
    public void EvAdress() throws InterruptedException {

        musterininIlkAltiBilgisi.get(8).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        Thread.sleep(500);
        String evAdress="İstiklal Mahallesi 40036 sokak no3";
        sendKeysFunction(musterininIlkAltiBilgisi.get(8),evAdress);
    }
@FindBy(xpath = "//select[@id='id_state']")
    private WebElement state;
    public void setState(){
        slc(state,"Alaska");
    }
@FindBy(xpath = "//textarea[@id='other']")
    private WebElement telefon;
    public void setTelefon(String phone){
        sendKeysFunction(telefon,phone);
    }
@FindBy(xpath = "(//i[@class='icon-chevron-right right'])[3]")
private WebElement submit;
    public void setSubmit(){
        clickFunction(submit);
    }
@FindBy(xpath = "//input[@class='form-control uniform-input text']")
    private WebElement postaKodu;
    public void setPostaKodu(String posta){
        sendKeysFunction(postaKodu,posta);
    }
}
