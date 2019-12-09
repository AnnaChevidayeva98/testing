using OpenQA.Selenium;
using OpenQA.Selenium.Support.PageObjects;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PageObject.Actions
{
    class FromToStations
    {
        [FindsBy(How = How.XPath, Using = "//input[contains(@id,'44-labeledInput')]")]
        private IWebElement DepartureStation { get; set; }

        [FindsBy(How = How.XPath, Using = "//input[contains(@id,'54-labeledInput')]")]
        private IWebElement ArrivalStation { get; set; }

        public FromToStations(IWebDriver browser)
        {
            PageFactory.InitElements(browser, this);
        }

        public FromToStations InputFromToStations(string departureStation, string arrivalStation)
        {
            DepartureStation.SendKeys(departureStation);
            ArrivalStation.SendKeys(arrivalStation);
            return this;
        }
        public FromToStations InputFromStations(string departureStation)
        {
            DepartureStation.SendKeys(departureStation);
            return this;
        }
    }
}
