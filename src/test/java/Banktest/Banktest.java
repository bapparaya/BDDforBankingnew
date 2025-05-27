package Banktest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",       // path to your .feature files
        glue = {"stepdefinitions"},                     // package containing step defs
        plugin = {"pretty", "html:target/cucumber-report.html"}, // report generation
        monochrome = true,                              // cleaner console output
        dryRun = false                                  // change to true to check steps without running
)
public class Banktest {
}
