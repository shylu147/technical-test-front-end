package com.virgingames.steps;

import com.virgingames.pages.CasinoPage;
import com.virgingames.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomePageSteps {
    @Given("I am on home page")
    public void iAmOnHomePage() {

    }

    @When("I accept cookies all")
    public void iAcceptCookiesAll() throws InterruptedException {
        new HomePage().setAcceptCookies();
    }

    @Then("I should be able to see {string}")
    public void iShouldBeAbleToSee(String expectedText) {

        Assert.assertEquals(new HomePage().getWelcomeText(),expectedText);
    }




}
