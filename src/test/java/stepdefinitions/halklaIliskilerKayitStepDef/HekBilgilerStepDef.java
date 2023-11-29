package stepdefinitions.halklaIliskilerKayitStepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.halklaIliskilerKayit.HekBilgiler;
import utilities.Driver;
import utilities.ReusableMethods;


public class HekBilgilerStepDef {

    HekBilgiler hekBilgiler = new HekBilgiler();

    Faker faker = new Faker();

    @Given("Kullanici,ogrenci, ek bilgiler sayfasina basariyla ulastigini dogrular")
    public void kullanici_ogrenci_ek_bilgiler_sayfasina_basariyla_ulastigini_dogrular() {
        Assert.assertTrue(hekBilgiler.hEkBilgilerEkBilgiler.isDisplayed());
        ReusableMethods.wait2(2);
    }

    @Given("Kullanici,Alerji hassasiyeti kutusuna bilgi ekler.")
    public void kullanici_alerji_hassasiyeti_kutusuna_bilgi_ekler() {
        hekBilgiler.hEkBilgilerAlerjiHassasiyetbox.click();
        String alerjiHassasiyet = faker.lorem().word();
        hekBilgiler.hEkBilgilerAlerjiHassasiyetbox.sendKeys(alerjiHassasiyet + Keys.ENTER);
        ReusableMethods.wait2(2);
    }

    @Given("Kullanici,Surekli kullandigi ilac kutusuna ilac Bilgisi ekler.")
    public void kullanici_surekli_kullandigi_ilac_kutusuna_ilac_bilgisi_ekler() {
        hekBilgiler.hEkBilgilerSurekliKullandigiIlacBox.click();
        String surekliKullandigiIlac = faker.lorem().word();
        hekBilgiler.hEkBilgilerSurekliKullandigiIlacBox.sendKeys(surekliKullandigiIlac + Keys.ENTER);
        ReusableMethods.wait2(2);
    }

    @Given("Kullanici,Saglik Aciklamasi kutusuna Aciklama ekler.")
    public void kullanici_saglik_aciklamasi_kutusuna_aciklama_ekler() {
        hekBilgiler.hEkBilgilerSaglikAciklamaBox.click();
        String saglikAciklama = faker.lorem().paragraph();
        hekBilgiler.hEkBilgilerSurekliKullandigiIlacBox.sendKeys(saglikAciklama);
        ReusableMethods.wait2(2);
    }

    @Given("Kullanici,İlgilendigi Spor Sanat Dali kutusuna Spor Sanat Bilgisi ekler.")
    public void kullanici_ilgilendigi_spor_sanat_dali_kutusuna_spor_sanat_bilgisi_ekler() {
        hekBilgiler.hEkBilgilerIlgilendigiSporSanatDaliBox.click();
        String ilgilendigiSporSanatDali = faker.lorem().word();
        hekBilgiler.hEkBilgilerIlgilendigiSporSanatDaliBox.sendKeys(ilgilendigiSporSanatDali + Keys.ENTER);
        ReusableMethods.wait2(2);
    }

    @Given("Kullanici,Basari Lisans Kutusu'na Basari Lisans Bilgisi ekler.")
    public void kullanici_basari_lisans_kutusu_na_basari_lisans_bilgisi_ekler() {
        hekBilgiler.hEkBilgilerBasariLisansBox.click();
        String basariLisansBilgisi = faker.lorem().word();
        hekBilgiler.hEkBilgilerBasariLisansBox.sendKeys(basariLisansBilgisi + Keys.ENTER);
        ReusableMethods.wait2(2);
    }


    @Given("Kullanici,İlgi Alani Aciklama kutusuna Aciklama ekler.")
    public void kullanici_ilgi_alani_aciklama_kutusuna_aciklama_ekler() {
        hekBilgiler.hEkBilgilerIlgiAlaniBox.click();
        String ilgiAlani = faker.lorem().paragraph();
        hekBilgiler.hEkBilgilerIlgiAlaniBox.sendKeys(ilgiAlani);
        ReusableMethods.wait2(2);
    }

    @Given("Kullanici,Gelis Sekli kutusuna Gelis Sekli Bilgisi ekler.")
    public void kullanici_gelis_sekli_kutusuna_gelis_sekli_bilgisi_ekler() {
        hekBilgiler.hEkBilgilerGelisSekliBox.click();
        String gelisSekli = faker.lorem().sentence();
        hekBilgiler.hEkBilgilerBasariLisansBox.sendKeys(gelisSekli + Keys.ENTER);
        ReusableMethods.wait2(2);
    }

    @Given("Kullanici,Referans kutusuna Referans Bilgisi ekler.")
    public void kullanici_referans_kutusuna_referans_bilgisi_ekler() {
        hekBilgiler.hEkBilgilerReferansBox.click();
        String referansBilgisi = faker.name().fullName();
        hekBilgiler.hEkBilgilerReferansBox.sendKeys(referansBilgisi + Keys.ENTER);
        ReusableMethods.wait2(2);

    }

    @Given("Kullanici,Ozel Notlar kutusuna Ozel Not ekler.")
    public void kullanici_ozel_notlar_kutusuna_ozel_not_ekler() {
        hekBilgiler.hEkBilgilerOzelNotlar.click();
        String ozelNotlar = faker.lorem().paragraph();
        hekBilgiler.hEkBilgilerReferansBox.sendKeys(ozelNotlar);
        ReusableMethods.wait2(2);
    }

    @Given("Kullanici,EkBilgilerileri butonuna tiklar.")
    public void kullanici_ek_bilgilerileri_butonuna_tiklar() {
        hekBilgiler.hEkBilgilerIleri.click();


    }

    @Given("Kullanici,Finans bolumune gecildigini dogrular.")
    public void kullanici_finans_bolumune_gecildigini_dogrular() {
        Assert.assertTrue(hekBilgiler.hEkBilgilerFinans.isDisplayed());
        ReusableMethods.wait2(2);
    }

    @Given("Kullanici,Sayfayi kapatir.")
    public void kullanici_sayfayi_kapatir() {
        Driver.closeDriver();
    }


    @Given("Kullanici Alerji hassasiyeti kutusu bilgisini siler.")
    public void kullanici_alerji_hassasiyeti_kutusu_bilgisini_siler() {
     ReusableMethods.cleanByJs(hekBilgiler.hEkBilgilerAlerjiHassasiyetbox);
    }
    @Given("Kullanici,Alerji hassasiyeti kutusunun bos oldugunu dogrular.")
    public void kullanici_alerji_hassasiyeti_kutusunun_bos_oldugunu_dogrular() {
    }
    }







