package com.techproed.tests;
import com.techproed.pages.GooglePage;
import com.techproed.utilities.ConfigurationReader;
import com.techproed.utilities.Driver;
import com.techproed.utilities.TestBaseFinal;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
public class GoogleTest extends TestBaseFinal {
    @Test
    public void techproeducationAramaTesti() throws InterruptedException {
        extentTest = extentReports.createTest("Techproeducation Arama"
                ,"Google sonuçlarında techpreducation.com'u aradık.");
        extentTest.info("Google.com'a gidiyoruz.");
        Driver.getDriver().get(ConfigurationReader.getProperty("google_link"));
        extentTest.info("GooglePage class'ından nesne ürettik.");
        GooglePage googlePage = new GooglePage();
        extentTest.info("techproeducation araması yapıyoruz.");
        googlePage.aramaKutusu.sendKeys(ConfigurationReader.getProperty("aranacak_kelime") + Keys.ENTER);
        Thread.sleep(3000);
        boolean testSonucu = false;
        for(WebElement w : googlePage.linkler){
            if(w.getText().contains("techproeducation1234.com")){
                testSonucu = true;
                break;
            }
        }
        extentTest.info("Assert işlemi yapıyoruz.");
        Assert.assertTrue(testSonucu);
        extentTest.pass("Testimiz PASSED(başarılı) !");
    }
}