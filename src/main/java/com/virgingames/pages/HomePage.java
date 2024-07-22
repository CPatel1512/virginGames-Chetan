package com.virgingames.pages;

import com.aventstack.extentreports.Status;
import com.virgingames.customlisteners.CustomListeners;
import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class);

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Allow all cookies')]")
    WebElement acceptCookies;

    public void clickOnAceptCookies() {
        clickOnElement(acceptCookies);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome to Virgin Games')]")
    WebElement homePageWelcomeText;

    public String getWelcomeText() {
        String text = getTextFromElement(homePageWelcomeText);
        CustomListeners.node.log(Status.PASS, "Get welcomeText : " + homePageWelcomeText.getText());
        Reporter.log("Get welcomeText : " + homePageWelcomeText.getText() + "<br>");
        log.info("Get welcomeText : " + homePageWelcomeText.getText());
        return text;

    }


    @CacheLookup
    @FindBy(linkText = "Login")
    WebElement loginButton;

    public void clickOnLoginLink() {
        clickOnElement(loginButton);
    }

    @CacheLookup
    @FindBy(xpath = "//*[@id='Capa_1']")
    WebElement searchBar;

    public void clickOnSearchBar() {
        mouseHoverToElementAndClick(searchBar);
    }



}
