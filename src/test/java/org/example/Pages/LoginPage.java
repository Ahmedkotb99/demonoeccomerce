package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.setpDefintions.Hooks._driver;


public class LoginPage {

   public  LoginPage(WebDriver driver)
   {
       _driver=driver;
       /**using page-factory*/
       PageFactory.initElements(driver,this);

   }
   @FindBy(id = "Email")
    WebElement accountUsername;
    @FindBy(id = "Password")
    WebElement acountpass;

    public  void loginStep(String email,String password)
    {
        this.accountUsername.sendKeys(email);
        this.acountpass.sendKeys(password);
    }
    @FindBy(className = "button-1")
    public
    WebElement loginButton;

    public String  getUrl()
    {
      return _driver.getCurrentUrl();
    }
  public  WebElement myAccountTab()
  {
      return  _driver.findElement(By.cssSelector("class=\"ico-account\""));
  }


}
