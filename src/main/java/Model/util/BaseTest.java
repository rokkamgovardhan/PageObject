package Model.util;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	public Driver d;
	//@BeforeTest
	public void createDriver() {
		d = new Driver();
		d.createDriver();
	}
	
	
	@AfterTest(alwaysRun=true)
	public void tearDown() {
		//d.getDriver().quit();
	}

}
