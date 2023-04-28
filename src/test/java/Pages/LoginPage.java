package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    @FindBy(name = "usrname")
    WebElement userIdFld;

    @FindBy(name = "p")
    WebElement passwordFld;

    @FindBy(id = "log")
    WebElement loginBtn;


    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillUserID(String userId){
        userIdFld.sendKeys(userId);
    }

    public void fillPassword(String password){
        passwordFld.sendKeys(passwora);
    }

    public void clickLoginBtn(){
        loginBtn.click();
    }
}
