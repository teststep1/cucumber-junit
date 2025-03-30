package com.teststep.demo.base;

import io.cucumber.java8.Scenario;

public class Context {
    public Scenario scenario;

    public Scenario getScenario() {
        return scenario;
    }

    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    public void log(String message) {
        if (scenario != null) {
            scenario.log(message);
        } else {
            System.out.println("Scenario is null: " + message);
        }
    }
}
