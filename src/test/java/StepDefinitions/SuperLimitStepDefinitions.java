package StepDefinitions;

import Pages.SuperLimitPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class SuperLimitStepDefinitions {
    WebDriver driver = DriverFactory.getDriver();
    SuperLimitPage superLimitPage = new SuperLimitPage(driver);
    @Given("Kullanici anasayfadadir")
    public void kullaniciAnasayfadadir() {
        superLimitPage.anaSayfa();
    }

    @Given("Kendim icin ust menusunden basvurular linkine tiklar")
    public void kendimIcinUstMenusundenBasvurularLinkineTiklar() throws InterruptedException {
        superLimitPage.kendimIcinBasvurular();
    }

    @Given("Super limit basvuru formu tiklar")
    public void superLimitBasvuruFormuTiklar() throws InterruptedException {
        superLimitPage.superLimit();
    }

    @When("TC Kimlik Numarasi yazilir")
    public void tcKimlikNumarasiYazilir() {
        superLimitPage.tcKimlik();
    }

    @When("Cep telefonu yazilir")
    public void cepTelefonuYazilir() {
        superLimitPage.cepTelefonu();
    }

    @When("Dogum tarihi yazilir")
    public void dogumTarihiYazilir() {
        superLimitPage.dogumTarihi();
    }

    @When("KVKK kabul edilir")
    public void kvkkKabulEdilir() {
        superLimitPage.kvkkKabul();
    }

    @Then("Devam butonuna tiklanir")
    public void devamButonunaTiklanir() {
        superLimitPage.devamButton();
    }
}
