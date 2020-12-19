package com.test;

import com.requirement.Check24;
import com.step.Check24EndUserSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@Story(Check24.ApplyCreditCard.SubmitFormWithEmptyPersonalData.class)
@RunWith(SerenityRunner.class)
public class Check24CreditCardErrorTest {

    @Managed
    WebDriver driver;

    @Steps
    Check24EndUserSteps endUser;

    @Test
    public void submitEmptyFormShouldDisplayErrorMessage() {
        endUser.openHomePage();
        endUser.clickOnAkzeptieren();
        endUser.clickOnFirstListProduct();
        endUser.clickOnDialogPageWeiter();
        endUser.verifyErrorMessage();
    }
}