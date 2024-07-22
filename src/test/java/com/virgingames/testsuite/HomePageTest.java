package com.virgingames.testsuite;

import com.virgingames.customlisteners.CustomListeners;
import com.virgingames.pages.HomePage;
import com.virgingames.pages.SearchPage;
import com.virgingames.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class HomePageTest extends TestBase {
    HomePage homePage;
    SearchPage searchPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        searchPage = new SearchPage();

    }

    @Test(priority = 1, groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToHomePage() {

        homePage.clickOnAceptCookies();
        String expectedText = "Welcome to Virgin Games";
        String actualText = homePage.getWelcomeText();
        Assert.assertEquals(expectedText, actualText, "text not displayed");
    }

    @Test(priority = 0, groups = {"sanity", "regression"})
    public void verifyUserShouldClickToLoginButton() {
        homePage.clickOnAceptCookies();
        homePage.clickOnLoginLink();

    }

    @Test(priority = 2, groups = {"sanity", "regression"})
    public void verifyUserShouldClickSearchBar() {
        homePage.clickOnAceptCookies();
        homePage.clickOnSearchBar();
    }




}

