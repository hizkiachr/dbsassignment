package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.Helpers;

public class LoginPage {
    private WebDriver driver;

    private By objectUsername = By.id("username");

    private By objectPassword = By.id("password");

    private By objectButtonLogin = By.xpath("//button[@type='submit']");

    private By objectTextValidation = By.xpath("//div[@id='flash']");

    public LoginPage(WebDriver driver){
        this.driver = driver;
        Helpers.setDriver(driver);
    }

    public void inputUsername(String username){
        Helpers.takeScreenshot();
        WebElement usernameObject = Helpers.waitForElementVisible(objectUsername, 60);
        usernameObject.sendKeys(username);
    }

    public void inputPassword(String password){
        driver.findElement(objectPassword).sendKeys(password);
        Helpers.takeScreenshot();
    }

    public void clickLogin(){
        driver.findElement(objectButtonLogin).click();
    }

    public void homePage(){
        Helpers.waitForElementVisible(objectTextValidation, 60);
        Helpers.takeScreenshot();
        Helpers.isElementPresent(objectTextValidation);
        System.out.println(driver.findElement(objectTextValidation).getText());
        driver.quit();
    }

    public void errorMessage(){
        Helpers.waitForElementVisible(objectTextValidation, 60);
        Helpers.takeScreenshot();
        Helpers.isElementPresent(objectTextValidation);
        System.out.println(driver.findElement(objectTextValidation).getText());
        driver.quit();
    }
}
