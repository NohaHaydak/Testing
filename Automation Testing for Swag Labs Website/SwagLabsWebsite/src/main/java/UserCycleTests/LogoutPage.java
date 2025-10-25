package UserCycleTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutPage {
    private WebDriver driver;
    private By loginButton= By.id("login-button");
    private WebDriverWait wait;


    public LogoutPage(WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
    }
    public boolean isLogoutSuccessful()
    {
        try
        {
            return wait.until(d->driver.findElement(loginButton).isDisplayed());
        }
        catch (org.openqa.selenium.NoSuchElementException | org.openqa.selenium.TimeoutException e)
        {
            // Catch the exception and return false, allowing the TestNG assertion to fail gracefully.
            return false;
        }

    }
}
