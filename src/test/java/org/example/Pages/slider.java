package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.example.setpDefintions.Hooks._driver;

public class slider {
    public slider(WebDriver driver)
    {
        _driver=driver;
    }
    public WebElement slider_Pom(int slidernumbers )
    {
        return _driver.findElement(By.xpath("(//a[@class=\"nivo-imageLink\"])["+slidernumbers+"]"));
    }

}
