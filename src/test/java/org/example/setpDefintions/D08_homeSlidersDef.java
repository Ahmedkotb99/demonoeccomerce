package org.example.setpDefintions;

import org.example.Pages.slider;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static org.example.setpDefintions.Hooks.Wait;
import static org.example.setpDefintions.Hooks._driver;

public class D08_homeSlidersDef {

  public  slider slider_dom=new slider(_driver);



      @When("user Click the first_slider")
    public void clickTheFirstSlider()
    {
        slider_dom.slider_Pom(1).click();
    }

    @Then("user open the product which it clickable")
    public  void validateFirstSlider() throws InterruptedException {
        Wait(2000);
        Assert.assertEquals(_driver.getCurrentUrl(),"https://demo.nopcommerce.com/Iphone_s6");
    }

     
    @When("user Click the second_slider")
    public void considerClickable()
    {
        slider_dom.slider_Pom(2).click();
    }

    @Then("user open the product 2 which it clickable")
    public  void validateSecondSlider() throws InterruptedException {
        Wait(2000);
        Assert.assertEquals(_driver.getCurrentUrl(),"https://demo.nopcommerce.com/Nokia_Lumia_1020");



    }
}
