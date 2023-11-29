package pages.halklaIliskilerKayit;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Aile {
        public Aile(){
                PageFactory.initElements(Driver.getDriver(),this);}

        @FindBy(xpath = "//*[@id='input_pr_step3_family1_relation']")
        public WebElement AileYakinlikDropdownElementi;

        @FindBy(xpath = "//*[text()='Anne']")
        public WebElement AileYakinlikAnneElementi;

        @FindBy(xpath = "//*[@id='input_pr_step3_family1_name']")
        public WebElement AileAdSoyadTextElementi;

        @FindBy (xpath = "//*[@id='input_pr_step3_family1_idnumber']")
        public WebElement AileTCKimlikNoTextElementi;

        @FindBy (xpath = "//*[@id='input_pr_step3_family1_birthday']")
        public WebElement AileDogumTarihiTableElementi;

        @FindBy (xpath = "//*[@id='input_pr_step3_family1_gender']")
        public WebElement AileCinsiyetDropdownElementi;

        @FindBy (xpath = "//*[text()='f']")
        public WebElement AileCinsiyetFemaleElementi;

        @FindBy (xpath = "//*[@id='input_pr_step3_family1_bloodtype']")
        public WebElement AileKanGrubuDropdownElementi;

        @FindBy (xpath = "//*[text()='A_RH_PLUS']")
        public WebElement AileKanGrubuARHPLUSElementi;

        @FindBy (xpath = "//*[@id='input_pr_step3_family1_nationality']")
        public WebElement AileUyrukDropdownElementi;

        @FindBy (xpath = "//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl MuiInputBase-sizeSmall MuiInputBase-adornedStart css-zco5gu']")
        public WebElement AileTelefonBoxElementi;

        @FindBy (xpath = "//*[@id='input_pr_step3_family1_email']")
        public WebElement AileEpostaBoxElementi;

        @FindBy (xpath = "//*[@id='button_pr_step2_forward']")
        public WebElement AileIleriButtonElementi;


        @FindBy (xpath = "(//div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-xeos9v'])[4]")
        public WebElement AileTahsilElementi;

        @FindBy (xpath = "//*[text()='primary_school']")
        public WebElement AileTahsilPrimarySchoolElementi;

        @FindBy (xpath = "//*[@id='input_pr_step3_family1_job']")
        public WebElement AileMeslekTextBoxElementi;

        @FindBy(xpath = "//*[@id='input_pr_step3_family1_company']")
        public WebElement AileFirmaKurumBilgisiElementi;


        @FindBy(xpath = "//*[@id='input_pr_step3_family1_nationality-option-0']")
        public WebElement AileUyrukTurkiyeElementi;




}


