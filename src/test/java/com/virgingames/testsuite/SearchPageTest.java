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
public class SearchPageTest extends TestBase {

    HomePage homePage;
    SearchPage searchPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        searchPage = new SearchPage();

    }

    @Test(priority = 1, groups = {"regression"})
    public void verifyUserShouldNavigateToSearchPage() {
        homePage.clickOnAceptCookies();
        homePage.clickOnSearchBar();
        String expectedSearchText = "No results, check out a selection of our most popular slots";
        String actualSearchText = searchPage.getTextOfSearchPage();
        Assert.assertEquals(actualSearchText,expectedSearchText,"Text not displayed");
    }


}
