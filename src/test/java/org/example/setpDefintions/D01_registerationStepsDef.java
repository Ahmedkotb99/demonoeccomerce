package org.example.setpDefintions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.Random;

import static org.example.setpDefintions.Hooks.Wait;
import static org.example.setpDefintions.Hooks.registerrpage;

public class D01_registerationStepsDef {
    @When("user click the Register link")
    public  void clickRegisterationLink()
    {
        registerrpage.registerLink().click();
    }
@When("user enter gender")
    public void genders() throws InterruptedException {
    registerrpage.femaleInGender().click();
    registerrpage.MaleInGender().click();
    Thread.sleep(1000);
}
@And("user enter firstname and lastname")
    public  void fullaccountName()
{
    registerrpage.FullName("Ahmed","Qutb");
}
@And("user enter date of birth")
    public  void date_ofBirth() throws InterruptedException {
    Select Day=new Select(registerrpage.BirthDayDate());
    Day.selectByValue("23");
    Select Month=new Select(registerrpage.BrithMonthdate());
    Month.selectByValue("03");
    Select Year=new Select(registerrpage.BirthYearDate());
    Year.selectByValue("1999");
    Thread.sleep(3000);
}
@And("user enter email")
    public  void email() throws InterruptedException {
    Random random=new Random();
    int N=  random.nextInt();
    System.out.println(getSaltString());
    registerrpage.mail().sendKeys("test@test"+getSaltString()+".com");
    Thread.sleep(4000);
}
    protected String getSaltString() {
        String SALTCHARS = "123";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 3) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }
@And("user enter company name")
    public  void nameofThecompany()
{
    registerrpage.NameofTheCompany().sendKeys("TestCompany");
}
@And("user enter password and Reenter Password")
    public void password()
{
    registerrpage.validatePassword("123456","123456");
}
@Then("user click register button")
    public  void registerButton() throws InterruptedException {
    registerrpage.registerationbtn().submit();
    Wait(1500);
}
@And("user have a welcome message with color")
    public  void resultofAssertions() throws InterruptedException {
    String expectedResult="Your registration completed";
    String ActualResult=registerrpage.successfullyRegisterdMsg().getText();
    Assert.assertTrue(expectedResult.contains(ActualResult));

    String ExpectedColordegree="rgba(76, 177, 124, 1)";
    String actualeColor=registerrpage.successfullyRegisterdMsg().getCssValue("color");
    System.out.println(actualeColor);
    Assert.assertEquals(actualeColor,ExpectedColordegree);
    Wait(1500);
}
}
