package UserCycleTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Test(dependsOnMethods = {"LoginTest.validLoginTest1"})
public class LogoutTest
{
    //Variables
    WebDriver driver;
    private HomePage homePage;

    //Test Cases
    public void logoutTest()
    {
       /* //Logout
        homePage=new HomePage(driver);
        homePage.logout();
        //Assertions
        LoginPage loginPage=new LoginPage(driver);
        Assert.assertTrue(loginPage.isLoginPageDisplayed(), "Logout failed, still not in login page.");*/
    }
}
