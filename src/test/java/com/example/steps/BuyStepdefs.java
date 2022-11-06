package com.example.steps;

import com.example.app.page.Buy;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyStepdefs {
    Buy buy = new Buy();
    @When("I click buy item PS5")
    public void iClickBuyItemPS5() {
        buy.clickBuyBtnPs5();
    }

    @When("I click buy item PS2")
    public void iClickBuyItemPS2() {
        buy.clickBuyBtnPs2();
    }

    @Then("Item successfully added to cart")
    public void itemSuccessfullyAddedToCart() {
        buy.numberOnCartDisplayed();
    }


}
