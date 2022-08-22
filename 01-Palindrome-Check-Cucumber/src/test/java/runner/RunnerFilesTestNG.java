package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/FeatureFiles", glue = "stepdefs")
public class RunnerFilesTestNG extends AbstractTestNGCucumberTests {

}
