package stepDefinitions;

import io.cucumber.java.en.*;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.Signup;

import java.util.concurrent.TimeUnit;

public class Steps {
    public WebDriver driver;
    public Signup sign;
    public static String randomGen(){
        String randValue= RandomStringUtils.randomAlphanumeric(7);
        return (randValue);
    }
    @Given("The user opens a browser")
    public void the_user_opens_a_browser() {
        // Write code here that turns the phrase above into concrete actions
        String fileLocation = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",fileLocation+"/Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        //throw new io.cucumber.java.PendingException();
    }
    @When("The user enters URL {string}")
    public void the_user_enters_url(String string) {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://www.demoblaze.com/");

        //throw new io.cucumber.java.PendingException();
    }
    @When("User clicks SignUp Button")
    public void user_clicks_sign_up_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        sign =new Signup(driver);
        sign.signUp();
        Thread.sleep(2000);
        //throw new io.cucumber.java.PendingException();
    }
    @When("User provides username {string} and password {string}")
    public void user_provides_username_and_password(String username, String password) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        sign.addUsername(randomGen());
        Thread.sleep(2000);
        sign.setPassword("12345");
        Thread.sleep(2000);
        //throw new io.cucumber.java.PendingException();
    }
    @When("User Clicks Signup button")
    public void user_clicks_signup_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        sign.signButton();
        Thread.sleep(2000);
        //throw new io.cucumber.java.PendingException();
    }
    @When("User Accept the popup window")
    public void user_accept_the_popup_window() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

    }
    @Then("Close Browser")
    public void close_browser() {
        // Write code here that turns the phrase above into concrete actions
        driver.close();
        // throw new io.cucumber.java.PendingException();
    }
}
