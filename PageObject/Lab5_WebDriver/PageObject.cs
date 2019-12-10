using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.Support.PageObjects;
using PageObject.Actions;
using System.Threading;
using OpenQA.Selenium.Support.UI;

namespace PageObject
{
    [TestClass]
    public class PageObject
    {
        IWebDriver Browser;

        [TestInitialize]
        public void Setup()
        {
            Browser = new ChromeDriver();
            Browser.Manage().Window.Maximize();
            Browser.Navigate().GoToUrl("https://www.traukiniobilietas.lt/portal/");
        }

        [TestMethod]
        public void SameСityOfDepartureAndArrival()
        {
            FromToStations fromToStations = new FromToStations(Browser).InputFromToStations("Vilnius", "Vilnius");
            ConfirmSelectionCriteria confirmSelectionCriteria = new ConfirmSelectionCriteria(Browser).ClickSearchButton();
            Browser.Manage().Timeouts().ImplicitWait = TimeSpan.FromSeconds(10);
            var errorBlock = Browser.FindElement(By.XPath("//p[contains(@id,'4Ck6')]"));
            Assert.AreEqual("Nurodytai dienai jūsų paiešką atitinkančių kelionių nerasta", errorBlock.Text);
        }

        [TestMethod]
        public void NoArrivalSelected()
        {
            FromToStations fromStations = new FromToStations(Browser).InputFromStations("Vilnius");
            ConfirmSelectionCriteria confirmSelectionCriteria = new ConfirmSelectionCriteria(Browser).ClickSearchButton();
            var stationTo = Browser.FindElement(By.XPath("//input[contains(@id,'54-labeledInput')]"));
            Assert.IsNotNull(stationTo.GetCssValue("border-bottom-color:rgba(255,47,47,1)"));


        }

        [TestCleanup]
        public void Clean()
        {
            Browser.Quit();
        }
    }
}
