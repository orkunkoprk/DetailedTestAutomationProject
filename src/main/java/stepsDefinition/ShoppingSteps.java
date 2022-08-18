package stepsDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjectModel.ShoppingPage;

public class ShoppingSteps {
    WebDriver driver;
    ShoppingPage shoppingPage = new ShoppingPage();


    @And("^Anasayfada misin$")
    public void anasayfadaMisin() {

    }

    @And("^Ilk urunun detay sayfasina git$")
    public void ilkUrununDetaySayfasinaGit() {
    }

    @And("^Size M yap$")
    public void sizeMYap() {
    }

    @And("^Color Mavi olsun$")
    public void colorMaviOlsun() {
    }

    @And("^Add to Cart tikla$")
    public void addToCartTikla() {
    }

    @And("^Continue shopping tikla$")
    public void continueShoppingTikla() {
    }

    @And("^Son urunun deta sayfasina git$")
    public void sonUrununDetaSayfasinaGit() {
    }

    @And("^Urunun sayisini arttir$")
    public void urununSayisiniArttir() {
    }

    @And("^Proceed to checkout butonuna tikla$")
    public void proceedToCheckoutButonunaTikla() {
    }

    @And("^Shoppin Details sayfasinda misin$")
    public void shoppinDetailsSayfasindaMisin() {
    }

    @And("^Pahali olan urunu bir arttir$")
    public void pahaliOlanUrunuBirArttir() {
    }

    @And("^Toplam urun fiyatını yazdir$")
    public void toplamUrunFiyatınıYazdir() {
    }

    @When("^Urunlerin ikisini de Sil$")
    public void urunlerinIkisiniDeSil() {
    }

    @Then("^Sepetin bos oldugu Mesajini Al$")
    public void sepetinBosOlduguMesajiniAl() {
    }
}
