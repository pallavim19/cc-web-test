package com.test;

import com.requirement.Check24;
import com.step.Check24EndUserSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@Story(Check24.ApplyCreditCard.SubmitFormWithCorrectPersonalData.class)
@RunWith(SerenityRunner.class)
public class Check24CreditCardSuccessTest {

    @Managed
    WebDriver driver;

    @Steps
    Check24EndUserSteps endUser;

    @Test
    public void submitPersonalDataShouldProcessSuccessfully() {
        endUser.openHomePage();
        endUser.verifyKreditKarteCookie(driver);
        endUser.clickOnAkzeptieren();
        endUser.clickOnFirstListProduct();
        endUser.fillFormData();
        endUser.clickOnDialogPageWeiter();
        endUser.verifyConfirmationPage();
    }
}