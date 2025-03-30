package com.teststep.demo.steps;

import com.teststep.demo.base.Context;
import io.cucumber.java.Before;
import io.cucumber.java8.En;
import io.cucumber.java8.Scenario;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;

public class Hooks implements En {

    public Hooks(Context context) {
        Before(scenario -> {
            context.setScenario(scenario);
            scenario.log("Starting scenario: " + scenario.getName()); // Log the scenario name
        });

//        After(scenario -> {
//            if (scenario.isFailed()) {
//                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//                Allure.addAttachment("Screenshot", new ByteArrayInputStream(screenshot));
//            }
//        });
        }
}
