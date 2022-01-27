package com.cybertek.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",// this plug in stores failed scenarios in rerun.txt file,
                "json:target/cucumber.json" // generate json execution report to be used html report

        },
        features = "src/test/resources/features",
        glue = "com/cybertek/step_definitions",
        dryRun = false,
        tags = "@wip"
)
public class CukesRunner {

}
