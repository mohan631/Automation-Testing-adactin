package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\Features",glue ={"Stepdefinition","Hooks"},
plugin = {"html:target\\report\\Adactin_report.html",
		"json:target\\report\\Adactin_JReport.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
dryRun = true,monochrome = true)

public class Runner {

}
 