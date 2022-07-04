package org.example.setpDefintions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static org.example.setpDefintions.Hooks._driver;

public class D04_SearchProdyctByNameDef {

    @When("user write product name 'Nikon D5500 DSLR' in search input")
    public  void logProductName()
    {
        WebElement searchIn=_driver.findElement(By.id("small-searchterms"));
        searchIn.sendKeys("Nikon D5500 DSLR");
    }
    @And("user click the search button")
    public  void  tabonseabtn()
    {
        WebElement searbtn=_driver.findElement(By.cssSelector("button[type=\"submit\"]"));
        searbtn.submit();
    }
    @Then("user find the product he looks for it 'Nikon D5500 DSLR'")
    public void assertresutll()
    {
        WebElement searchRes=_driver.findElement(By.partialLinkText("Nikon D5500 DSLR"));
        String actualres=searchRes.getText();
        String expectedres="Nikon D5500 DSLR";
        Assert.assertTrue(actualres.contains(expectedres));
    }
}
