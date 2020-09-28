package com.techproed.tests;
import com.techproed.pages.GooglePage;
import com.techproed.utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class GoogleArama {
    @Test (dataProvider = "uckelime")
    public void aramaTesti(String kelime){
        Driver.getDriver().get("http://google.com");
        GooglePage googlePage = new GooglePage();
        googlePage.aramaKutusu.sendKeys(kelime + Keys.ENTER);
    }
    @DataProvider( name = "kelimeler")
    public Object[][] getKelimeler(){
        Object[][] array = new Object[3][2];
        array[0][0] = "techproed";
        array[0][1] = "webdriver";
        array[1][0] = "testng";
        array[1][1] = "selenium";
        array[2][0] = "cucumber";
        array[2][1] = "parallel test";
        return array;
    }
    @DataProvider( name = "uckelime")
    public Object[] getKelimeler1(){
        Object[] array = new Object[3];
        array[0] = "merhaba";
        array[1] = "dunya";
        array[2] = "cucumber";
        return array;
    }
}