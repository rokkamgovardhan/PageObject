package Model.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Model.util.Driver;

public class BasePage {
	Driver d;
	public BasePage(Driver d) {
		this.d = d;
	}
	
	
	public void type(WebElement ele, String val) {
		try {
			ele.sendKeys(val);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void click(WebElement ele) {
		try {
			ele.click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public WebElement findElement(By Value) {
		return d.getDriver().findElement(Value);
	}
	
	

}
