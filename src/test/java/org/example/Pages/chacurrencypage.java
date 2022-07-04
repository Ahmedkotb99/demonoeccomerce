package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.example.setpDefintions.Hooks._driver;


public class chacurrencypage {
  public  chacurrencypage(WebDriver driver)
  {
      _driver=driver;
  }

  public WebElement currencyDDL1()
  {
      return _driver.findElement(By.id("customerCurrency"));
  }
}
