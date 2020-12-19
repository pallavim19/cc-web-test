package com.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

/**
 * Web element present in Confirmation Page of Credit Card Web Application
 */
public class Check24ConfirmationPage extends PageObject {

    public Check24ConfirmationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//li[@class=\"status-steps__item status-steps__item--active status-steps__item--done\"]")
    private WebElementFacade confirmationText;

    public boolean isConfirmationPagePresent() {
        return "2".equalsIgnoreCase(confirmationText.getAttribute("data-step"));
    }
}