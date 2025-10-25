package UserCycleTests;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.URL;

@Test (dependsOnMethods = {"UserCycleTests.LoginTest.validLoginTest1"})
public class HomeTest extends BaseTest
{
    //variables
    protected HomePage homePage;
    protected static Actions action;
    //Test Cases

    public void productSortByNameTest()
    {
        //Sort products by Name (Z to A)
        homePage.productSortedByName("Name (Z to A)");
        //Assertions
    }
    public void NavigateToAboutTest()
    {
        URL currentURL = null;
        homePage.ClickMenuButton("About");
        Assert.assertTrue(homePage.AboutPage(currentURL), "Navigation to About page failed.");
        //Response response = RestAssured.given().get(currentURL);
        //Assert.assertEquals(response.getStatusCode(), 200, "API did not return status code 200");
        //Assert.assertEquals(driver.findElement(By.xpath("//p[text()='This site is operated by Sauce Labs.']")).getText(),"This site is operated by Sauce Labs.");
    }


    //Annotations
    @BeforeClass
    public void setUpClass()
    {
        //Login with valid credentials
        action=new Actions(driver);
        homePage=new HomePage(driver,action);
    }
    @AfterMethod
    public void setUpMethod()
    {
        driver.get("https://www.saucedemo.com/v1/inventory.html");
    }



}
