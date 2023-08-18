package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public  HomePage(){
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Accept')]")
    WebElement acceptCookies;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome to Virgin Games')]")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = "//a[@title='Casino']")
    WebElement casinoTab;


    public void setAcceptCookies() throws InterruptedException {
        Thread.sleep(10000);
        System.out.println("we are switching to iFrame");
        clickOnElement(acceptCookies);//click on Acceptall
        System.out.println("We are done with iFrame");

        driver.switchTo().defaultContent();//switch to default window
    }
    public String getWelcomeText() {
        String message=getTextFromElement(welcomeText);
        log.info("Getting welcome text :" +welcomeText.toString());
        return  message;
    }
    public   void clickOnCasinoTab(){
        log.info("Click on casino Tab :" +casinoTab);

        clickOnElement(casinoTab);
    }






}
