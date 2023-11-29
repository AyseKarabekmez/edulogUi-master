package pages.insanKaynaklariKayit;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

public class EkBilgiler1 {
    Faker faker=new Faker();
    String alerji=faker.expression("disease"); //lorem().word();
    String ilac=faker.expression("medicine");
    String aciklama = faker.lorem().paragraph();
    String ilgi_yetenek=faker.lordOfTheRings().character();

    public EkBilgiler1(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id= "input_hr_step4_allergies")
    private WebElement alerjiNameBox;
    @FindBy(id= "input_hr_step4_medications")
    private WebElement surekliKilaclar;
    @FindBy(id= "input_hr_step4_achievements")
    private WebElement ilgiYetenek;
    @FindBy(id = "input_hr_step4_health")
    private WebElement aciklamatextBox1;
    @FindBy(id="input_hr_step4_successfile")
    private WebElement basari_Lisans;
    @FindBy(id="input_hr_step4_interest")
    private WebElement aciklamatextBox2;
    @FindBy(id="input_hr_step4_arrivaltype")
    private WebElement gelisSekli;
    @FindBy(id="input_hr_step4_reference")
    private WebElement referans;
    @FindBy(id="input_hr_step4_notes")
    private WebElement aciklama3;
    @FindBy(id="button_hr_save")
    private WebElement KaydetButon;
    @FindBy(id="nprogress")
    private WebElement toast_message;

    public void AlerjiNameBox() {
        ReusableMethods.wait2(2);
       alerjiNameBox .isDisplayed();
       alerjiNameBox.isSelected();
       alerjiNameBox.click();
       alerjiNameBox.sendKeys(alerji);

    }
    public void surekliKullandigiilaclar(){
        surekliKilaclar.isDisplayed();
        ReusableMethods.wait2(1);
        surekliKilaclar.click();
        surekliKilaclar.sendKeys(ilac);
    }
    public void aciklamaGir(){
        ReusableMethods.wait2(1);
        aciklamatextBox1.isDisplayed();
        aciklamatextBox1.click();
        aciklamatextBox1.sendKeys(aciklama);
    }
    public void ilgiYetenekGiris(){
        ReusableMethods.wait2(1);
        ilgiYetenek.isDisplayed();
        ilgiYetenek.click();
        ilgiYetenek.sendKeys(ilgi_yetenek);

    }
    public void basari_Lisans(){
        basari_Lisans.click();
       // basari_Lisans.sendKeys(dosyaYolu);
    }

    public void aciklama2(){
        aciklamatextBox2.click();
        aciklamatextBox2.sendKeys(aciklama);
    }
    public void gelisSekli(){
        gelisSekli.isDisplayed();
        gelisSekli.click();
        gelisSekli.sendKeys(aciklama);
    }
    public void referansGir(){
        referans.isDisplayed();
        referans.click();
        referans.sendKeys(aciklama);
    }
    public void aciklamaGir3(){
        aciklama3.isDisplayed();
        aciklama3.click();
        aciklama3.sendKeys(aciklama);
    }
    public void kaydetButton(){
        KaydetButon.isDisplayed();
        KaydetButon.click();
    }
    public void kayit_basarili(){
        String exp_message="Kayıt";
        String actual_message=toast_message.getText();
        Assert.assertEquals("Kayıt tamamlandı",exp_message,actual_message);
    }


}
