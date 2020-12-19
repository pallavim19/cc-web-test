package com.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

/**
 * Web elements present in Form Page of Credit Card Web Application
 */
public class Check24FormPage extends PageObject {

    public Check24FormPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "login-lookup-email")
    private WebElementFacade emailInput;

    @FindBy(xpath = "//label[contains(text(), 'Herr')]")
    private WebElementFacade salutationHerrRadio;

    @FindBy(xpath = "//label[contains(text(), 'Frau')]")
    private WebElementFacade salutationFrauRadio;

    @FindBy(id = "application_debtors_debtor1_firstName")
    private WebElementFacade firstNameInput;

    @FindBy(id = "application_debtors_debtor1_lastName")
    private WebElementFacade lastNameInput;

    @FindBy(id = "application_debtors_debtor1_placeOfBirth")
    private WebElementFacade placeOfBirthInput;

    @FindBy(id = "application_debtors_debtor1_dateOfBirth")
    private WebElementFacade dateOfBirthInput;

    @FindBy(id = "application_debtors_debtor1_maritalStatus")
    private WebElementFacade maritalStatusInput;

    @FindBy(id = "application_debtors_debtor1_presentAddress_housingSituation")
    private WebElementFacade presentAddressHousingSituationInput;

    @FindBy(id = "application_debtors_debtor1_nationality")
    private WebElementFacade nationalityInput;

    @FindBy(id = "application_debtors_debtor1_presentAddress_zipCode")
    private WebElementFacade presentAddressHousingZipCodeInput;

    @FindBy(id = "application_debtors_debtor1_presentAddress_street")
    private WebElementFacade presentAddressStreetInput;

    @FindBy(id = "application_debtors_debtor1_presentAddress_houseNumber")
    private WebElementFacade presentAddressHouseNumberInput;

    @FindBy(id = "application_debtors_debtor1_contactData_mobile")
    private WebElementFacade contactDataMobileInput;

    @FindBy(id = "application_debtors_debtor1_contactData_email")
    private WebElementFacade contactDataEmailInput;

    @FindBy(id = "dialogBtnNext")
    private WebElementFacade weiterButton;

    @FindBy(xpath = "//div[contains(text(), 'Bitte geben Sie Ihren Vornamen ohne Zahlen oder Sonderzeichen an.')]")
    private WebElementFacade errorFirstNameText;

    @FindBy(xpath = "//div[contains(text(), 'Bitte wählen Sie eine Anrede aus.')]")
    private WebElementFacade errorSalutationText;

    @FindBy(xpath = "//div[contains(text(), 'Bitte geben Sie Ihren Nachnamen ohne Zahlen oder Sonderzeichen an.')]")
    private WebElementFacade errorLastNameText;

    @FindBy(xpath = "//div[contains(text(), 'Bitte geben Sie Ihren Geburtsort ohne Zahlen oder Sonderzeichen an.')]")
    private WebElementFacade errorBirthOfPlaceText;

    @FindBy(xpath = "//div[contains(text(), 'Bitte geben Sie Ihr Geburtsdatum an.')]")
    private WebElementFacade errorBirthDateText;

    @FindBy(xpath = "//div[contains(text(), 'Bitte wählen Sie Ihren Familienstand aus.')]")
    private WebElementFacade errorMartialStatusText;

    @FindBy(xpath = "//div[contains(text(), 'Bitte wählen Sie Ihre Wohnsituation aus.')]")
    private WebElementFacade errorPresentAddressHousingSituationText;

    @FindBy(xpath = "//div[contains(text(), 'Bitte wählen Sie ein Land aus.')]")
    private WebElementFacade errorNationalityText;

    @FindBy(xpath = "//div[contains(text(), 'Bitte geben Sie Ihre Postleitzahl an.')]")
    private WebElementFacade errorPresentAddressHousingZipCodeText;

    @FindBy(xpath = "//div[contains(text(), 'Bitte geben Sie Ihre Straße an.')]")
    private WebElementFacade errorPresentAddressStreetText;

    @FindBy(xpath = "//div[contains(text(), 'Bitte geben Sie Ihre Hausnummer an.')]")
    private WebElementFacade errorPresentAddressHouseNumberText;

    @FindBy(xpath = "//div[contains(text(), 'Für eventuelle Rückfragen benötigen wir Ihre deutsche Mobiltelefonnummer.')]")
    private WebElementFacade errorContactDataMobileText;

    @FindBy(xpath = "//div[contains(text(), 'Für den Versand der Antragsbestätigung benötigen wir Ihre E-Mail-Adresse.')]")
    private WebElementFacade errorContactDataEmailText;

    public void enterEmail(String email) {
        element(emailInput).waitUntilVisible();
        element(emailInput).typeAndEnter(email);
    }

    public void clickOnSalutation(String gender) {
        if ("HERR".equalsIgnoreCase(gender)) {
            salutationHerrRadio.click();
        } else {
            salutationFrauRadio.click();
        }
    }

    public void enterFirstName(String firstName) {
        firstNameInput.type(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameInput.type(lastName);
    }

    public void enterDateOfBirth(String dateOfBirth) {
        dateOfBirthInput.type(dateOfBirth);
    }

    public void enterPlaceOfBirth(String placeOfBirth) {
        placeOfBirthInput.type(placeOfBirth);
    }

    public void enterMaritalStatus(String martialStatus) {
        maritalStatusInput.selectByValue(martialStatus);
    }

    public void enterNationality(String nationality) {
        nationalityInput.selectByValue(nationality);
    }

    public void enterContactDataEmail(String email) {
        contactDataEmailInput.type(email);
    }

    public void enterPresentAddressHousingSituation(String presentAddressHousingSituation) {
        presentAddressHousingSituationInput.selectByValue(presentAddressHousingSituation);
    }

    public void enterPresentAddressHouseNumber(String presentAddressHouseNumber) {
        presentAddressHouseNumberInput.type(presentAddressHouseNumber);
    }

    public void enterContactDataMobile(String contactDataMobile) {
        contactDataMobileInput.type(contactDataMobile);
    }

    public void enterPresentAddressStreet(String presentAddressStreet) {
        presentAddressStreetInput.type(presentAddressStreet);
    }

    public void enterPresentAddressHousingZipCode(String presentAddressHousingZipCode) {
        presentAddressHousingZipCodeInput.type(presentAddressHousingZipCode);
    }

    public String emptyFirstNameErrorText() {
        return errorFirstNameText.getText();
    }

    public String emptyLastNameErrorText() {
        return errorLastNameText.getText();
    }

    public String emptySalutationErrorText() {
        return errorSalutationText.getText();
    }

    public String emptyBirthOfPlaceErrorText() {
        return errorBirthOfPlaceText.getText();
    }

    public String emptyBirthDateErrorText() {
        return errorBirthDateText.getText();
    }

    public String emptyMartialStatusErrorText() {
        return errorMartialStatusText.getText();
    }

    public String emptyPresentAddressHousingSituationText() {
        return errorPresentAddressHousingSituationText.getText();
    }

    public String emptyNationalityErrorText() {
        return errorNationalityText.getText();
    }

    public String emptyPresentAddressHousingZipCodeErrorText() {
        return errorPresentAddressHousingZipCodeText.getText();
    }

    public String emptyPresentAddressStreetErrorText() {
        return errorPresentAddressStreetText.getText();
    }

    public String emptyPresentAddressHouseNumberErrorText() {
        return errorPresentAddressHouseNumberText.getText();
    }

    public String emptyContactDataMobileErrorText() {
        return errorContactDataMobileText.getText();
    }

    public String emptyContactDataEmailErrorText() {
        return errorContactDataEmailText.getText();
    }

    public void clickOnWeiter() {
        element(weiterButton).waitUntilVisible();
        weiterButton.click();
    }
}