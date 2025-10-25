package UserCycleTests;
import org.apache.logging.log4j.plugins.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

public class HomePage
{
    private WebDriver driver;

    //locators
    private final By productSortDropdown = By.className("product_sort_container");
    private final By menuButton = By.className("bm-burger-button");
    private Actions action;
    //Constructor
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }
    public HomePage(WebDriver driver, Actions action)
    {
        this.driver = driver;
        this.action = action;
    }

    //Methods
    public void productSortedByName(String sortType)
    {
        //Code to sort products by name
        Select dropdown = new Select(driver.findElement(productSortDropdown));
        dropdown.selectByVisibleText(sortType);

    }
    public void ClickMenuButton(String menuOption)
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        action.moveToElement(driver.findElement(menuButton)).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated (By.xpath("//a[.='" + menuOption + "']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[.='" + menuOption + "']"))).click();
    }
    public boolean AboutPage(URL url)
    {

        By AboutPageSignUp= By.cssSelector("[href='https://saucelabs.com/request-demo']");
        // Use an explicit wait for external page navigation to complete (15 seconds)
        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(15));

        try
        {
            // Wait until the expected element is visible on the new page
            wait.until(ExpectedConditions.visibilityOfElementLocated(AboutPageSignUp));
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(AboutPageSignUp)));
            try {
                url=new URI("https://saucelabs.com/request-demo").toURL() ;
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            } catch (URISyntaxException e) {
                throw new RuntimeException(e);
            }
            return true;

        }
        catch (org.openqa.selenium.TimeoutException | org.openqa.selenium.NoSuchElementException e)
        {
            // If the element is not found within the timeout, return false
            return false;
        }

    }


}
