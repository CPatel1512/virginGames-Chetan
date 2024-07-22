package com.virgingames.pages;

import com.aventstack.extentreports.Status;
import com.virgingames.customlisteners.CustomListeners;
import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class SearchPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class);

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'No results, check out a selection of our most popu')]")
    WebElement searchbarPageText;

    public String getTextOfSearchPage() {
        String text1 = getTextFromElement(searchbarPageText);
        CustomListeners.node.log(Status.PASS, "Get welcomeText : " + searchbarPageText.getText());
        Reporter.log("Get welcomeText : " + searchbarPageText.getText() + "<br>");
        log.info("Get welcomeText : " + searchbarPageText.getText());
        return text1;
    }



}
