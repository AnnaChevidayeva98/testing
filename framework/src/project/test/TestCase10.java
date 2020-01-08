package project.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.pageObject.*;

public class TestCase10 extends Base {

    @Test
    public void testCase10() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.panel.isDisplayed(), "Main page did not opened");
        mainPage.cityFrom.sendKeys("Vilnius");
        mainPage.cityTo.sendKeys("Minsk");
        mainPage.calendarFrom.click();
        mainPage.dayWeek.click();
        mainPage.pass.waitVisibilityOfElement();
        mainPage.pass.click();
        mainPage.plusPass.click();
        mainPage.plusPass.click();
        mainPage.plusPass.click();
        mainPage.plusPass.click();
        mainPage.plusPass.click();
        mainPage.plusPass.click();
        Assert.assertEquals(mainPage.countPass.getText(),"6");
    }
}
