package com.carphonewarehouse.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/com/carphonewarehouse/features"},
        glue = {"com/carphonewarehouse/hooks","com/carphonewarehouse/stepDefinitions"},
        plugin = {"pretty", "json:target/report.json",
                "de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber"}
)

public class TestRunner {
}
