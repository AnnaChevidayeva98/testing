package project.test;

import framework.browser.Browser;
import org.testng.Assert;
import org.testng.annotations.Test;
import project.pageObject.*;

public class TestCase5 extends Base {

    @Test
    public void testCase5() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.panel.isDisplayed(), "Main page did not opened");
        mainPage.cityFrom.sendKeys("Vilnius");
        mainPage.cityTo.sendKeys("Minsk");
        mainPage.calendarFrom.click();
        mainPage.messageClose.click();
        mainPage.dayWeek.click();
        mainPage.search.click();
        SearchResultPage searchResultPage = new SearchResultPage();
        Assert.assertTrue(searchResultPage.resultPanel.isDisplayed(), "Search result page did not opened");
        searchResultPage.price.click();
        searchResultPage.chooseClass.click();
        searchResultPage.accept.waitVisibilityOfElement();
        searchResultPage.accept.click();
        searchResultPage.acceptData.waitVisibilityOfElement();
        Browser.ScrollPage("0","400");
        searchResultPage.acceptData.hoverElement();
        searchResultPage.acceptData.click();
        Assert.assertTrue(searchResultPage.errorPanel.isDisplayed(), "Error panel did not opened");

    }


}
