package project.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.pageObject.MainPage;

public class TestCase3 extends Base {

    @Test
    public void testCase3() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.panel.isDisplayed(), "Main page did not opened");
        mainPage.languagesMenu.click();
        mainPage.ruLang.click();
        Assert.assertEquals(mainPage.textCityFrom.getText(),"I?","Translation is not full");
    }
}
