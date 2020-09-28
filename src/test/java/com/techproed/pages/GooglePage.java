package com.techproed.pages;
import com.techproed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
public class GooglePage {
    public GooglePage(){
        PageFactory.initElements(Driver.getDriver() , this);
    }
    @FindBy ( name = "q")
    public WebElement aramaKutusu;
    @FindBy ( tagName = "a")
    public List<WebElement> linkler;
}