package pages.halklaIliskilerKayit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Ogrenci {

    public Ogrenci(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[@id='campus_login_phone']")
    public WebElement grisTelefonBox;

    @FindBy(xpath = "//*[text()='Devam']")
    public WebElement girisDevamIkon;

    @FindBy(xpath = "//*[@id='campus_login_otpCode']")
    public WebElement girisDogrulamaKoduAlani;

    @FindBy(xpath = "(//*[@type='button'])[2]")
    public WebElement girisGirisIkonu;

    @FindBy(xpath = "//*[text()='Halkla İlişkiler*']")
    public WebElement ogrenciHalklaIliskilerYazisi;

    @FindBy(xpath = "(//*[text()='Kayıt*'])[1]")
    public WebElement ogrenciKayit;

    @FindBy(xpath = "//*[@id='input_pr_step1_name']")
    public WebElement ogrenciAdSoyadBox;

    @FindBy(xpath = "//*[@id='input_pr_step1_idNumber']")
    public WebElement ogrenciTcKimlikBox;

    @FindBy(xpath = "//*[@id='input_pr_step1_birthday']")
    public WebElement ogrenciDogumTarihiBox;

    @FindBy(xpath = "//*[@id='input_pr_step1_gender']")
    public WebElement ogrenciCinsiyetBox;

    @FindBy(xpath = "//*[@data-value='m']")
    public WebElement ogrenciCinsiyetTercihi;

    @FindBy(xpath = "//*[@id='input_pr_step1_bloodtype']")
    public WebElement ogrenciKanGrubuBox;

    @FindBy(xpath = "//*[@data-value='B_RH_PLUS']")
    public WebElement ogrenciKanGrubuTercihi;

    @FindBy(xpath = "//*[@id='input_pr_step1_nationality']")
    public WebElement ogrenciUyrukBox;

    @FindBy(id = "input_pr_step1_nationality-option-0")
    public WebElement ogrenciUyrukTercihi;

    @FindBy(xpath = "//*[@id='input_pr_step1_phone']")
    public WebElement ogrenciTelBox;

    @FindBy(xpath = "//*[@id='input_pr_step1_email']")
    public WebElement ogrenciEPostaBox;

    @FindBy(xpath = "//*[@id='input_pr_step1_cityid']")
    public WebElement ogrenciIlBox;

    @FindBy(id="input_pr_step1_cityid-option-0")
    public WebElement ogrenciIlAdana;

    @FindBy(xpath = "//*[@id='input_pr_step1_countyid']")
    public WebElement ogrenciIlceBox;

    @FindBy(id="input_pr_step1_countyid-option-1")
    public WebElement ogrencIlceCukurova;

    @FindBy(xpath = "//*[@id='input_pr_step1_districtid']")
    public WebElement ogrenciSemtBox;

    @FindBy(id = "input_pr_step1_districtid-option-0")
    public WebElement ogrenciSemtTorosMahallesi;

    @FindBy(xpath = "//*[@id='input_pr_step1_address']")
    public WebElement ogrenciAdresBox;

    @FindBy(xpath = "//*[@id='button_pr_step1_forward']")
    public WebElement ogrenciIleriIkonu;
}
