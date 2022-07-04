package org.example.setpDefintions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static org.example.Pages.AddToCardD.Addbtns;
import static org.example.Pages.AddToCardD.NameOftheProduct;

public class D07_addProductToShCardstepDef {


    @When("user click add First product\"HTC One M8 Android L 5.0 Lollipop\"")
    public  void additemNum1() throws InterruptedException {
        Addbtns("1").click();
    }

    @Then("user add item open page for the item and found details")
    public void verifyItemIsAdded() throws InterruptedException {
       
        Assert.assertEquals(NameOftheProduct().getText().toLowerCase().trim(),"Build your own computer".toLowerCase().trim());
    }
    @When("user click add second product \"Apple MacBook Pro 13-inch\"")
    public  void addItemNum2() throws InterruptedException {
        Addbtns("2").click();
    }
    @Then("user add item open page for the item and found details\"Apple MacBook Pro 13-inch\"url page")
    public void verifySecondItemIsAdded() throws InterruptedException {
       // Assert.assertEquals(_driver.getCurrentUrl(),"https://demo.nopcommerce.com/apple-macbook-pro-13-inch");
        Assert.assertEquals(NameOftheProduct().getText().toLowerCase().trim(),"Apple MacBook Pro 13-inch".toLowerCase().trim());
    }
    }

