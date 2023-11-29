package pages.insanKaynaklariKayit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.xml.xpath.XPath;

public class Personel {
    public Personel (){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    //Insan Kaynakları
    @FindBy (xpath="//p[(text()='İnsan Kaynakları*')]")
    public WebElement InsanKaynakları;
    //kayıt
    @FindBy(id="link_human_resources_register")
    public WebElement InsanKaynaklarıKayıt;

    //GOREVI
    @FindBy(id = "input_hr_step1_role")
    public WebElement personelGoreviBox;

    @FindBy(xpath = "//li[text()='standard']")
    public WebElement personelGoreviStandard;

    @FindBy(xpath = "//li[text()='premium']")
    public WebElement personelGoreviPremium;

    @FindBy(xpath = "//li[text()='admin']")
    public WebElement personelGoreviAdmin;

    @FindBy(xpath = "//li[text()='student']")
    public WebElement personelGoreviStudent;

    @FindBy(xpath = "//li[text()='teacher']")
    public WebElement personelGoreviTeacher;

    @FindBy(xpath = "//li[text()='parent']")
    public WebElement personelGoreviParent;

    //ADSOYAD
    @FindBy(id = "input_hr_step1_name")
    public WebElement personelAdSoyadBox;

    //TC KIMLIK NO
    @FindBy(id = "input_hr_step1_idnumber")
    public WebElement personelTcKimlikNoBox;

    //DOGUM TARIHI
    @FindBy(id = "input_hr_step1_birthday")
    public WebElement personelDogumTarihiBox;

    //CINSIYET
    @FindBy(id = "input_hr_step1_gender")
    public WebElement personelCinsiyetBox;

    @FindBy(xpath = "//li[text()='f']")
    public WebElement personelCinsiyetF;

    @FindBy(xpath = "//li[text()='m']")
    public WebElement personelCinsiyetM;

    //KANGRUBU
    @FindBy(id = "input_hr_step1_bloodtype")
    public WebElement personelKanGrubuBox;

    @FindBy(xpath = "//li[text()='A_RH_PLUS']")
    public WebElement personelKanGrubuA_RH_PLUS;

    @FindBy(xpath = "//li[text()='A_RH_MINUS']")
    public WebElement personelKanGrubuA_RH_MINUS;

    @FindBy(xpath = "//li[text()='B_RH_PLUS']")
    public WebElement personelKanGrubuB_RH_PLUS;

    @FindBy(xpath = "//li[text()='B_RH_MINUS']")
    public WebElement personelKanGrubuB_RH_MINUS;

    @FindBy(xpath = "//li[text()='AB_RH_PLUS']")
    public WebElement personelKanGrubuAB_RH_PLUS;

    @FindBy(xpath = "//li[text()='AB_RH_MINUS']")
    public WebElement personelKanGrubuAB_RH_MINUS;

    @FindBy(xpath = "//li[text()='ZERO_RH_MINUS]")
    public WebElement personelKanGrubuZERO_RH_MINUS;

    @FindBy(xpath = "//li[text()='ZERO_RH_PLUS']")
    public WebElement personelKanGrubuZERO_RH_PLUS;

    //UYRUGU
    @FindBy(id = "input_hr_step1_nationality")
    public WebElement personelUyruguBox;

    @FindBy(id = "input_hr_step1_nationality-option-0")
    public WebElement personelUyruguTurkiye;

    @FindBy(id = "input_hr_step1_nationality-option-1")
    public WebElement personelUyruguKibris;

    //TELEFON
    @FindBy(id = "input_hr_step1_phone")
    public WebElement personelTelefonBox;

    //EMAIL
    @FindBy(id = "input_hr_step1_email")
    public WebElement personelEmailBox;

    //IL
    @FindBy(id = "input_hr_step1_cityid")
    public WebElement personelIllBox;

    @FindBy(id = "input_hr_step1_cityid-option-0")
    public WebElement personelIllAdana;

    @FindBy(id = "input_hr_step1_cityid-option-1")
    public WebElement personelIlMersin;

    //ILCE
    @FindBy(id = "input_hr_step1_countyid")
    public WebElement personelIlceBox;

    @FindBy(id = "input_hr_step1_countyid-option-0")
    public WebElement personelIlceSeyhan;

    @FindBy(id = "input_hr_step1_countyid-option-1")
    public WebElement personelIlceCukurova;

    //SEMT
    @FindBy(id = "input_hr_step1_districtid")
    public WebElement personelSemtBox;

    @FindBy(xpath = "//li[@id='input_hr_step1_districtid-option-1']")
    public WebElement personelSemtYesilyurtMahallesi;

    //ADRES
    @FindBy(id = "input_hr_step1_address")
    public WebElement personelAdresBox;
    //KADEME
    @FindBy(xpath ="//div[@id='input_hr_step1_state']")
    public WebElement personelkademeBox;

    @FindBy(xpath="//li[normalize-space()='general']")
    public WebElement personelkademegeneral;

    //MAAS
    @FindBy(id = "input_hr_step1_salary")
    public WebElement personelMaasBox;

    @FindBy(id = "stepper-alternative-personal-select")
    public WebElement personelMaasSecimiBox;

    @FindBy(xpath = "//li[text()='net']")
    public WebElement personelMaasSecimiNet;

    @FindBy(xpath = "//li[text()='gross']")
    public WebElement personelMaasSecimiGross;
    //İLERİ
    @FindBy (id="button_hr_step1_forward")
    public WebElement IleriButonu;
     //CV
    @FindBy(id="input_hr_step1_cvfile")
    public WebElement personelcv;
    @FindBy(id="input_hr_step1_identityfile")
    public WebElement personellimlik;
    @FindBy(id="input_hr_step1_contractfile")
    public WebElement personelsözlesme;
    @FindBy(id="input_hr_step1_documentfile")
    public WebElement personelresmiEvrak;


}
