package project.test;

import framework.browser.Browser;
import org.testng.Assert;
import org.testng.annotations.Test;
import project.pageObject.MainPage;
import project.pageObject.SearchResultPage;

public class TestCase4 extends Base {

    @Test
    public void testCase4() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.panel.isDisplayed(), "Main page did not opened");
        mainPage.languagesMenu.click();
        mainPage.ltLang.click();
        mainPage.cityFrom.sendKeys("Vilnius");
        mainPage.cityTo.sendKeys("Vilnius");
        mainPage.calendarFrom.click();
        mainPage.messageClose.click();
        mainPage.dayWeek.click();
        mainPage.search.click();
        SearchResultPage searchResultPage = new SearchResultPage();
        Assert.assertTrue(searchResultPage.resultPanel.isDisplayed(), "Search result page did not opened");
        Assert.assertFalse(searchResultPage.schedulePanel.isDisplayed(), "result is positive");

    }


}
