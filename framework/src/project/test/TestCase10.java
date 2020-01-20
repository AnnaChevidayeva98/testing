package project.test;

import framework.browser.Browser;
import org.testng.Assert;
import org.testng.annotations.Test;
import project.pageObject.MainPage;

public class TestCase10 extends Base {

    @Test
    public void testCase10() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.panel.isDisplayed(), "Main page did not opened");
        mainPage.cityFrom.sendKeys("Vilnius");
        mainPage.cityTo.sendKeys("Minsk");
        mainPage.pass.waitVisibilityOfElement();
        mainPage.pass.click();
        mainPage.plusPass.click();
        mainPage.plusPass.click();
        mainPage.plusPass.click();
        mainPage.plusPass.click();
        mainPage.plusPass.click();
        mainPage.plusPass.click();
       Assert.assertNotEquals(mainPage.countPass.getText(),"6");
        //Assert.AreNotEqual("6", mainPage.countPass.getText());

    }
}
