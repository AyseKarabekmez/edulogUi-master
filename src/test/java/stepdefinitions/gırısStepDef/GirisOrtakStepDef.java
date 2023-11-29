package stepdefinitions.gırısStepDef;


import io.cucumber.java.en.Then;
import pages.girisOrtak.Giris;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class GirisOrtakStepDef {

    Giris giris = new Giris();

    @Then("Kullanici siteye giris yapar")
    public void kullanici_siteye_giris_yapar() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        giris.girisTelefonBox.click();
        ReusableMethods.waitFor(1);
        giris.girisTelefonBox.sendKeys(ConfigReader.getProperty("telefon"));
        ReusableMethods.waitFor(1);
        giris.girisDevamIkon.click();
        giris.girisDogrulamaBox.click();
        ReusableMethods.waitFor(1);
        giris.girisDogrulamaBox.sendKeys(ConfigReader.getProperty("dogrulamaKodu"));
        giris.girisIkon.click();


    }


}



