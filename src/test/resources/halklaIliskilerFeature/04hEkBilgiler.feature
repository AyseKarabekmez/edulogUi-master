Feature:US_05_Halkla İlişkiler Kayıt/Ek_Bilgiler_Test

  Scenario:TC_001_Halkla_İlişkiler_Kayıt_Ek_Bilgiler_doğru_eksiksiz_ve_belirtilen_şartlara_uygun_bir_şekilde_kaydedilmelidir.
    * Kullanici,ogrenci, ek bilgiler sayfasina basariyla ulastigini dogrular
    * Kullanici,Alerji hassasiyeti kutusuna bilgi ekler.
    * Kullanici,Surekli kullandigi ilac kutusuna ilac Bilgisi ekler.
    * Kullanici,Saglik Aciklamasi kutusuna Aciklama ekler.
    * Kullanici,İlgilendigi Spor Sanat Dali kutusuna Spor Sanat Bilgisi ekler.
    * Kullanici,Basari Lisans Kutusu'na Basari Lisans Bilgisi ekler.
    * Kullanici,İlgi Alani Aciklama kutusuna Aciklama ekler.
    * Kullanici,Gelis Sekli kutusuna Gelis Sekli Bilgisi ekler.
    * Kullanici,Referans kutusuna Referans Bilgisi ekler.
    * Kullanici,Ozel Notlar kutusuna Ozel Not ekler.
    * Kullanici,EkBilgilerileri butonuna tiklar.
    * Kullanici,Finans bolumune gecildigini dogrular.
    * Kullanici,Sayfayi kapatir.


  @svd
  Scenario:TC_002_Halkla_İlişkiler_Kayıt_Ek_Bilgiler_bos_bir_şekilde_kaydedilmelidir.

    * Kullanici,ogrenci, ek bilgiler sayfasina basariyla ulastigini dogrular
    * Kullanici,EkBilgilerileri butonuna tiklar.
    * Kullanici,Finans bolumune gecildigini dogrular.
    * Kullanici,Sayfayi kapatir.

  Scenario:TC_003_Halkla_İlişkiler_Kayıt_Ek_Bilgiler_Alerji_Hassasiyet_kutusundaki_bilgileri_silebilmeli.
    * Kullanici,ogrenci, ek bilgiler sayfasina basariyla ulastigini dogrular
    * Kullanici,Alerji hassasiyeti kutusuna bilgi ekler.
    * Kullanici Alerji hassasiyeti kutusu bilgisini siler.
    * Kullanici,Alerji hassasiyeti kutusunun bos oldugunu dogrular.
    * Kullanici,Sayfayi kapatir.