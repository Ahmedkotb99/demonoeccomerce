package org.example.Pages;

import org.example.setpDefintions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterationPage {
    //public  static WebDriver driver;

    public  RegisterationPage(WebDriver driver)
    {
        Hooks._driver=driver;
    }
    public  WebElement MaleInGender()
    {
        return Hooks._driver.findElement(By.id("gender-male"));
    }
    public  WebElement femaleInGender()
    {
        return Hooks._driver.findElement(By.id("gender-female"));
    }
    public  WebElement firstName()
    {
        return  Hooks._driver.findElement(By.id("FirstName"));
    }
    public  WebElement lastName()
    {
        return  Hooks._driver.findElement(By.id("LastName"));
    }
    public  WebElement BirthDayDate()
    {
        return  Hooks._driver.findElement(By.name("DateOfBirthDay"));
    }
    public  WebElement BrithMonthdate()
    {
        return  Hooks._driver.findElement(By.name("DateOfBirthMonth"));
    }
    public  WebElement BirthYearDate()
    {
        return  Hooks._driver.findElement(By.name("DateOfBirthYear"));
    }
    public  WebElement mail()
    {
        return  Hooks._driver.findElement(By.id("Email"));
    }
    public  WebElement NameofTheCompany()
    {
        return  Hooks._driver.findElement(By.id("Company"));
    }
    public  WebElement password()
    {
        return  Hooks._driver.findElement(By.id("Password"));
    }
    public  WebElement confirmPassword ()
    {
        return  Hooks._driver.findElement(By.id("ConfirmPassword"));
    }
    public  WebElement registerationbtn ()
    {
        return  Hooks._driver.findElement(By.cssSelector("button[name=\"register-button\"]"));
    }

    public  void FullName(String firstName,String lastname)
    {
        this.firstName().sendKeys(firstName);
        this.lastName().sendKeys(lastname);
    }


    public void validatePassword(String password, String confirmPassword) {
        this.password().sendKeys(password);
        this.confirmPassword().sendKeys(confirmPassword);
    }

    public  WebElement successfullyRegisterdMsg()
    {
        return  Hooks._driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }

    public WebElement registerLink() {
        return  Hooks._driver.findElement(By.cssSelector("a[class=\"ico-register\"]"));
    }
}
