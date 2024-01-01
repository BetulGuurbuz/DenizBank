package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class SuperLimitPage {
    static WebDriver driver;
    By kendimIcin = By.xpath("//span[.='Kendim İçin']");
    By kendimIcinBasvurular = By.xpath("//div[@id='main12419-tab']//span[contains(text(),'Başvurular')]");
    By hemenBasvur = By.xpath("//a[@class='noImage-link cashLoanButton']");
    By tcKimlik =  By.xpath("//input[@id='txtTckn']");
    By cepTelefonu = By.xpath("//input[@id='txtGsm']");
    By dogumTarihi = By.xpath("//input[@placeholder='GG/AA/YYYY']");
    By kvkk = By.xpath("//input[@id='kvkkTwo']");
    By devamButton = By.xpath("//button[@type='submit']");
    public SuperLimitPage (WebDriver driver){
        SuperLimitPage.driver = driver;
    }

    public void anaSayfa() {
        driver.get("https://www.denizbank.com/bireysel-bankacilik");
    }

    public void kendimIcinBasvurular() throws InterruptedException {
        driver.findElement(kendimIcin).click();
        Thread.sleep(1000);
        driver.findElement(kendimIcinBasvurular).click();
    }

    public void superLimit() throws InterruptedException {
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,250)", " ");
        driver.findElement(hemenBasvur).click();
        Thread.sleep(1000);
    }

    public void tcKimlik() {
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,250)", " ");
        driver.findElement(tcKimlik).sendKeys("12345678912");
    }

    public void cepTelefonu() {
       driver.findElement(cepTelefonu).sendKeys("5400000000");
    }

    public void dogumTarihi() {
        driver.findElement(dogumTarihi).sendKeys("01012024");
    }

    public void kvkkKabul() {
        driver.findElement(kvkk).click();
    }

    public void devamButton() {
        driver.findElement(devamButton).click();
    }
}
