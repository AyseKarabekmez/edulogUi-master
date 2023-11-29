package stepdefinitions.insanKaynaklariStepDef;

import io.cucumber.java.en.Given;
import pages.insanKaynaklariKayit.EkBilgiler1;

public class ekBilgiler1StepDef {
    EkBilgiler1 ekBilgiler = new EkBilgiler1();

    @Given("Kullanici {string} textbox'a bilgi girer.")
    public void kullanici_alerji_hassasiyet_namebox_a_bilgi_girer() {
        ekBilgiler.AlerjiNameBox();
    }

    @Given("EkBilgiler Sürekli Kullandığı ilaç textbox'a ilaç bilgisi girilir")
    public void ek_bilgiler_surekli_kullandigi_ilac_namebox_a_ilac_bilgisi_girilir() {
        ekBilgiler.surekliKullandigiilaclar();
    }

    @Given("EkBilgiler Açıklama textbox'a açıklama bilgisi girilir")
    public void ek_bilgiler_aciklama_namebox_a_aciklama_bilgisi_girilir() {
        ekBilgiler.aciklama2();
    }

    @Given("EkBilgiler {string} textbox'a açıklama girilir")
    public void ek_bilgiler_ilgi_yetenek_namebox_a_aciklama_girilir() {
        ekBilgiler.ilgiYetenekGiris();
    }

    @Given("EkBilgiler {string} Bölümüne belge yüklemesi yapılır.")
    public void ek_bilgiler_basari_lisans_bolumune_belge_yuklemesi_yapilir() {
        ekBilgiler.basari_Lisans();
    }

    @Given("EkBilgiler Geliş Şekli textbox'a açıklama girilir.")
    public void ek_bilgiler_gelis_sekli_namebox_a_aciklama_girilir() {
       ekBilgiler.gelisSekli();
    }

    @Given("EkBilgiler Referans textbox'a açıklama girilir.")
    public void ek_bilgiler_referans_namebox_a_aciklama_girilir() {
       ekBilgiler.referansGir();
    }

    @Given("EkBilgiler {string} textbox'a açıklama girilir.")
    public void ek_bilgiler_namebox_a_aciklama_girilir(String string) {
     ekBilgiler.aciklamaGir3();
    }

    @Given("Kaydet Butonu tıklanır.")
    public void kaydet_butonu_tiklanir() {
      ekBilgiler.kaydetButton();
    }

    @Given("Kayıt işleminin Başarılı oldugu doğrulanır.")
    public void kayit_isleminin_basarili_oldugu_doğrulanir() {
      ekBilgiler.kayit_basarili();
    }
}
