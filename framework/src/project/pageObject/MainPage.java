package project.pageObject;

import framework.elements.Input;
import framework.elements.Label;
import framework.elements.Button;
import framework.utils.LogUtils;
import org.openqa.selenium.By;

public class MainPage {

    public Input cityFrom = new Input(By.xpath("//input[@name=' front-from']"),"city from");
    public Input cityTo = new Input(By.xpath("//input[@name=' front-to']"),"city to");
    public Button search = new Button(By.xpath("//button[contains(@class,'act btn btn-y')]"),"search");
    public Label panel = new Label(By.xpath("//div[@class='front-form']"),"search panel");
    public Button calendarFrom = new Button(By.xpath("//div[contains(@class,'date-filter-trigger act departureDatePickerTrigger start-page bordered-2')]"),"calendar");
    public Button yesterday = new Button(By.xpath("//td[@class='is-disabled' and @data-day='6']"),"yesterday");
    public Button languagesMenu = new Button(By.xpath("//li[@class='act top-submenu top-languages']"),"languages menu");
    public Button ruLang = new Button(By.xpath("//a[contains(text(),'RU')]"),"RU language");
    public Label textCityFrom = new Label(By.xpath("(//div[@class='form-label']//span)[1]"),"Text city from");
    public Button dayWeek = new Button(By.xpath("//button[contains(text(),'18')]"),"day week");
    public Button vilnus = new Button(By.xpath("//div[contains(@class,'form-item required form-text form-dropdown bordered start-page front-from')]//div[text()='Вильнюс']"),"Accept city from");
    public Button minsk = new Button(By.xpath("//div[contains(@class,'form-item required form-text form-dropdown bordered start-page front-to')]//div[text()='Минск']"),"Accept city from");
    public Button toFrom = new Button(By.xpath("(//div[contains(@class,' form-radio-box bordered ')])[2]"),"To and from");
    public Button calendarTo = new Button(By.xpath("//div[contains(@class,'date-filter-trigger act arrivalDatePickerTrigger start-page bordered-2')]"),"calendar");
    public Button dayWeekNext = new Button(By.xpath("//button[contains(text(),'24')]"),"day week");
    public Button pass = new Button(By.xpath("//div[@class='passengers-count-open form-label']"),"pass");
    public Button plusPass = new Button(By.xpath("(//button[contains(@class,'count-icon count-plus act')])[1]"),"plus pass");
    public Label countPass = new Label(By.xpath("(//div[@class='count-value'])[1]"),"Count pass");



    public Button flights = new Button(By.xpath("//div[text()='FLIGHTS']"),"flyghts");
    public Label panelSearch = new Label(By.xpath("//div[@id='home-body']"),"Home panel");
    //public Button search = new Button(By.xpath("//div[@data-autobot-element-id='DASH_TAB_HOTELS_SUBMIT']"), "search");
    public Label location = new Label(By.xpath("//input[@id='location']"), "Location");
    public Button departingFrom = new Button(By.xpath("//input[@id='flight-departure-airport0']"),"departing from");
    public Button goingTo = new Button(By.xpath("//input[@id='flight-arrival-airport0']"),"going to");
    public Button findFlight = new Button(By.xpath("//button[@class='sc-jKVCRD ghhSHN']"),"find flight");
    public Button signIn = new Button(By.xpath("//span[@class='icon-utility-svg']"), "Sign in");
    public Button googleIn = new Button(By.xpath("//button[@id='signin-view__google-button-top']"),"Google sign in");
    public Button chooseTo = new Button(By.xpath("//div[@id='flight-arrival-airport0-dropdown-item-0']"),"choose to");
    public Button chooseFrom = new Button(By.xpath("//div[@id='flight-departure-airport0-dropdown-item-0']"),"choose from");
    public Button startSaving = new Button(By.xpath("//a[@class='sc-4sxbit-0 fxvGYP sc-iBEsjs caJGWI']"),"Start saving");
    public Label userActive = new Label(By.xpath("//span[@id='sign-in-module__user-name-signedIn']"),"User");
    public Label email = new Label(By.xpath("//input[@id='signin-first-name']"),"email");
    public Label password = new Label(By.xpath("//input[@id='password']"),"password");
    public Button goSignIn = new Button(By.xpath("//button[@id='button-sign-in']"),"sign in");
    public Button user = new Button(By.xpath("//span[@id='sign-in-module__user-name-signedIn']"),"user");
    public Button myProfile = new Button(By.xpath("//span[contains(text(),'My Profile')]"),"My profile");
    public Button recommend = new Button(By.xpath("//div[@class='sc-1ko5lyf-1 dJQAwu sc-fONwsr fkDzPT sc-kUaPvJ crubYl']//div[1]//div[1]//div[1]//div[3]//a[1]"),"Recommend");
    public Button emailAddress = new Button(By.xpath("//input[@placeholder='Enter your email address']"),"Spam");
    public Button sendDeals = new Button(By.xpath("//button[@class='sc-fOICqy yZmkT sc-jKVCRD bAHemR']"),"Send deals");
    public Label checkSendDeals = new Label(By.xpath("//div[@class='sc-1luj5w8-0 gcojPo sc-VJcYb iQtMzx']"),"Check Send deals");
    public Button cruisers = new Button(By.xpath("//div[contains(text(),'CRUISES')]"),"Cruisers");
    public Button caribbean = new Button(By.xpath("//select[@id='location']//option[2]"),"Cruisers");
    public Button findCruiser = new Button(By.xpath("//button[@class='sc-jKVCRD ghhSHN']"),"find cruiser");


}
