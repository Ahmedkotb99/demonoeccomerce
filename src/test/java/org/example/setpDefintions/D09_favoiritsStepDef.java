package org.example.setpDefintions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.utilities.BrowserUtilities;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D09_favoiritsStepDef {
    int number;
    @When("user add product to wishlist")
    public  void addToFav() throws InterruptedException {
     Hooks.homePage.icowishlist().get(2).click();
    }
    @Then("wishlist notification success is visible")
    public void donemsgsuccess() throws InterruptedException {
     Hooks.homePage.toastmsg().isDisplayed();
     String actualColor=  Hooks.homePage.toastmsg().getCssValue("background-color");
     String expectedColor="rgba(75, 176, 122, 1)";
     Assert.assertEquals(actualColor,expectedColor);
        Thread.sleep(2000);

    }
    @And("user get the  number of wishlist items after adding product")
    public void takeNumber()
    {
      String textNumber= Hooks.homePage.quantityOfItems().getText();
      number= BrowserUtilities.convertStringToNumber(textNumber);
    }
    @Then("number of wishlist items increased")
    public void itemIncreased()
    {
     Assert.assertTrue(number>0);
    }
    @And("user go to wishList page")
    public void favsPage()
    {
        
        Hooks._driver.findElement(By.cssSelector("span[class=\"close\"]")).click();
       
        Hooks.homePage.favouritsIcon().click();


    }

}
