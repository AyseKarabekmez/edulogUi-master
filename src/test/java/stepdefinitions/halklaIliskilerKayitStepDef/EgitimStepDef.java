package stepdefinitions.halklaIliskilerKayitStepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.halklaIliskilerKayit.Egitim;
import utilities.Driver;
import utilities.ReusableMethods;

public class EgitimStepDef {

    Egitim egitim = new Egitim();
    Faker faker = new Faker();
    Actions action = new Actions(Driver.getDriver());


    @When("Kullanici Sezon bolumune tiklar")
    public void kullaniciSezonBolumuneTiklar() {
        ReusableMethods.waitFor(2);
        egitim.EgitimSezon.click();
    }

    @When("Kullanici Sezon secimi yapar.")
    public void kullaniciSezonSecimiYapar() {
        ReusableMethods.waitFor(2);
        egitim.EgitimSezonSecimi.click();
    }

    @When("Kullanici Sinif bolumune tiklar.")
    public void kullaniciSinifBolumuneTiklar() {
        ReusableMethods.waitFor(2);
        egitim.EgitimSinif.click();
    }

    @When("Kullanici sinif secimi yapar.")
    public void kullaniciSinifSecimiYapar() {
        ReusableMethods.waitFor(2);
        egitim.EgitimSinifSecimi.click();
    }

    @When("Kullanici Alan bolumune tiklar.")
    public void kullaniciAlanBolumuneTiklar() {
        ReusableMethods.waitFor(2);
        egitim.EgitimAlan.click();
    }

    @When("Kullanici Alan secimi yapar.")
    public void kullaniciAlanSecimiYapar() {
        ReusableMethods.waitFor(2);

        egitim.EgitimAlanSecimi.click();
    }

    @When("Kullanici Sube bolumune tiklar.")
    public void kullaniciSubeBolumuneTiklar() {
        ReusableMethods.waitFor(2);
        egitim.EgitimSube.click();
    }

    @When("Kullanici Sube secimi yapar.")
    public void kullaniciSubeSecimiYapar() {
        ReusableMethods.waitFor(2);
        egitim.EgitimSubeSecimi.click();

    }


    @When("Kullanici Ogrenci No bolumune numara girer.")
    public void kullaniciOgrenciNoBolumuneNumaraGirer() {
        ReusableMethods.waitFor(2);
        egitim.EgitimOgrenciNo.click();
        egitim.EgitimOgrenciNo.sendKeys(faker.idNumber().toString());
    }

    @When("Kullanici Sorumlu Ogretmen bolumune tiklar")
    public void kullaniciSorumluOgretmenBolumuneTiklar() {
        ReusableMethods.waitFor(2);
        egitim.EgitimSorumluOgretmen.click();


    }

    @When("Kullanici Sorumlu Ogretmen secimi yapar.")
    public void kullaniciSorumluOgretmenSecimiYapar() {
        ReusableMethods.waitFor(2);
        egitim.EgitimSorumluOgretmenSecimi.click();

    }

    @When("Kullanici Bursluluk Sinav bolumune tiklar")
    public void kullaniciBurslulukSinavBolumuneTiklar() {
        ReusableMethods.waitFor(2);
        egitim.EgitimBurlulukSinavP.click();

    }

    @When("Kullanici Bursluluk Sinav puanini girer.")
    public void kullaniciBurslulukSinavPuaniniGirer() {
        ReusableMethods.waitFor(2);
        egitim.EgitimBurlulukSinavP.sendKeys("90");

    }


    @When("Kullanici Bursluluk Sinav dilimi bolumune tiklar.")
    public void kullaniciBurslulukSinavDilimiBolumuneTiklar() {
        ReusableMethods.waitFor(2);
        egitim.EgitimBurslulukSinavDilimi.click();
    }

    @When("Kullanici  Bursluluk Sinav dilimini girer.")
    public void kullaniciBurslulukSinavDiliminiGirer() {
        ReusableMethods.waitFor(2);
        egitim.EgitimBurslulukSinavDilimi.sendKeys("2");
    }

    @When("Kullanici Geldigi okul bolumune tiklar.")
    public void kullaniciGeldigiOkulBolumuneTiklar() {
        egitim.EgitimGeldigiOkul.click();

    }

    @When("Kullanici Geldigi okul bolumunu doldurur.")
    public void kullaniciGeldigiOkulBolumunuDoldurur() {
        egitim.EgitimGeldigiOkulSecimi.sendKeys(faker.educator().secondarySchool(), Keys.ENTER);


    }

    @When("Kullanici Meb Bursu bolumune tiklar")
    public void kullaniciMebBursuBolumuneTiklar() {
        ReusableMethods.waitFor(2);
        egitim.EgitimMebBurslu.click();
    }

    @When("Kullanici Meb Bursu secimi yapar.")
    public void kullaniciMebBursuSecimiYapar() {
        ReusableMethods.waitFor(2);
        egitim.EgitimMebBursuSecimi.click();

    }

    @When("Kullanici Tanima Calismasi Yapildi bolumune tiklar.")
    public void kullaniciTanimaCalismasiYapildiBolumuneTiklar() {
        ReusableMethods.waitFor(2);

        egitim.EgitimTaramaCalismasi.click();
    }

    @When("Kullanici Tanima Calismasi Puanini girer.")
    public void kullaniciTanimaCalismasiPuaniniGirer() {
        ReusableMethods.waitFor(2);
        egitim.EgitimTaramaCalismasi.sendKeys("90");
    }

    @When("Kullanici ileri tusuna basarak bilgileri kaydeder.")
    public void kullaniciIleriTusunaBasarakBilgileriKaydeder() {
        ReusableMethods.waitFor(2);
        egitim.EgitimIleriButonu.click();
        ReusableMethods.waitFor(2);
    }

    @When("Kullanici bilgilerin kaydedildigini dogrular.")
    public void kullaniciBilgilerinKaydedildiginiDogrular() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(egitim.AileYakinlik.isDisplayed());
        System.out.println(egitim.AileYakinlik.getText());


    }
}
