package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup {
    public WebDriver ldriver;
    public Signup(WebDriver rdriver){
        this.ldriver=rdriver;
        PageFactory.initElements(rdriver,this);

    }
    @FindBy(id="signin2")
    @CacheLookup
    WebElement signUp;
    @FindBy(id="sign-username")
    @CacheLookup
    WebElement username;
    @FindBy(id="sign-password")
    @CacheLookup
    WebElement password;
    @FindBy(xpath = "//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")
    @CacheLookup
    WebElement signButton;
    public void signUp(){
        signUp.click();
    }
    public void addUsername(String user){
        username.sendKeys(user);
    }
    public void setPassword(String pwd){
        password.sendKeys(pwd);
    }
    public void signButton(){
        signButton.click();
    }


}


