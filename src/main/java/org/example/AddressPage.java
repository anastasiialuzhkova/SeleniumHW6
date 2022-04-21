package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressPage extends BaseView {
    public AddressPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[contains(@id,'YMapsID')]/descendant::input")
    public WebElement addressField;

    public AddressPage address(String country) {
        addressField.sendKeys(country);
        return new AddressPage(driver);
    }

    @FindBy(xpath = "//div[contains(@id,'YMapsID')]/descendant::ymaps[@class='ymaps-2-1-79-searchbox-button-text']")
    public WebElement addressButton;

    public AddressPage clickAddressButton() {
        addressButton.click();
        return new AddressPage(driver);
    }
}