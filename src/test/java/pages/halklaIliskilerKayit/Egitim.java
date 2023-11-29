package pages.halklaIliskilerKayit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Egitim {
    public Egitim(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(id="input_pr_step2_seasonid")
    public WebElement EgitimSezon;

    @FindBy(id = "input_pr_step2_seasonid-option-0")
    public WebElement EgitimSezonSecimi;

    @FindBy(id="input_pr_step2_classid")
    public WebElement EgitimSinif;
    @FindBy(xpath ="//li[text()='2']")
    public WebElement EgitimSinifSecimi;
    @FindBy(xpath = "//*[@id='input_pr_step2_area']")
    public WebElement EgitimAlan;

    @FindBy(xpath ="//li[text()='TM']")
    public WebElement EgitimAlanSecimi;
    @FindBy(id="input_pr_step2_branchid")
    public WebElement EgitimSube;
    @FindBy(id="input_pr_step2_branchid-option-1")
    public WebElement EgitimSubeSecimi;
    @FindBy(id="input_pr_step2_studentnumber")
    public WebElement EgitimOgrenciNo;

    @FindBy(id="input_pr_step2_teacherid")
    public WebElement EgitimSorumluOgretmen;
    @FindBy(id="input_pr_step2_teacherid-option-0")
    public WebElement EgitimSorumluOgretmenSecimi;
    @FindBy(id="input_pr_step2_mebscholarshippoint")
    public WebElement EgitimBurlulukSinavP;

    @FindBy(xpath = "//*[@id='input_pr_step2_mebscholarshipslice']")
    public WebElement EgitimBurslulukSinavDilimi;
    @FindBy(xpath = "//*[@id='input_pr_step2_schoolorigin']")
    public WebElement EgitimGeldigiOkul;
    @FindBy(xpath = "//*[@id='input_pr_step2_schoolorigin']")
    public WebElement EgitimGeldigiOkulSecimi;
    @FindBy(id="input_pr_step2_scholarshiptype")
    public WebElement EgitimMebBurslu;
    @FindBy(xpath = "//li[text()='veteran_relative']")
    public WebElement EgitimMebBursuSecimi;
    @FindBy(xpath = "//*[@id='input_pr_step2_meetworkpoint']")
    public WebElement EgitimTaramaCalismasi;
    @FindBy(xpath = "//*[@id='button_pr_step2_forward']")
    public WebElement EgitimIleriButonu;
    @FindBy(xpath = "//*[@id='stepper-alternative-personal-select-label']")
    public WebElement AileYakinlik;

    @FindBy(xpath = "//*[@id='input_pr_step2_seasonid-label']")
    public WebElement EgitimSezonYazisi;


}
