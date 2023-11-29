package stepdefinitions.halklaIliskilerKayitStepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.halklaIliskilerKayit.Egitim;
import utilities.ReusableMethods;

public class EgitimNegatifStepdef {
    Egitim egitim = new Egitim();
    Faker faker = new Faker();



    @When("Kullanici Sezon bolumunu bos birakir.")
    public void kullaniciSezonBolumunuBosBirakir() {


    }


    @When("Kullanici kayit yapilmadigini dogrular.")
    public void kullaniciKayitYapilmadiginiDogrular() {

        ReusableMethods.waitFor(1);
        egitim.EgitimSezon.click();
        Assert.assertFalse(egitim.EgitimSezonSecimi.isSelected());
        ReusableMethods.waitFor(1);
        Assert.assertTrue(egitim.EgitimSezonYazisi.isDisplayed());
        System.out.println(egitim.EgitimSezonYazisi.getText());


    }

    @When("Kullanici Sinif bolumunu bos birakir.")
    public void kullaniciSinifBolumunuBosBirakir() {



    }
}
