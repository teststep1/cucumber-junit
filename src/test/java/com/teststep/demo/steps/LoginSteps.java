package com.teststep.demo.steps;

import com.teststep.demo.base.Context;
import io.cucumber.java8.En;
import io.cucumber.java8.Scenario;

public class LoginSteps implements En {

    public LoginSteps(Context context) {

        Given("I am on the login page", () -> {
            context.log("Log-Step-1");
        });

        When("I fill in Username with {string} value", (String string) -> {
            context.log("Log-Step-2");
        });

        When("I fill in password with {string} value", (String string) -> {

        });

        When("I click on login button", () -> {

        });
    }
}
