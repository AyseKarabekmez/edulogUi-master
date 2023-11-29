package stepdefinitions.halklaIliskilerKayitStepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import pages.halklaIliskilerKayit.Ogrenci;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class OgrenciStepDefinitions {

    Faker faker = new Faker();

    Ogrenci ogrenci=new Ogrenci();

    @Given("Kullanici, siteye login olur")
    public void kullanici_siteye_login_olur() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ogrenci.grisTelefonBox.click();
        ReusableMethods.waitFor(2);
        ogrenci.grisTelefonBox.sendKeys(ConfigReader.getProperty("telefon"));
        ReusableMethods.waitFor(2);
        ogrenci.girisDevamIkon.click();
        ogrenci.girisDogrulamaKoduAlani.click();
        ReusableMethods.waitFor(2);
        ogrenci.girisDogrulamaKoduAlani.sendKeys(ConfigReader.getProperty("dogrulamaKodu"));
        ogrenci.girisGirisIkonu.click();
    }
    @Given("Kullanici, acilan sayfadaki panelden {string} Yazisina tiklar")
    public void kullanici_acilan_sayfadaki_panelden_yazisina_tiklar(String string) {
        ReusableMethods.waitFor(2);
        ogrenci.ogrenciHalklaIliskilerYazisi.click();
    }
    @Given("Kullanici, Halkla İliskiler Yazisinin altinda acilan basliklardan {string} yazisina tiklar")
    public void kullanici_halkla_iliskiler_yazisinin_altinda_acilan_basliklardan_yazisina_tiklar(String string) {
        ReusableMethods.waitFor(2);
        ogrenci.ogrenciKayit.click();
    }
    @Given("Kullanici, Ogrenci Ad-Soyad alanina isim ve soy isim bilgilerini girer")
    public void kullanici_ogrenci_ad_soyad_alanina_isim_ve_soy_isim_bilgilerini_girer() {
        ReusableMethods.waitFor(2);
        ogrenci.ogrenciAdSoyadBox.click();
        ReusableMethods.waitFor(2);
        ogrenci.ogrenciAdSoyadBox.sendKeys(faker.name().fullName());
    }
    @Given("Kullanici, Ogrenci TC Kimlik No alanina TC Kimlik No bilgisini girer")
    public void kullanici_ogrenci_tc_kimlik_no_alanina_tc_kimlik_no_bilgisini_girer() {
        ReusableMethods.waitFor(2);
        ogrenci.ogrenciTcKimlikBox.click();
        ReusableMethods.waitFor(4);
        ogrenci.ogrenciTcKimlikBox.sendKeys(ReusableMethods.generateRandomTc());
    }
    @Given("Kullanici, Ogrenci Dogum Tarihi alanina Dogum Tarihi bilgisini girer")
    public void kullanici_ogrenci_dogum_tarihi_alanina_dogum_tarihi_bilgisini_girer() {
        ReusableMethods.waitFor(2);
        ogrenci.ogrenciDogumTarihiBox.click();
        ReusableMethods.waitFor(2);
        ogrenci.ogrenciDogumTarihiBox.sendKeys(faker.date().birthday().toString());
    }
    @Given("Kullanici, Ogrenci Cinsiyet alanindaki seceneklerden kendisine uygun olani secer")
    public void kullanici_ogrenci_cinsiyet_alanindaki_seceneklerden_kendisine_uygun_olani_secer() {
        ReusableMethods.waitFor(2);
        ogrenci.ogrenciCinsiyetBox.click();
        ReusableMethods.waitFor(2);
        ogrenci.ogrenciCinsiyetTercihi.click();
    }
    @Given("Kullanici, Ogrenci Kan Grubu alanindaki seceneklerden kendisine uygun olani secer")
    public void kullanici_ogrenci_kan_grubu_alanindaki_seceneklerden_kendisine_uygun_olani_secer() {
        ReusableMethods.waitFor(2);
        ogrenci.ogrenciKanGrubuBox.click();
        ReusableMethods.waitFor(2);
        ogrenci.ogrenciKanGrubuTercihi.click();
    }
    @Given("Kullanici, Ogrenci Uyruk alanindaki seceneklerden kendisine uygun olani secer")
    public void kullanici_ogrenci_uyruk_alanindaki_seceneklerden_kendisine_uygun_olani_secer() {
        ReusableMethods.waitFor(2);
        ogrenci.ogrenciUyrukBox.click();
        ReusableMethods.waitFor(2);
        ogrenci.ogrenciUyrukTercihi.click();
    }
    @Given("Kullanici, Ogrenci Telefon alanina; Telefon numarasi bilgisini girer")
    public void kullanici_ogrenci_telefon_alanina_telefon_numarasi_bilgisini_girer() {
        ReusableMethods.waitFor(2);
        ogrenci.ogrenciTelBox.click();
        ReusableMethods.waitFor(2);
        ogrenci.ogrenciTelBox.sendKeys(faker.phoneNumber().phoneNumber());
    }
    @Given("Kullanici, Ogrenci E-Posta alanina; E-Posta bilgisini girer")
    public void kullanici_ogrenci_e_posta_alanina_e_posta_bilgisini_girer() {
        ReusableMethods.waitFor(2);
        ogrenci.ogrenciEPostaBox.click();
        ReusableMethods.waitFor(2);
        ogrenci.ogrenciEPostaBox.sendKeys(faker.internet().emailAddress());
    }
    @Given("Kullanici, Ogrenci İl alanindaki seceneklerden ikamet ettigi İl'i secer")
    public void kullanici_ogrenci_il_alanindaki_seceneklerden_ikamet_ettigi_il_i_secer() {
        ReusableMethods.waitFor(2);
        ogrenci.ogrenciIlBox.click();
        ReusableMethods.waitFor(2);
        ogrenci.ogrenciIlAdana.click();
    }
    @Given("Kullanici, Ogrenci İlce alanindaki seceneklerden ikamet ettigi İlce'yi secer")
    public void kullanici_ogrenci_ilce_alanindaki_seceneklerden_ikamet_ettigi_ilce_yi_secer() {
        ReusableMethods.waitFor(2);
        ogrenci.ogrenciIlceBox.click();
        ReusableMethods.waitFor(2);
        ogrenci.ogrencIlceCukurova.click();
    }
    @Given("Kullanici, Ogrenci Semt alanindaki seceneklerden ikamet ettigi Semt'i secer")
    public void kullanici_ogrenci_semt_alanindaki_seceneklerden_ikamet_ettigi_semt_i_secer() {
        ReusableMethods.waitFor(2);
        ogrenci.ogrenciSemtBox.click();
        ReusableMethods.waitFor(2);
        ogrenci.ogrenciSemtTorosMahallesi.click();
    }
    @Given("Kullanici, Ogrenci Adres alanina; ikamet ettigi Adres bilgisini girer")
    public void kullanici_ogrenci_adres_alanina_ikamet_ettigi_adres_bilgisini_girer() {
        ReusableMethods.waitFor(2);
        ogrenci.ogrenciAdresBox.click();
        ReusableMethods.waitFor(2);
        ogrenci.ogrenciAdresBox.sendKeys(faker.address().fullAddress());
    }
    @Given("Kullanici, Ogrenci gerekli bilgilerini girdikten sonra {string} ikonuna basar")
    public void kullanici_ogrenci_gerekli_bilgilerini_girdikten_sonra_ikonuna_basar(String string) {
        ReusableMethods.waitFor(3);
        ogrenci.ogrenciIleriIkonu.click();
    }
}
