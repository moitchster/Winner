package Selenuim.PageObjectExsample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    //ebay website object
    @FindBy(id = "gh-ac" )
    WebElement searchBar ;

    @FindBy(id="gh-btn")
    WebElement clickBtn ;

    @FindBy(className ="s-item__title")
    WebElement searchResult;

    @FindBy(className = "s-item__detail s-item__detail--primary")
    WebElement searchRePrice;

    //amazon website object

    @FindBy 

    
    private WebDriver driver;


        public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void searchingSearchBar(String keywordToType){
            searchBar.click();
            searchBar.clear();
            searchBar.sendKeys(keywordToType);
            clickBtn.click();

    }


  /*  public String printUserPw(String user, String pw) {
        System.out.println("the user is" + "Pw is " + pw);
        if (user.length() == 4) {
            System.out.println("user length is 4 ");

        }
        return user;
    }*/
}
