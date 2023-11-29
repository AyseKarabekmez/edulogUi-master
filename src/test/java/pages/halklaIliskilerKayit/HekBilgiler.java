package pages.halklaIliskilerKayit;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HekBilgiler {

    public HekBilgiler() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='04. Ek Bilgiler']")
    public WebElement hEkBilgilerEkBilgiler;

    @FindBy(id = "input_pr_step4_allergies")
    public WebElement hEkBilgilerAlerjiHassasiyetbox;

    @FindBy(id = "input_pr_step4_medications")
    public WebElement hEkBilgilerSurekliKullandigiIlacBox;

    @FindBy(id = "input_pr_step4_health")
    public WebElement hEkBilgilerSaglikAciklamaBox;

    @FindBy(id = "input_pr_step4_sport")
    public WebElement hEkBilgilerIlgilendigiSporSanatDaliBox;

    @FindBy(id = "input_pr_step4_success")
    public WebElement hEkBilgilerBasariLisansBox;

    @FindBy(id = "input_pr_step4_interest")
    public WebElement hEkBilgilerIlgiAlaniBox;

    @FindBy(id = "input_pr_step4_arrivaltype")
    public WebElement hEkBilgilerGelisSekliBox;

    @FindBy(id = "input_pr_step4_reference")
    public WebElement hEkBilgilerReferansBox;

    @FindBy(id = "input_pr_step4_notes")
    public WebElement hEkBilgilerOzelNotlar;

    @FindBy(id="button_pr_step4_forward")
    public WebElement hEkBilgilerIleri;

    @FindBy(xpath = "//*[text()='05. Finans']")
    public WebElement hEkBilgilerFinans;


}