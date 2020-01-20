package project.test;

import framework.browser.Browser;
import org.testng.Assert;
import org.testng.annotations.Test;
import project.pageObject.MainPage;

public class TestCase2 extends Base {


    @Test
    public void testCase2() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.panel.isDisplayed(), "Main page did not opened");
        mainPage.cityFrom.sendKeys("Vilnius");
        mainPage.cityTo.sendKeys("Minsk");
        mainPage.calendarFrom.click();
        Assert.assertTrue(mainPage.yesterday.isDisplayed());
    }
}
