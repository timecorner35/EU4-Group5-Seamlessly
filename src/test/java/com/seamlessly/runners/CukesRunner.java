package com.seamlessly.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features/smoke",
        glue = "com/seamlessly/stepdefinitions",
        dryRun = false
//        tags = "@SEAM-172"


)


public class CukesRunner {

}
