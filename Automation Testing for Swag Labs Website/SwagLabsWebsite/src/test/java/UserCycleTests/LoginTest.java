package UserCycleTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.*;

@Test
public class LoginTest extends BaseTest
{
    //Variables
    private LoginPage loginPage;

    //Test Cases
    public void validLoginTest1()
    {
        //Login with valid credentials
        loginPage=new LoginPage(driver);
        loginPage.login("standard_user","secret_sauce");
        //Assertions
        Assert.assertTrue(loginPage.isLoginSuccessful(), "Login failed despite the credentials.");
    }
    public void validLoginTest2()
    {
        //Login with valid credentials
        loginPage=new LoginPage(driver);
        loginPage.login("problem_user","secret_sauce");
        //Assertions
        Assert.assertTrue(loginPage.isLoginSuccessful(), "Login failed despite the valid credentials.");
    }
    public void validLoginTest3()
    {
        //Login with valid credentials
        loginPage=new LoginPage(driver);
        loginPage.login("locked_out_user","secret_sauce");
        //Assertions
        Assert.assertTrue(loginPage.isLoginSuccessful(), "Login failed despite the valid credentials.");
    }
    public void validLoginTest4()
    {
        //Login with valid credentials
        loginPage=new LoginPage(driver);
        loginPage.login("performance_glitch_user","secret_sauce");
        //Assertions
        Assert.assertTrue(loginPage.isLoginSuccessful(), "Login failed despite the valid credentials.");
    }
    public void invalidLoginTest1()
    {
        //Login with invalid credentials
        loginPage=new LoginPage(driver);
        loginPage.login("standard_user","secret_sauce ");
        //Assertions
        Assert.assertTrue(loginPage.isLoginFailed(), "Login didn't fail despite the space after password.");
    }
    public void invalidLoginTest2()
    {
        //Login with invalid credentials
        loginPage=new LoginPage(driver);
        loginPage.login("standard_use","invalid_password");
        //Assertions

        Assert.assertTrue(loginPage.isLoginFailed(), "Login didn't fail despite the invalid password.");
    }
    public void invalidLoginTest3()
    {
        //Login with invalid credentials
        loginPage=new LoginPage(driver);
        loginPage.login("standard_use ","secret_sauce");
        //Assertions
        Assert.assertTrue(loginPage.isLoginFailed(), "Login didn't fail despite the extra space after username.");
    }
    public void invalidLoginTest4()
    {
        //Login with invalid credentials
        loginPage=new LoginPage(driver);
        loginPage.login("Noha","secret_sauce");
        //Assertions
        Assert.assertTrue(loginPage.isLoginFailed(), "Login didn't fail despite the invalid username.");
    }


    //Annotations
    @BeforeMethod
    public void setup()
    {
        //Navigate to URL
        driver.get("https://www.saucedemo.com/v1/");

    }



}
