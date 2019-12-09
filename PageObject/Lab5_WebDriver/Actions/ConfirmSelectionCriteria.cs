using OpenQA.Selenium;
using OpenQA.Selenium.Support.PageObjects;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PageObject.Actions
{
    class ConfirmSelectionCriteria
    {
        [FindsBy(How = How.XPath, Using = "//span[contains(text(),'Ieškoti')]")]
        private IWebElement searchButton { get; set; }

        public ConfirmSelectionCriteria(IWebDriver browser)
        {
            PageFactory.InitElements(browser, this);
        }

        public ConfirmSelectionCriteria ClickSearchButton()
        {
            searchButton.Click();
            return this;
        }
    }
}
