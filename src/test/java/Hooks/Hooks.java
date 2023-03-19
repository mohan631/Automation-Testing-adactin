package Hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Baseclass.Baseclass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Baseclass{

	@After
	public void AfterHooks(Scenario scenario) {
		
	scenario.attach(reports_Screenshot(), "image/png", "screenshot");
	driver.quit();
	}
}
