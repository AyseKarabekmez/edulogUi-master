package pages.girisOrtak;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Giris {

    public Giris() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "campus_login_phone")
    public WebElement girisTelefonBox;

    @FindBy(xpath = "//*[text()='Devam']")
    public WebElement girisDevamIkon;

    @FindBy(id = "campus_login_otpCode")
    public WebElement girisDogrulamaBox;


    @FindBy(xpath = "//*[text()='Giriş']")
    public WebElement girisIkon;



    @FindBy(xpath = "//*[text()='Hata: Girdiğiniz telefon numarası yanlış!']")
    public WebElement girirsTelNoHataMsj;

    @FindBy(xpath = "//*[text()='Hata: Girdiğiniz doğrulama kodu yanlış!']")
    public WebElement girisDogrulamaKodHataMsj;

}
