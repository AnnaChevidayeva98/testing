package project.pageObject;

import framework.elements.Button;
import framework.elements.Input;
import framework.elements.Label;
import org.openqa.selenium.By;

public class TransactionPage {
    public Label panel = new Label(By.xpath("//form[@id='payment-form']"), "Panel");
    public Button continueButton = new Button(By.xpath("//input[@id='continue']"),"continue");
    public Label error = new Label(By.xpath("//div[@class='error']"), "error");
    public Input cardNumber = new Input(By.xpath("//input[@id='card_number']"), "cardNumber");
    public Input cvv = new Input(By.xpath("//input[@id='cv2_number']"), "cvv");
    public Input month = new Input(By.xpath("//select[@id='exp_month']//option[contains(text(),'--')]"), "month");
    public Input year = new Input(By.xpath("//select[@id='exp_year_dummy']//option[contains(text(),'--')]"), "year");


}
