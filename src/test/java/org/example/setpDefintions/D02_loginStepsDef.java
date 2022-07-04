package org.example.setpDefintions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static org.example.setpDefintions.Hooks.*;

public class D02_loginStepsDef {

    @Given("user go to login url")
    public void NavigateToURL()
    {
        _driver.navigate().to("https://demo.nopcommerce.com/login");
    }
    @When("user login with valid email and password")
    public void validLoginmailandPass() throws InterruptedException {
     loginPage.loginStep("test@test.com","123456");
     Wait(2500);
    }
    @Then("user click on the login button")
    public void loginButton() throws InterruptedException {
        loginPage.loginButton.submit();
    }
    @And("user go to home page successfully")
    public  void loginDone()  {
//        String Exp_Resulte="https://demo.nopcommerce.com/";
//        String Actual_Res=loginPage.getUrl();
//        Assert.assertEquals(Actual_Res,Exp_Resulte);
        SoftAssert soft=new SoftAssert();
        soft.assertFalse(_driver.getCurrentUrl().contains("https://demo.nopcommerce.com/login.com"));
        Assert.assertTrue(loginPage.myAccountTab().isDisplayed());

    }
}
