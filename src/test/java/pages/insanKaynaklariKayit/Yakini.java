package pages.insanKaynaklariKayit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Yakini {

    public Yakini(){
        PageFactory.initElements(Driver.getDriver(),this);}

    // Yakini Bolumu
    // 'Yakınlık' :
    @FindBy(id = "input_hr_step3_family1_relation")
    public WebElement yakinlikBox;

    @FindBy(xpath = "//*[@data-value='Baba']")
    public WebElement babaValue;

    // Adı Soyadı :
    @FindBy(id = "input_hr_step3_family1_name")
    public WebElement adSoyadBox;

    // Dogum Tarihi :
    @FindBy(id = "input_hr_step3_family1_birthday")
    public WebElement dogumTarihiBox;

    // Cinsiyet :
    @FindBy(id = "input_hr_step3_family1_gender")
    public WebElement cinsiyetBox;

    // Uyrugu :
    @FindBy(id = "input_hr_step3_family1_nationality")
    public WebElement uyruguBox;

    // Telefon Numarasi :
    @FindBy(id = "[id='input_hr_step3_family1_phone']")
    public WebElement telNoBox;

    // E-Posta Adresi :
    @FindBy(id = "input_hr_step3_family1_email-label")
    public WebElement emailBox;

    // Adresi il  :
    @FindBy(id = "input_hr_step3_family1_email-label")
    public WebElement ilBox;

    // Adresi ilce  :
    @FindBy(id = "[id='input_hr_step3_family1_countyid']")
    public WebElement ilceBox;

    // Adresi semt  :
    @FindBy(id = "[id=input_hr_step3_family1_districtid]")
    public WebElement semtBox;

    // Acik Adres  :
    @FindBy(id = "[id='input_hr_step3_family1_address']")
    public WebElement acikAdresBox;

    // Tahsil  :
    @FindBy(id = "input_hr_step3_family1_education")
    public WebElement tahsilBox;

    // Meslek  :
    @FindBy(id = "input_hr_step3_family1_job-label")
    public WebElement meslekBox;

    // Firma  :
    @FindBy(id = "[id='input_hr_step3_family1_company']")
    public WebElement firmaBox;

    // yetenek  :
    @FindBy(id = "input_hr_step3_family1_talent-label")
    public WebElement yetenekBox;


}
