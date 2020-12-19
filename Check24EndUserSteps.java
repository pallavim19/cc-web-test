package com.step;

import com.page.Check24FormPage;
import com.page.Check24ConfirmationPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import com.page.Check24MainPage;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

import static com.util.TestData.*;
import static org.apache.commons.lang3.StringUtils.isNoneEmpty;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Step definition for Check24 Credit Card Web pages.
 */
public class Check24EndUserSteps extends ScenarioSteps {

    private final static Logger LOGGER = Logger.getLogger(Check24EndUserSteps.class.getName());

    public Check24EndUserSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void clickOnAkzeptieren() {
        check24MainPage().clickOnAkzeptieren();
    }

    @Step
    public void clickOnFirstListProduct() {
        check24MainPage().clickOnFirstListProduct();
    }

    @Step
    public void clickOnDialogPageWeiter() {
        check24FormPage().clickOnWeiter();
    }

    @Step
    public void openHomePage() {
        check24MainPage().open();
    }

    @Step
    public void fillFormData() {
        //Persönliche Daten
        fillPersonalData();

        //Main residence address
        fillHouseData();

        //Contact Data
        fillContactData();

        check24FormPage().clickOnWeiter();
    }

    @Step
    public void fillPersonalData() {
        LOGGER.info("Fill personal Data");
        check24FormPage().enterEmail(EMAIL);
        check24FormPage().clickOnSalutation(HERR);
        check24FormPage().enterFirstName(FIRST_NAME);
        check24FormPage().enterLastName(LAST_NAME);
        check24FormPage().enterPlaceOfBirth(PLACE_OF_BIRTH);
        check24FormPage().enterDateOfBirth(DATE_OF_BIRTH);
        check24FormPage().enterMaritalStatus(MARTIAL_STATUS);
        check24FormPage().enterPresentAddressHousingSituation(HOUSING_SITUATION);
        check24FormPage().enterNationality(NATIONALITY);
    }

    @Step
    private void fillHouseData() {
        LOGGER.info("Fill House Data");
        check24FormPage().enterPresentAddressHousingZipCode(ZIP_CODE);
        check24FormPage().enterPresentAddressStreet(ADDRESS_STREET);
        check24FormPage().enterPresentAddressHouseNumber(HOUSE_NUMBER);
    }

    @Step
    private void fillContactData() {
        LOGGER.info("Fill Contact Data");
        check24FormPage().enterContactDataMobile(CONTACT_DATA_MOBILE);
        check24FormPage().enterContactDataEmail(CONTACT_DATA_EMAIL);
    }

    @Step
    public void verifyErrorMessage() {
        LOGGER.info("Verify Error Messages");
        //Persönliche Daten
        assertTrue(isNoneEmpty(check24FormPage().emptySalutationErrorText()));
        assertTrue(isNoneEmpty(check24FormPage().emptyFirstNameErrorText()));
        assertTrue(isNoneEmpty(check24FormPage().emptyLastNameErrorText()));
        assertTrue(isNoneEmpty(check24FormPage().emptyBirthOfPlaceErrorText()));
        assertTrue(isNoneEmpty(check24FormPage().emptyBirthDateErrorText()));
        assertTrue(isNoneEmpty(check24FormPage().emptyMartialStatusErrorText()));
        assertTrue(isNoneEmpty(check24FormPage().emptyPresentAddressHousingSituationText()));
        assertTrue(isNoneEmpty(check24FormPage().emptyNationalityErrorText()));

        //Main residence address
        assertTrue(isNoneEmpty(check24FormPage().emptyPresentAddressHousingZipCodeErrorText()));
        assertTrue(isNoneEmpty(check24FormPage().emptyPresentAddressStreetErrorText()));
        assertTrue(isNoneEmpty(check24FormPage().emptyPresentAddressHouseNumberErrorText()));

        //Contact
        assertTrue(isNoneEmpty(check24FormPage().emptyContactDataMobileErrorText()));
        assertTrue(isNoneEmpty(check24FormPage().emptyContactDataEmailErrorText()));
    }

    public void verifyConfirmationPage() {
        assertThat("Confirmation Page is Present", check24ConfirmationPage().isConfirmationPagePresent());
    }

    public Check24MainPage check24MainPage() {
        return getPages().currentPageAt(Check24MainPage.class);
    }

    public Check24FormPage check24FormPage() {
        return getPages().currentPageAt(Check24FormPage.class);
    }

    public Check24ConfirmationPage check24ConfirmationPage() {
        return getPages().currentPageAt(Check24ConfirmationPage.class);
    }

    public void verifyKreditKarteCookie(WebDriver driver) {
        assertThat("Is Cookie present", driver.manage().getCookies().contains(new Cookie("ppset","kreditkarte")));
    }
}