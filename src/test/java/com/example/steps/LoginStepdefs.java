package com.example.steps;

import com.example.app.page.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdefs {
    Login login = new Login();
    @When("I input email {string} and password {string}")
    public void iInputEmailAndPassword(String arg0, String arg1) {
        login.inputEmail(arg0);
        login.inputPassword(arg1);
    }

    @And("I click login button")
    public void iClickLoginButton() {
        login.clickLoginBtn();
    }

    @Then("I will get result {string}")
    public void iWillGetResult(String result) {
        if (result.equals("error email")) {
            login.errorMsgEmailDisplayed();
        } else if (result.equals("error password")){
            login.errorMsgPasswordDisplayed();
        } else if (result.equals("error message")) {
            login.errormsgDisplayed();
        } else if (result.equals("go to home page")) {
            login.headerDisplayed();

        }
    }
}
