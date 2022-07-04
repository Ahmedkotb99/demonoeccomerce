package org.example.setpDefintions;

import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

import static org.example.setpDefintions.Hooks.Wait;
import static org.example.setpDefintions.Hooks.currencyPage;

public class D03_changetheCurrencyStepDef {

    @When("user click on the currency dropdown-list")
    public void Checkcuure() throws InterruptedException {
        Select currencyDll = new Select(currencyPage.currencyDDL1());
        currencyDll.selectByVisibleText("US Dollar");
        Wait(2000);
        currencyDll.selectByVisibleText("Euro");
    }
}

