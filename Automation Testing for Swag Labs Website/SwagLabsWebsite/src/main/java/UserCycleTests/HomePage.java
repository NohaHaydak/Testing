package UserCycleTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage
{
    private WebDriver driver;

    //locators
    private final By productSortDropdown = By.className("product_sort_container");

    //Constructor
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    //Methods
    public void productSortedByName(String sortType)
    {
        //Code to sort products by name
        Select dropdown = new Select(driver.findElement(productSortDropdown));
        dropdown.selectByVisibleText(sortType);

    }
}
