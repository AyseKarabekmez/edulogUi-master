package stepdefinitions.halklaIliskilerKayitStepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import pages.halklaIliskilerKayit.Aile;
import utilities.ReusableMethods;

public class AileStepDef {
    Faker faker =new Faker();
    Aile aile=new Aile();
    @Given("Ogrenciye Yakinlik Derecesi  secilir.")
    public void ogrenciye_yakinlik_derecesi_secilir() {
        aile.AileYakinlikDropdownElementi.click();
        ReusableMethods.waitFor(2);
        aile.AileYakinlikAnneElementi.click();
        ReusableMethods.waitFor(2);
    }

    @Given("Ogrenci Yakininin Ad Soyad Bilgileri girilir.")
    public void ogrenci_yakininin_ad_soyad_bilgileri_girilir() {
        aile.AileAdSoyadTextElementi.click();
        ReusableMethods.waitFor(2);
        aile.AileAdSoyadTextElementi.sendKeys(faker.name().fullName());
        ReusableMethods.waitFor(2);
    }

    @Given("Ogrenci Yakininin TC Kimlik nosu girilir.")
    public void ogrenci_yakininin_tc_kimlik_nosu_girilir() {
        aile.AileTCKimlikNoTextElementi.click();
        ReusableMethods.waitFor(2);
        aile.AileTCKimlikNoTextElementi.sendKeys(ReusableMethods.generateRandomTc());
        ReusableMethods.waitFor(2);
    }
    @Given("Ogrenci Yakininin Dogum Tarihi girilir.")
    public void ogrenci_yakininin_dogum_tarihi_girilir() {
        aile.AileDogumTarihiTableElementi.click();
        ReusableMethods.waitFor(2);
        aile.AileDogumTarihiTableElementi.sendKeys(faker.date().birthday().toString());
        ReusableMethods.waitFor(2);
    }
    @Given("Ogrenci Yakininin Cinsiyeti  secilir.")
    public void ogrenci_yakininin_cinsiyeti_secilir() {
        aile.AileCinsiyetDropdownElementi.click();
        ReusableMethods.waitFor(2);
        aile.AileCinsiyetFemaleElementi.click();
        ReusableMethods.waitFor(2);
    }
    @Given("Ogrenci Yakininin Kan grubu  Bilgileri Kan Grubu Listesinden  secilir.")
    public void ogrenci_yakininin_kan_grubu_bilgileri_kan_grubu_listesinden_secilir() {
        aile.AileKanGrubuDropdownElementi.click();
        ReusableMethods.waitFor(2);
        aile.AileKanGrubuARHPLUSElementi.click();
        ReusableMethods.waitFor(2);
    }
    @Given("Ogrenci Yakininin Uyruk Bilgileri Listesinden  secilir.")
    public void ogrenci_yakininin_uyruk_bilgileri_listesinden_secilir() {
        aile.AileUyrukDropdownElementi.click();
        ReusableMethods.waitFor(2);
        aile.AileUyrukTurkiyeElementi.click();
        ReusableMethods.waitFor(2);

        //uyruk seciminin locateini alamiyorum
    }
    @Given("Ogrenci Yakininin Telefon No girilir.")
    public void ogrenci_yakininin_telefon_no_girilir() {
       aile.AileTelefonBoxElementi.click();
        ReusableMethods.waitFor(2);
        aile.AileTelefonBoxElementi.sendKeys(faker.phoneNumber().phoneNumber());
        ReusableMethods.waitFor(2);
    }
    @Given("Ogrenci Yakininin e-posta adresi girilir.")
    public void ogrenci_yakininin_e_posta_adresi_girilir() {
       aile.AileEpostaBoxElementi.click();
        ReusableMethods.waitFor(2);
        aile.AileEpostaBoxElementi.sendKeys(faker.internet().emailAddress());
        ReusableMethods.waitFor(2);
    }

    @Given("Ogrenci Yakininin Tahsil Bilgileri Tahsil Seceneklerinden secilir.")
    public void ogrenci_yakininin_tahsil_bilgileri_tahsil_seceneklerinden_secilir() {
        aile.AileTahsilElementi.click();
        ReusableMethods.waitFor(2);
        aile.AileTahsilPrimarySchoolElementi.click();
        ReusableMethods.waitFor(2);

    }
    @Given("Ogrenci Yakininin Meslek Bilgisi girilir.")
    public void ogrenci_yakininin_meslek_bilgisi_girilir() {
        aile.AileMeslekTextBoxElementi.sendKeys(faker.business().toString()+ Keys.ENTER);
        ReusableMethods.waitFor(2);

    }
    @Given("Ogrenci Yakininin FirmaKurum Bilgisi girilir.")
    public void ogrenci_yakininin_firmakurum_bilgisi_girilir() {
        aile.AileFirmaKurumBilgisiElementi.sendKeys(faker.business().toString()+Keys.ENTER);
        ReusableMethods.waitFor(2);
    }

    @Given("Ogrenci Ileri butonuna basar.")
    public void ogrenci_ileri_butonuna_basar() {
        aile.AileIleriButtonElementi.click();

    }
}
