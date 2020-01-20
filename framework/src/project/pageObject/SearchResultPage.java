package project.pageObject;

import framework.elements.Button;
import framework.elements.Input;
import framework.elements.Label;
import org.openqa.selenium.By;

public class SearchResultPage {
    public Button MesClose = new Button(By.xpath("//span[@class='cookies-message-close']"),"message close");
    public Label resultPanel = new Label(By.xpath("//div[contains(@class,'main-cont departure-page')]"), "resultPanel");
    public Label schedulePanel = new Label(By.xpath("//div[contains(@class,'timetable-row departure-row complete')]"),"Schedule panel");
    public Button price = new Button(By.xpath("(//div[contains(@class,'timetable-price departure-price act timetable-second-class departure-second-class')])[1]"), "price");
    public Button chooseClass = new Button(By.xpath("(//div[contains(@class,'timetable-submit-btn departure-submit-btn act')])[1]"), "class");
    public Button accept = new Button(By.xpath("//div[contains(@class,'checkout-item-modal-trigger modal-trigger policy-body-btn form-item act btn btn-y passenger-submit')]"), "submit");
    public Button acceptData = new Button(By.xpath("//div[contains(@class,'form-item act btn btn-y passenger-submit')]"), "accept data");
    public Label errorPanel = new Label(By.xpath("//div[contains(@class,'inline-error active')]"),"error panel");
    public Input name = new Input(By.xpath("//input[@name='passenger-name']"),"name");
    public Input surname = new Input(By.xpath("//input[@name='passenger-surname']"),"surname");
    public Input email = new Input(By.xpath("//input[@name='checkout-email']"),"email");
    public Input check = new Input(By.xpath("//div[@class='form-checker']"),"check");
    public Button chooseVariant = new Button(By.xpath("//div[contains(@class,'form-item checkout-submit btn btn-y act')]"),"variant");
    public Button oplata = new Button(By.xpath("(//div[contains(@class,'checkout-bank act z-div')]//a)[1]"),"oplata");


    public Label regions = new Label(By.xpath("(//div[contains(@class,'AttributesRow__AttributesRowText-sc-1nckqy5-2 fkGYaN indexesm__Box-sc-1ot0wsx-0 epaVjg')])[1]"),"regions");
    public Button shortlist = new Button(By.xpath("(//span[@class='icon-heart-open-b'])[1]"), "shortlist button");
    public Button myShortList = new Button(By.xpath("//a[@id='link-shortlist']"),"MyShortList");
    public Label hotelName = new Label(By.xpath("(//a[@class='headerLink fl'])[1]"),"Hotel name");
    public Label star = new Label(By.xpath("//label[@data-autobot-element-id='HTL_LIST_FILTER_RATING_CHOOSE_5']"), "5 star");
    public Label star5 = new Label(By.xpath("//span[@class='sc-iQtOjA etYfNO indexesm__Text-sc-1ot0wsx-5-span ctlOkh']"), "5 star");
    public Button currency = new Button(By.xpath("//span[@id='currency-label']"),"Currency");
    public Button euro = new Button(By.xpath("//a[@id='cc-EUR']"),"euro");
    public Label checkCurrency = new Label(By.xpath("//label[@class='indexesm__Label-sc-1ot0wsx-27 hQkixn']"), "check currency");






}
