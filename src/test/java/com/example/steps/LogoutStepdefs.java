package com.example.steps;

import com.example.app.page.Logout;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStepdefs {
    Logout logout = new Logout();
    @Given("I have Logged in")
    public void iHaveLoggedIn() {
        logout.clickLoginIcon();
        logout.inputEmail("retiamelina@gmail.com");
        logout.inputPassword("Retiaah10");
        logout.clickLoginBtn();
        logout.headerdiplayed();
    }

    @When("I click logout icon")
    public void iClickLogoutIcon() {
        logout.clickLogoutIcon();
    }

    @Then("I success logout")
    public void iSuccessLogout() {
        logout.loginIconDisplayed();
    }
}
