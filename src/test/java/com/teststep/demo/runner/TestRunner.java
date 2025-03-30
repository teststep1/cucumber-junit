package com.teststep.demo.runner;

import org.junit.platform.suite.api.*;
import io.cucumber.junit.platform.engine.Constants;

@Suite
@IncludeEngines("cucumber")
@ConfigurationParameter(key = Constants.FEATURES_PROPERTY_NAME, value = "classpath:features")
@ConfigurationParameter(key = Constants.GLUE_PROPERTY_NAME, value = "com/teststep/demo/steps")
@ConfigurationParameter(key = Constants.FILTER_TAGS_PROPERTY_NAME, value = "@temp")
@ConfigurationParameter(key = Constants.EXECUTION_DRY_RUN_PROPERTY_NAME, value = "false")
//@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME, value="pretty, html:target/cucumber-report/cucumber.html")
//@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME, value="pretty, summary, io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm")
@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME, value = "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm")

public class TestRunner {



}
