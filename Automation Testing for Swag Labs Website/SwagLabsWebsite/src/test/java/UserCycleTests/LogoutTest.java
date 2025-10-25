package UserCycleTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test(dependsOnMethods = {"LoginTest.validLoginTest1"})
public class LogoutTest extends HomeTest
{
    //Variables
    private LogoutPage LogoutPage;
    //Test Cases
    public void logoutTest()
    {

        homePage.ClickMenuButton("Logout");
        Assert.assertTrue(LogoutPage.isLogoutSuccessful(), "Logout failed, still not in login page.");

    }
    @BeforeClass
    public void setUpClass()
    {
        super.setUpClass();
        LogoutPage=new LogoutPage(driver);
    }

}
