package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.setpDefintions.Hooks._driver;


public class followUspage {
    
    public followUspage(WebDriver driver)
    {
        _driver = driver;
        PageFactory.initElements(driver,this);
    }
//   @FindBy(css = "a[href=\"http://www.facebook.com/nopCommerce\"]")
//   public
//   WebElement facebook_pom;

    public  WebElement linksOfSocial(String linksSoci)
    {
        return _driver.findElement(By.xpath("//li[@class=\""+linksSoci+"\"]"));
    }
    @FindBy(css = "a[href=\"http://www.twitter.com/nopCommerce\"]")
    public
    WebElement twitterLink;
    @FindBy(css = "a[href=\"/news/rss/1\"]")
    public
    WebElement resLink;

    @FindBy(css = "href=\"http://www.youtube.com/user/nopCommerce\"")
    public
    WebElement yourubeLink;
}
