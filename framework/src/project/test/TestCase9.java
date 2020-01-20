package project.test;

import framework.browser.Browser;
import org.testng.Assert;
import org.testng.annotations.Test;
import project.pageObject.MainPage;
import project.pageObject.SearchResultPage;
import project.pageObject.TransactionPage;

public class TestCase9 extends Base {

    @Test
    public void testCase9() throws InterruptedException {
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
        if(searchResultPage.accept.isDisplayed()) {
            searchResultPage.accept.click();
        }
        searchResultPage.name.sendKeys("Anya");
        searchResultPage.surname.sendKeys("Chevidaeva");
        Browser.ScrollPage("0","9000");
        searchResultPage.MesClose.click();
        searchResultPage.acceptData.hoverElement();
        searchResultPage.acceptData.click();
        searchResultPage.email.waitVisibilityOfElement();
        searchResultPage.email.sendKeys("test.test@gmail.com");
        searchResultPage.check.click();
        searchResultPage.chooseVariant.click();
        searchResultPage.oplata.hoverElement();
        searchResultPage.oplata.click();
        Thread.sleep(3000);
        searchResultPage.oplata.click();
        searchResultPage.MesClose.click();
        Browser.ScrollPage("0","500");
        searchResultPage.oplata.click();
        TransactionPage transactionPage = new TransactionPage();
        Assert.assertTrue(transactionPage.panel.isDisplayed(), "Transaction page did not opened");
        transactionPage.cardNumber.sendKeys("4258780059456841");
        transactionPage.cvv.sendKeys("111");
        transactionPage.month.click();
        transactionPage.year.click();
        transactionPage.continueButton.click();
        Assert.assertTrue(transactionPage.error.isDisplayed(), "Error panel does not exist");
    }
}
