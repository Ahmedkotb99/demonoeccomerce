package org.example.setpDefintions;

import org.example.Pages.followUspage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.ArrayList;

import static org.example.setpDefintions.Hooks.*;
public class D06_followUsSDef {

    followUspage followUs_dom = new followUspage(_driver);

    @When("user open facebook link")
    public void navigateToFacebook() throws InterruptedException {
        followUs_dom.linksOfSocial("facebook").click();
    }

    @When("user open twitter link")
    public void navigateTotwiter() throws InterruptedException {
        followUs_dom.linksOfSocial("twitter").click();
    }

    @When("user open res link")
    public void navigateToRes() throws InterruptedException {
        followUs_dom.linksOfSocial("rss").click();
    }

    @When("user open YouTube link")
    public void navigateToToutube() throws InterruptedException {
        followUs_dom.linksOfSocial("youtube").click();
    }

    @Then("facebook page of nopCommerce is opened in new tab")
    public void facebookasset() throws InterruptedException {
        ArrayList<String> Tab = new ArrayList<>(_driver.getWindowHandles());
        Thread.sleep(2000);
        _driver.switchTo().window(Tab.get(1));
        Assert.assertEquals(Hooks._driver.getCurrentUrl(), "https://www.facebook.com/nopCommerce");
    }

    @Then("twitter page of nopCommerce is opened in new tab")
    public void twitterAssert() throws InterruptedException {
        ArrayList<String> Tab = new ArrayList<>(_driver.getWindowHandles());
        Thread.sleep(2000);
        _driver.switchTo().window(Tab.get(1));
        Assert.assertEquals(Hooks._driver.getCurrentUrl(), "https://twitter.com/nopCommerce");
    }

    @Then("New Store News Page is opened")
    public void rssAssert() throws InterruptedException {
        Assert.assertEquals(Hooks._driver.getCurrentUrl(), "https://demo.nopcommerce.com/new-online-store-is-open");
    }

    @Then("youtube page of nopCommerce is opened in new tab")
    public void youTubeAssert() throws InterruptedException {
        ArrayList<String> Tab = new ArrayList<>(_driver.getWindowHandles());
        Thread.sleep(2000);
        _driver.switchTo().window(Tab.get(1));
        Assert.assertEquals(Hooks._driver.getCurrentUrl(), "https://www.youtube.com/user/nopCommerce");
    }


}


    /**
//    @Then("facebook is  open in new tab")
//    public void FaceBookNew_Tab() throws InterruptedException {
//        Wait(3000);
//        ArrayList<String>Tabs=new ArrayList<>(_driver.getWindowHandles());
//        _driver.switchTo().window(Tabs.get(1));
//
//        System.out.println(_driver.getCurrentUrl());
//        System.out.println(_driver.getTitle());
//
//        Assert.assertTrue(_driver.getCurrentUrl().contains("https://www.facebook.com/nopCommerce"),_driver.getTitle());
//        _driver.switchTo().window(Tabs.get(0));
//
//        System.out.println(_driver.getCurrentUrl());
//        System.out.println(_driver.getTitle());
//    }
     */
//      @Then("^\"([^\"]*)\" is opened in new tab$")
//      public void facebook_new_tab(String linkType) throws InterruptedException {
//          Thread.sleep(2000);
//          ArrayList<String> Tabs = new ArrayList<>(_driver.getWindowHandles());
//          _driver.switchTo().window(Tabs.get(1));
//          System.out.println(_driver.getCurrentUrl());

//          switch (linkType) {
//              case "facebook":
//                  Assert.assertEquals(Hooks._driver.getCurrentUrl(),"https://www.facebook.com/nopCommerce");
//                  break;
//              case "twitter":
//                  Assert.assertEquals(Hooks._driver.getCurrentUrl(),"https://twitter.com/nopCommerce");
//                  break;
//              case "rss":
//                      Assert.assertEquals(Hooks._driver.getCurrentUrl(),"https://demo.nopcommerce.com/new-online-store-is-open");
//                  break;
//              case "youtube":
//                  Assert.assertEquals(Hooks._driver.getCurrentUrl(),"https://www.youtube.com/user/nopCommerce");
//                  break;
//
//          }

