package step.definition;

import core.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.Utils;

public class Initializer extends Base {
	
	/*
	 * This class hosts two methods that will run before and after each scenario
	 * Cucumber has Hooks and we have BeforeHooks and AfterHooks
	 * Before Hooks executes a block of code before each scenario
	 * After Hooks executes a block of code after each scenario 
	 */
	@Before
	public void beforeHooks(Scenario scenario) {
		logger.info("Scenario " + scenario.getName() + " started");
		browser(); // this method will select the browser 
		launchBrowser(); // this method will launch the browser
		
	}
	
	
	@After
	public void afterHooks(Scenario scenario) {
		Utils.takeScreenshotForStep();
		tearDown();
		logger.info("Scenario " + scenario.getName() + " " + scenario.getStatus());
	}

}