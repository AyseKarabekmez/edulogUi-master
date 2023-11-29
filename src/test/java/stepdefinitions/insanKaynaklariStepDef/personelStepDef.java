package stepdefinitions.insanKaynaklariStepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import pages.insanKaynaklariKayit.Personel;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class personelStepDef {


    Faker faker = new Faker();
    Personel personel = new Personel();


    @Given("Nawbar dan İnsan Kaynak ları kayıt tıklar")
    public void nawbar_dan_insan_kaynak_ları_kayıt_tıklar() {
        personel.InsanKaynakları.click();

    }

    @Given("Kullanici acilan dropdown dan  {string} bölümüne tıklar")
    public void kullanici_acilan_dropdown_dan_bölümüne_tıklar(String string) {
        personel.InsanKaynaklarıKayıt.click();

    }

    @Given("Kullanıcı sağ tarafta açılan ekrandan personel görevini tıklar")
    public void kullanıcı_sağ_tarafta_açılan_ekrandan_personel_görevini_tıklar() {
        personel.personelGoreviBox.click();
    }

    @Given("Kullanıcı ekrana çıkan dropdown dan uygun olanı seçer")
    public void kullanıcı_ekrana_çıkan_dropdown_dan_uygun_olanı_seçer() {
        personel.personelGoreviParent.click();
        ReusableMethods.wait2(2);
    }

    @Given("Kullanici Namebox kutusunu tıklar")
    public void kullanici_namebox_kutusunu_tıklar() {
        ReusableMethods.wait2(2);
        personel.personelAdSoyadBox.click();
    }

    @Given("Kullanıcı Namebox kutusuna ad ve soyadını girer")
    public void kullanıcı_namebox_kutusuna_ad_ve_soyadını_girer() {
        ReusableMethods.wait2(2);
        personel.personelAdSoyadBox.sendKeys(faker.name().fullName());
    }

    @Given("Kullanıcı TC.kimlik No kutusunu tıklar")
    public void kullanıcı_tc_kimlik_no_kutusunu_tıklar() {
        personel.personelTcKimlikNoBox.click();

    }

    @Given("Kullanıcı TC.kimlik No kutusuna geçerli TC kimlik no.sunu girer.")
    public void kullanıcı_tc_kimlik_no_kutusuna_geçerli_tc_kimlik_no_sunu_girer() {
        ReusableMethods.wait2(2);
        personel.personelTcKimlikNoBox.sendKeys(ReusableMethods.generateRandomTc());

    }

    @Given("Kullanıcı doğum tarihini kutusunu tıklar.")
    public void kullanıcı_doğum_tarihini_kutusunu_tıklar() {
        personel.personelDogumTarihiBox.click();
    }

    @Given("Kullanıcı doğum tarihini girer.")
    public void kullanıcı_doğum_tarihini_girer() {
        ReusableMethods.wait2(2);
        personel.personelDogumTarihiBox.sendKeys(faker.date().birthday().toString());

    }

    @Given("Kullanıcı Cinsiyet alanını tıklar")
    public void kullanıcı_cinsiyet_alanını_tıklar() {
        personel.personelCinsiyetBox.click();

    }

    @Given("Kullanıcı Cinsiyet alanından seçimini yapar")
    public void kullanıcı_cinsiyet_alanından_seçimini_yapar() {
        ReusableMethods.wait2(2);
        personel.personelCinsiyetF.click();

    }

    @Given("Kullanıcı Kan Grubu kutusunu tıklar ve açılan drapdown dan kan grubunu seçer")
    public void kullanıcı_kan_grubu_kutusunu_tıklar_ve_açılan_drapdown_dan_kan_grubunu_seçer() {
        ReusableMethods.wait2(2);
        personel.personelKanGrubuBox.click();
        personel.personelKanGrubuAB_RH_PLUS.click();
    }

    @Given("Kullanıcı Telefon kutusunu tıklar ve telefon numarasını girer.")
    public void kullanıcı_telefon_kutusunu_tıklar_ve_telefon_numarasını_girer() {
        ReusableMethods.wait2(2);
        personel.personelTelefonBox.click();
        personel.personelTelefonBox.sendKeys(faker.phoneNumber().cellPhone());

    }

    @Given("Kullanıcı E-posta kutusunu tıklar ve e-posta adresini geçerli bir şekilde girer")
    public void kullanıcı_e_posta_kutusunu_tıklar_ve_e_posta_adresini_geçerli_bir_şekilde_girer() {
        ReusableMethods.wait2(2);
        personel.personelEmailBox.click();
        personel.personelEmailBox.sendKeys(faker.internet().emailAddress());

    }

    @Given("Kullanıcı zorunlu olan  alanlardan ikamet ettiği İl i seçmelidir")
    public void kullanıcı_zorunlu_olan_alanlardan_ikamet_ettiği_il_i_seçmelidir() {
        ReusableMethods.wait2(2);
        personel.personelIllBox.click();
        personel.personelIllAdana.click();

    }

    @Given("Kullanıcı zorunlu olan alanlardan ikamet ettiği İlçe yi seçmelidir")
    public void kullanıcı_zorunlu_olan_alanlardan_ikamet_ettiği_ilçe_yi_seçmelidir() {
        ReusableMethods.wait2(2);
        personel.personelIlceBox.click();
        personel.personelIlceCukurova.click();

    }

    @Given("Kullanıcı zorunlu olan alanlardan Semt i seçmelidir")
    public void kullanıcı_zorunlu_olan_alanlardan_semt_i_seçmelidir() {
        ReusableMethods.wait2(2);
        personel.personelSemtBox.click();
        personel.personelSemtYesilyurtMahallesi.click();


    }

    @Given("Kullanıcı zorunlu olan alanlardan Adres bilgilerini girebilmelidir")
    public void kullanıcı_zorunlu_olan_alanlardan_adres_bilgilerini_girebilmelidir() {
        ReusableMethods.wait2(2);
        personel.personelAdresBox.click();
        personel.personelAdresBox.sendKeys(faker.address().fullAddress());
    }

    @Given("Kullanıcı Kademe alanını tıklar ve açılan drapdown dan uygun")
    public void kullanıcı_kademe_alanını_tıklar_ve_açılan_drapdown_dan_uygun() {
        ReusableMethods.wait2(2);
        personel.personelkademeBox.click();
        personel.personelkademegeneral.click();
    }

    @Given("Kullanici maas kutusunu tıklar ve kendine uygun bilgileri girer.")
    public void kullanici_maas_kutusunu_tıklar_ve_kendine_uygun_bilgileri_girer() {
        ReusableMethods.wait2(2);

        personel.personelMaasBox.click();
        personel.personelMaasBox.sendKeys(faker.number().toString());
        personel.personelMaasSecimiBox.click();
        personel.personelMaasSecimiNet.click();
    }
    @Given("kullanıcı {string} ye uygun dosyayı yukler")
    public void kullanıcı_cv_ye_uygun_dosyayı_yukler(String CV) {

        ReusableMethods.wait2(2);
        String dosyaYolupath ="/yuklenenBelgeler/Yazilim_Test_Plani.pdf";
        String farkliOlan = System.getProperty("user.dir");
        String dosyaYolu = farkliOlan+dosyaYolupath;
        personel.personelcv.sendKeys(dosyaYolu);

        ReusableMethods.wait2(2);
        String dosyaYolupath2 = "/yuklenenBelgeler/Yazilim_Test_Plani.pdf";
        String farkliOlan2 = System.getProperty("user.dir");
        String dosyaYolu2 = farkliOlan+dosyaYolupath;
        personel.personellimlik.sendKeys(dosyaYolu2);

        ReusableMethods.wait2(2);
        String dosyaYolupath3 = "/yuklenenBelgeler/Yazilim_Test_Plani.pdf";
        String farkliOlan3 = System.getProperty("user.dir");
        String dosyaYolu3 = farkliOlan+dosyaYolupath;
        personel.personelsözlesme.sendKeys(dosyaYolu3);

        ReusableMethods.wait2(2);
        String dosyaYolupath4 = "/yuklenenBelgeler/Yazilim_Test_Plani.pdf";
        String farkliOlan4 = System.getProperty("user.dir");
        String dosyaYolu4 = farkliOlan+dosyaYolupath;
        personel.personelresmiEvrak.sendKeys(dosyaYolu3);

    }



    @Given("Kullanici personelin zorunlu alanlarını girdikten sonra ileri butonuna tıklar")
    public void kullanici_personelin_zorunlu_alanlarını_girdikten_sonra_ileri_butonuna_tıklar() {
        ReusableMethods.wait2(2);
        personel.IleriButonu.click();

    }



}
