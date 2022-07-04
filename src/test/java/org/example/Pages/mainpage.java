package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.List;

import static org.example.setpDefintions.Hooks._driver;

public class mainpage {
    public  mainpage(WebDriver driver)
    {
        _driver=driver;
    }

    public List<WebElement> icowishlist()
    {
        return  _driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));

    }
    public  WebElement toastmsg()
    {
        return  _driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }
    public  WebElement quantityOfItems()
    {
        return  _driver.findElement(By.cssSelector("span[class=\"wishlist-qty\"]"));
    }
    public  WebElement favouritsIcon()
    {
        return  _driver.findElement(By.cssSelector("a[class=\"ico-wishlist\"]"));
    }

}
