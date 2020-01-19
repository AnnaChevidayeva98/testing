package framework.elements;

import framework.base.BaseElement;
import org.openqa.selenium.By;

public class Input extends BaseElement {
    public Input(By locator, String nameOfElement) {
        super(locator, nameOfElement);
    }
}