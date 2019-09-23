package Model.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
	
	public WebDriver d;
	
	public WebDriver getDriver() {
		return d;
	}

	public void setDriver(WebDriver d) {
		this.d = d;
	}

	public void createDriver(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--start-maximized");
		op.addArguments("--incognito");
		d=new ChromeDriver(op);
		
	}

}
