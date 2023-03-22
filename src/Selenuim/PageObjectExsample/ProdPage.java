package Selenuim.PageObjectExsample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
// for project
public class ProdPage {

    private WebDriver driver;



    public ProdPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}

