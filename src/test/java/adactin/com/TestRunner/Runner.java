package adactin.com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\Features",glue = "adactin.com.Stepdefination",
tags = "@TC103",
plugin = {"json:target/cucumber-reports/reporta.json","html:target/cucumber-reports"})

public class Runner {

}
//xml report-"pretty","html:target/cucumber-reports"