package org.example.setpDefintions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class D03_hoverOverCategories {

    String subCategorysNames;

    @When("user hover category and select subcategory")
    public void userovercategory() throws InterruptedException {

        Actions action = new Actions(Hooks._driver);
        
        WebElement Pcs = Hooks._driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/computers\"]"));
        action.moveToElement(Pcs).perform();
        Thread.sleep(1000);

       
        WebElement desktop = Hooks._driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/desktops\"]"));
        subCategorysNames = desktop.getText().toLowerCase().trim();        
        System.out.println(subCategorysNames);
        desktop.click();
    }

    @Then("user get subCategory\"Desktops\"displayed as a title")
    public void verifyPageTitle() throws InterruptedException {
        String expectedRes = "Desktops";
        String actualRes = Hooks._driver.findElement(By.cssSelector("div[class=\"page-title\"]")).getText();
        Assert.assertEquals(actualRes.toLowerCase().trim(),expectedRes.toLowerCase().trim());
        System.out.println(actualRes);
        System.out.println(expectedRes);
    }

}
