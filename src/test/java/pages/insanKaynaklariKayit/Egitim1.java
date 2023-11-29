package pages.insanKaynaklariKayit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Egitim1 {
    public Egitim1(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="input_hr_step2_education1_name")
    public WebElement egitimDuzeyiTextBox;


    @FindBy(id="input_hr_step2_education1_department")
    public WebElement bölümTextBox;

    @FindBy(id="input_hr_step2_education1_graduationdate")
    public WebElement mezuniyetTarihiTextBox;

    @FindBy(id="input_hr_step2_education1_diploma")
    public WebElement diplomaYuklemeTextBox;


    @FindBy(id="input_hr_step2_education1_additionalinformation")
    public WebElement diplomaEkAciklamaTextBox;

    @FindBy(id="input_hr_step2_certifications")
    public WebElement belgelerTextbox;

    @FindBy(id="input_hr_step2_edufile")
    public WebElement belgelerYuklemeTextbox;

    @FindBy(id="input_hr_step2_additionalinformation")
    public WebElement  belgelerEkAciklamaTextbox;

    @FindBy(id="button_hr_step2_forward")
    public WebElement ileriButton;





















}
