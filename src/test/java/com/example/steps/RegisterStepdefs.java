package com.example.steps;

import com.example.app.page.Register;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepdefs {
    Register register = new Register();
    @Given("I am on home page")
    public void iAmOnHomePage() {
        register.loginIconDisplayed();
    }

    @And("I click login icon")
    public void iClickLoginIcon() {
        register.clickLoginIcon();
    }

    @And("I click register")
    public void iClickRegister() {
        register.clickRegister();
    }

    @And("clear field name, email, and password")
    public void clearFieldNameEmailAndPassword() {
        register.clearField();
    }

    @When("I input name {string} email {string} and password {string}")
    public void iInputNameEmailAndPassword(String arg0, String arg1, String arg2) {
        register.inputName(arg0);
        register.inputEmail(arg1);
        register.inputPassword(arg2);
    }

    @And("I click register button")
    public void iClickRegisterButton() {
        register.clickRegisterButton();
    }

    @Then("I get result {string}")
    public void iGetResult(String result) {
        if (result.equals("error message name")) {
            register.errorMessageNameDisplayed();
        } else if (result.equals("error message email")){
            register.errorMessageEmailDisplayed();
        } else if (result.equals("error message password")) {
            register.errorMessagePasswordDisplayed();
        } else if (result.equals("go to home page")) {
            register.headerDisplayed();

        }
    }
}
