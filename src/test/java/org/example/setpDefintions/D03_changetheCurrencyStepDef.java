package org.example.setpDefintions;

import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static org.example.setpDefintions.Hooks.Wait;
import static org.example.setpDefintions.Hooks.currencyPage;

public class D03_changetheCurrencyStepDef {
	Hooks hooks = new Hooks();

    @When("user click on the currency dropdown-list")
    public void Checkcuure() throws InterruptedException {
        Select currencyDll = new Select(currencyPage.currencyDDL1());
        currencyDll.selectByVisibleText("US Dollar");
        Wait(2000);
        currencyDll.selectByVisibleText("Euro");
        String  price="€1032";
        String proPrice = hooks._driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[1]/div/div[2]/div[3]/div[1]/span")).getText();
        Assert.assertEquals(proPrice, price);
    }
}

