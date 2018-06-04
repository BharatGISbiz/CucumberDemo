package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features",glue = "stepDefinition",
                 //plugin = { "pretty" },
                 //plugin = { "usage" }, // TO check the Time taken for each step definition
                 //plugin = { "pretty", "html:target/cucumber-reports" }, //TO generate HTML report. It will be saved in target folder of the project.
				 //plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" }, //To generate Json report.
				   plugin = { "pretty", "junit:target/cucumber-reports/Cucumber.xml" }, // To generate xml report
				   monochrome = true)

public class TestRunner {

}
