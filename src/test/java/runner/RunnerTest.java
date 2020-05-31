package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/Features/"},
glue={"stepDefinitions"},
tags = {"@E2E"},
format={"pretty","html:report"},
monochrome= true,
dryRun=false,
strict=false
		
		)

public class RunnerTest {
	//junit method to run
	@AfterClass
	public static void teardown() {

	}
}
