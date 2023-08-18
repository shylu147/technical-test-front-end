package com.virgingames.steps;

import com.virgingames.pages.CasinoPage;
import com.virgingames.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CasinoSteps {
    @And("I click on casino tab")
    public void iClickOnCasinoTab() {
        new HomePage().clickOnCasinoTab();
    }

    @Then("I should be navigate to the casino page and get {string}")
    public void iShouldBeNavigateToTheCasinoPageAndGet(String exp) {
        Assert.assertEquals(new CasinoPage().getCasinoText(),exp);
    }
}
