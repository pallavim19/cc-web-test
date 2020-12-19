package com.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

/**
 * Web elements present in Confirmation Page of Credit Card Web Application
 */
@DefaultUrl("https://finanzen.check24.de/accounts/d/kreditkarte/result.html")
public class Check24MainPage extends PageObject {

    public Check24MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='1.']/../..//a[text()='weiter']")
    private WebElementFacade firstListProductAndWeiterButton;

    @FindBy(xpath = "//body/../..//a[text()='Akzeptieren']")
    private WebElementFacade akzeptierenButton;

    public void clickOnAkzeptieren() {
        element(akzeptierenButton).waitUntilVisible();
        akzeptierenButton.click();
    }

    public void clickOnFirstListProduct() {
        element(firstListProductAndWeiterButton).waitUntilVisible();
        firstListProductAndWeiterButton.click();
    }
}