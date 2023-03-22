package Selenuim.Tests;

import Selenuim.PageObjectExsample.LoginPage;
import Selenuim.PageObjectExsample.ProdPage;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {
    public static void main(String[] args) {
        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver= base.seleniumInit("https://www.ebay.com/");
        ProdPage prodPage = new ProdPage(driver);
        LoginPage loginPage = new LoginPage(driver);

    }
}
