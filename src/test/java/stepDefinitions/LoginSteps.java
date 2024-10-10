package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utilities.Helpers;

public class LoginSteps {
    private WebDriver driver;

    private LoginPage loginPage;

    @Given("User open Browser and Navigate to URL")
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\fathi\\Documents\\Assesment\\dbs-indonesia-assignment\\src\\test\\resource\\driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-popup-blocking");

        driver = new ChromeDriver(options);
        driver.get(Helpers.getProperty("baseUrl"));
        loginPage = new LoginPage(driver);
    }

    @When("User input username with {string} and password with {string}")
    public void inputCredential(String username, String password){
        loginPage.inputUsername(username);
        loginPage.inputPassword(password);
    }

    @And("User Click button Login")
    public void clickButtonLogin(){
        loginPage.clickLogin();
    }

    @Then("User Successfully Login and direct to HomePage")
    public void directHomePage(){
        loginPage.homePage();
    }

    @Then("User failed Login and Validate error message")
    public void failedLogin(){
        loginPage.errorMessage();
    }
}
