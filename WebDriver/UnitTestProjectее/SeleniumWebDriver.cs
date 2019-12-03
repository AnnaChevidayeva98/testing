using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium;

namespace WebDriver
{
    [TestClass]
    public class SeleniumWebDriver
    {
        IWebDriver webDriver;


        [TestInitialize]
        public void StartTest()
        {
            webDriver = new ChromeDriver();
            webDriver.Navigate().GoToUrl("https://www.traukiniobilietas.lt/portal/");
        }

        [TestMethod]
        public void SameСityOfDepartureAndArrival()
        {
            var stationFrom = webDriver.FindElement(By.XPath("//input[contains(@id,'44-labeledInput')]"));
            var stationTo = webDriver.FindElement(By.XPath("//input[contains(@id,'54-labeledInput')]"));
            var datapicker = webDriver.FindElement(By.XPath("//div[contains(@id,'4C84')]"));
            var searchingButton= webDriver.FindElement(By.XPath("//img[contains(@id,'4Cu4')]"));
            stationFrom.SendKeys("Vilnius");
            stationTo.SendKeys("Vilnius");
            DateTime date = DateTime.Now;
            int day = date.AddDays(1).Day;
            datapicker.Click();
            var close = webDriver.FindElement(By.XPath("//span[@class='cookies-message-close']"));
            close.Click();
            var dayButton = webDriver.FindElement(By.XPath("//button[@data-pika-day='"+day+"']"));
            dayButton.Click();
            searchingButton.Click();
            webDriver.Manage().Timeouts().ImplicitWait = TimeSpan.FromSeconds(60);
            var errorBlock = webDriver.FindElement(By.XPath("//p[contains(@id,'4Ck6')]"));
            Assert.AreEqual("Nurodytai dienai jūsų paiešką atitinkančių kelionių nerasta", errorBlock.Text);
        }
        [TestMethod]
        public void NoArrivalSelected()
        {
            var stationFrom = webDriver.FindElement(By.XPath("//input[contains(@id,'44-labeledInput')]"));
            var datapicker = webDriver.FindElement(By.XPath("//div[contains(@id,'4C84')]"));
            var searchingButton = webDriver.FindElement(By.XPath("//img[contains(@id,'4Cu4')]"));
            stationFrom.SendKeys("Vilnius");
            DateTime date = DateTime.Now;
            int day = date.AddDays(1).Day;
            datapicker.Click();
            var close = webDriver.FindElement(By.XPath("//span[@class='cookies-message-close']"));
            close.Click();
            var dayButton = webDriver.FindElement(By.XPath("//button[@data-pika-day='"+day+"']"));
            dayButton.Click();
            searchingButton.Click();
            webDriver.Manage().Timeouts().ImplicitWait = TimeSpan.FromSeconds(60);
            var stationTo = webDriver.FindElement(By.XPath("//input[contains(@id,'54-labeledInput')]"));
            Assert.AreEqual("rgba(255,47,47,1)", stationTo.GetCssValue("border-bottom-color"));

        }


        [TestCleanup]
        public void FinishTest()
        {
             webDriver.Quit();
        }

        private IWebElement GetWebElementByXPath(string xPath)
        {
            return webDriver.FindElement(By.XPath(xPath));
        }
        private IWebElement GetWebElementByName(string name)
        {
            return webDriver.FindElement(By.Name(name));
        }


    }
}
