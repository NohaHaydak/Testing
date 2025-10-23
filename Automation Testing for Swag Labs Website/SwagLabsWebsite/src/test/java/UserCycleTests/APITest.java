package UserCycleTests;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class APITest
{
    @Test
    public void verifyApiStatus() {
        Response response = RestAssured.get("https://www.saucedemo.com/v1/img/SwagLabs_logo.png");
        Assert.assertEquals(response.getStatusCode(), 200, "API did not return status code 200");
    }
}
