package stepdefinitions.insanKaynaklariStepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import pages.insanKaynaklariKayit.Egitim1;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class insanKaynaklariEgitimStepDef {
    Egitim1 egitim1Page = new Egitim1();
    Faker faker = new Faker();


    @Given("Kullanici egitim duzeyini girer")
    public void kullanici_egitim_duzeyini_girer() {
        egitim1Page.egitimDuzeyiTextBox.click();
        String egitimDuzeyiBilgisi = faker.lorem().word();
        egitim1Page.egitimDuzeyiTextBox.sendKeys(egitimDuzeyiBilgisi + Keys.ENTER);
        ReusableMethods.wait2(2);

    }
    @Given("Kullanici bölüm kutusuna ilgili bölümünü girer")
    public void kullanici_bölüm_kutusuna_ilgili_bölümünü_girer() {
        egitim1Page.bölümTextBox.click();
        String bolumBilgisi = faker.lorem().word();
        egitim1Page.bölümTextBox.sendKeys(bolumBilgisi+Keys.ENTER);
        ReusableMethods.wait(2);
    }
    @Given("Kullanici Mezuniyet Tarihi kutusuna ilgli tarihi girer")
    public void kullanici_mezuniyet_tarihi_kutusuna_ilgli_tarihi_girer() {
      egitim1Page.mezuniyetTarihiTextBox.click();
        ReusableMethods.waitFor(3);
       egitim1Page.mezuniyetTarihiTextBox.sendKeys(faker.date().birthday().toString());
          ReusableMethods.wait(2);
    }
    @Given("Kullanici diploma kutusuna {string} yükler")
    public void kullanici_diploma_kutusuna_yükler(String diplomayi) {


        String dosyaYolupath ="/yuklenenBelgeler/WhatsApp Image 2023-11-24 at 02.12.26.jpeg";
        String farkliOlan = System.getProperty("user.dir");
        String dosyaYolu = farkliOlan+dosyaYolupath;
        egitim1Page.diplomaYuklemeTextBox.sendKeys(dosyaYolu);
        ReusableMethods.wait(2);

    }
    @Given("Kullanici ek  acıklama  kutusuna ilgili acıklama bilgisi girer.")
    public void kullanici_ek_acıklama_kutusuna_ilgili_acıklama_bilgisi_girer() {
        egitim1Page.diplomaEkAciklamaTextBox.click();

        String diplomaEkaciklama = faker.lorem().paragraph();
       egitim1Page.diplomaEkAciklamaTextBox.sendKeys(diplomaEkaciklama+ Keys.ENTER);
        ReusableMethods.wait2(2);

    }
    @Given("Kullanici Belgeler kutusuna ilgili belge bilgisi girilir")
    public void kullanici_belgeler_kutusuna_ilgili_belge_bilgisi_girilir() {
       egitim1Page.belgelerTextbox.click();
        String belgelerBilgi = faker.lorem().sentence();
       egitim1Page.belgelerTextbox.sendKeys(belgelerBilgi+ Keys.ENTER);
        ReusableMethods.wait2(2);
    }
    @Given("Kullanici Belge yükleme kutusuna ilgili {string} yükler")
    public void kullanici_belge_yükleme_kutusuna_ilgili_yükler(String belgeyi) {


        String dosyaYolupath1 ="/yuklenenBelgeler/WhatsApp Image 2023-11-24 at 02.12.26.jpeg";
        String farkliOlan1 = System.getProperty("user.dir");
        String dosyaYolu1 = farkliOlan1+dosyaYolupath1;
        egitim1Page.belgelerYuklemeTextbox.sendKeys(dosyaYolu1);
    }
    @Given("Kullanici belgeler ek açıklama kısmına ilgili acıklama bilgisi girer.")
    public void kullanici_belgeler_ek_açıklama_kısmına_ilgili_acıklama_bilgisi_girer() {
        egitim1Page.belgelerEkAciklamaTextbox.click();
        String belgeEkAciklama= faker.lorem().paragraph();
        egitim1Page.belgelerEkAciklamaTextbox.sendKeys(belgeEkAciklama+Keys.ENTER);
        ReusableMethods.wait(2);

    }
    @Given("Kullanici doldurulması zorunlu olan alanlara gerekli bilgileri girdikten sonra ileri ikonuna basar")
    public void kullanici_doldurulması_zorunlu_olan_alanlara_gerekli_bilgileri_girdikten_sonra_ileri_ikonuna_basar() {
    egitim1Page.ileriButton.click();
    }


}
