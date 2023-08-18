package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CasinoPage extends Utility {
    private static final Logger log = LogManager.getLogger(CasinoPage.class.getName());

    public  CasinoPage(){
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Play Online Casino Games, with Many Classics to Ch')]")
    WebElement casinoWelcomeText;

    public String getCasinoText(){
        String message=getTextFromElement(casinoWelcomeText);
        log.info("Getting Casino welcome text :"  +casinoWelcomeText.toString());
        return message;
    }

}
