package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BaseView {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[@class='simple-menu__link simple-menu__link--country j-wba-header-item']")
    public WebElement countryMenu;

    public MainPage hoverCountryMenu(){
        actions.moveToElement(countryMenu).build().perform();
        return new MainPage(driver);
    }

    @FindBy(xpath = "//span[.='Беларусь']")
    public WebElement country;

    public MainPage clickCountry() {
        country.click();
        return new MainPage(driver);
    }
}
