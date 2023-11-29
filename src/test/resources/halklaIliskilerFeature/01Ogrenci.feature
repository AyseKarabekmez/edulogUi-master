@hk
Feature: US_02_Halkla İlişkiler Kayıt/Ogrenci Başlıklı Kısım

  Scenario: Halkla İlişkiler / Kayıt Bölümü alanlarından "Öğrenci" Başlıklı Kısımdaki
            doldurulması zorunlu ve/veya zorunlu olmayan alanlara gerekli bilgilerini eksiksiz ve belirtilen şartlara uygun olarak
            girerek kayıt yapabilmelidir.

  #  * Kullanici, siteye login olur
    * Kullanici, acilan sayfadaki panelden "Halkla İlişkiler" Yazisina tiklar
    * Kullanici, Halkla İliskiler Yazisinin altinda acilan basliklardan "Kayıt" yazisina tiklar
    * Kullanici, Ogrenci Ad-Soyad alanina isim ve soy isim bilgilerini girer
    * Kullanici, Ogrenci TC Kimlik No alanina TC Kimlik No bilgisini girer
    * Kullanici, Ogrenci Dogum Tarihi alanina Dogum Tarihi bilgisini girer
    * Kullanici, Ogrenci Cinsiyet alanindaki seceneklerden kendisine uygun olani secer
    * Kullanici, Ogrenci Kan Grubu alanindaki seceneklerden kendisine uygun olani secer
    * Kullanici, Ogrenci Uyruk alanindaki seceneklerden kendisine uygun olani secer
    * Kullanici, Ogrenci Telefon alanina; Telefon numarasi bilgisini girer
    * Kullanici, Ogrenci E-Posta alanina; E-Posta bilgisini girer
    * Kullanici, Ogrenci İl alanindaki seceneklerden ikamet ettigi İl'i secer
    * Kullanici, Ogrenci İlce alanindaki seceneklerden ikamet ettigi İlce'yi secer
    * Kullanici, Ogrenci Semt alanindaki seceneklerden ikamet ettigi Semt'i secer
    * Kullanici, Ogrenci Adres alanina; ikamet ettigi Adres bilgisini girer
    * Kullanici, Ogrenci gerekli bilgilerini girdikten sonra "ileri" ikonuna basar
