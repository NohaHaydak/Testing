package UserCycleTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest
{
    //variables
    private UserCycleTests.HomePage homePage;

    @Test (dependsOnMethods = {"UserCycleTests.LoginTest.validLoginTest1"})
    //Test Cases
    public void productSortByNameTest()
    {
        //Sort products by Name (A to Z)
        homePage=new UserCycleTests.HomePage(driver);
        homePage.productSortedByName("Name (A to Z)");
        //Assertions
    }

    //Annotations



}
