package project.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.pageObject.MainPage;

public class TestCase1 extends Base {

    @Test
    public void testCase1() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.panel.isDisplayed(), "Main page did not opened");
        mainPage.cityFrom.sendKeys("Vilnius");
        mainPage.search.click();
        Assert.assertTrue(mainPage.panel.isDisplayed(), "search was successful");
    }
}
