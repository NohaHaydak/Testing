//POM for Login Page
package UserCycleTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage
{
    //variables
    private WebDriver driver;
    private WebDriverWait wait;
    // locators
    private final By usernameField = By.id("user-name");
    private final By passwordField = By.id("password");
    private final By loginButton = By.id("login-button");
    private final By errorIcon = By.cssSelector("[data-icon='times-circle']");
    private final By SuccessLabel = By.cssSelector(".product_label");
    //private final By SuccessLabel = By.cssSelector("[class='product_label']");




    //Constractors
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    //Actions
    public void login(String username, String password)
    {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }
    public boolean isLoginFailed()
    {
        try
        {
            return wait.until(d->driver.findElement(errorIcon).isDisplayed());
        }
        catch (org.openqa.selenium.NoSuchElementException | org.openqa.selenium.TimeoutException e)
        {
            // Catch the exception and return false, allowing the TestNG assertion to fail gracefully.
            return false;
        }

    }
    public boolean isLoginSuccessful()
    {
        try
        {
            return wait.until(d->driver.findElement(SuccessLabel).isDisplayed());
        }
        catch (org.openqa.selenium.NoSuchElementException | org.openqa.selenium.TimeoutException e)
        {
            // Catch the exception and return false, allowing the TestNG assertion to fail gracefully.
            return false;
        }
    }
}
