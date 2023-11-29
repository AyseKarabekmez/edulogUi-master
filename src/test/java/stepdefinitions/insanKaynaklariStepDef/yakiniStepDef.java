package stepdefinitions.insanKaynaklariStepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.insanKaynaklariKayit.Yakini;
import utilities.Driver;

import static utilities.Driver.driver;

public class yakiniStepDef {
    Faker faker = new Faker();
    Yakini yakini = new Yakini();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Kullanici yakinlik kutucuguna ilgili derecesini girer.")
    public void kullanici_yakinlik_kutucuguna_ilgili_derecesini_girer() {
        yakini.yakinlikBox.click();
        yakini.babaValue.click();
        //WebElement dropdownYakinlikElementi= driver.findElement(By.id("input_hr_step3_family1_relation"));
        //Select select= new Select(dropdownYakinlikElementi);
        //select.selectByVisibleText("Baba");
        actions.keyDown("Baba").click().perform();
    }
    @Given("Kullanici Ad Soyad bilgilerini girer.")
    public void kullanici_ad_soyad_bilgilerini_girer() {
        yakini.adSoyadBox.click();
        actions.sendKeys("Erdal Akgun").perform();
    }
    @Given("Kullanici Dogum tarihini girer.")
    public void kullanici_dogum_tarihini_girer() {
        yakini.dogumTarihiBox.click();
        yakini.dogumTarihiBox.sendKeys(faker.date().birthday().toString());
    }
    @Given("Kullanici cinsi bilgilerini girer.")
    public void kullanici_cinsi_bilgilerini_girer() {

    }
    @Given("Kullanici uyrugunu girer.")
    public void kullanici_uyrugunu_girer() {

    }
    @Given("Kullanici telefon numarasini girer.")
    public void kullanici_telefon_numarasini_girer() {

    }
    @Given("Kullanici eposta adresini girer.")
    public void kullanici_eposta_adresini_girer() {

    }
    @Given("Kullanici bulundugu ili girer.")
    public void kullanici_bulundugu_ili_girer() {

    }
    @Given("Kullanici bulundugu ilceyi girer.")
    public void kullanici_bulundugu_ilceyi_girer() {

    }
    @Given("Kullanici bulundugu semti girer.")
    public void kullanici_bulundugu_semti_girer() {

    }
    @Given("Kullanici ikamet adresini girer.")
    public void kullanici_ikamet_adresini_girer() {

    }
    @Given("Kullanici tahsil durumunu girer.")
    public void kullanici_tahsil_durumunu_girer() {

    }
    @Given("Kullanici meslegini girer.")
    public void kullanici_meslegini_girer() {

    }
    @Given("Kullanici calistigi kurumu girer.")
    public void kullanici_calistigi_kurumu_girer() {

    }
    @Given("Kullanici yetenek ve ilgi alanlarini girer.")
    public void kullanici_yetenek_ve_ilgi_alanlarini_girer() {

    }
    @Given("Kullanici ileribir butonuna tiklar")
    public void kullanici_ileribir_butonuna_tiklar() {

    }


}
