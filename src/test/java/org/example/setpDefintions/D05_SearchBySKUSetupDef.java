package org.example.setpDefintions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static org.example.setpDefintions.Hooks.Wait;
import static org.example.setpDefintions.Hooks._driver;

public class D05_SearchBySKUSetupDef {

    @When("user write product name ' M8_HTC_5L' in search input")
    public  void write_ProductName()
    {
        WebElement search_input=_driver.findElement(By.id("small-searchterms"));
        search_input.sendKeys("Nikon D5500 DSLR");
    }
    @And("user click the search button to find ele")
    public  void  clickSearchButton()
    {
        WebElement search_button=_driver.findElement(By.cssSelector("button[type=\"submit\"]"));
        search_button.submit();
    }
    @Then("user find the product he looks for it 'M8_HTC_5L'")
    public void assertResulte() throws InterruptedException {
        WebElement searchRes=_driver.findElement(By.partialLinkText("Nikon D5500 DSLR"));
        String Ac_Res=searchRes.getText();
        String Ex_Res="Nikon D5500 DSLR";
        Assert.assertTrue(Ac_Res.contains(Ex_Res));
        Wait(2500);
    }
}
