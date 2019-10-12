package Model.PageObject;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import Model.OjectRepos.ObjectRepo;
import Model.util.Driver;


public class HomePageStepDef extends BasePage{

	public HomePageStepDef(Driver d) {
		super(d);
		// TODO Auto-generated constructor stub
		d.getDriver().get("\r\n" + 
				"https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		/*d.getDriver().navigate().to("\r\n" + 
				"https://opensource-demo.orangehrmlive.com/index.php/auth/login");*/
		
	}
	
	public DashBoardPage login() {
		//d.getDriver().manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		/*Wait w = new WebDriverWait(d.getDriver(), 50);
		w.until(ExpectedConditions.visibilityOf(findElement(Model.OjectRepos.ObjectRepo.login_Username_txt)));*/
		//fluent wait
		Wait w = new FluentWait(d.getDriver()).withTimeout(10, TimeUnit.SECONDS).pollingEvery(1, TimeUnit.SECONDS).ignoring(Exception.class);
		w.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver d) {
				// TODO Auto-generated method stub
				return d.findElement(By.cssSelector("input[type='Hyderbad']"));
			}

		});
		WebElement ele = findElement(Model.OjectRepos.ObjectRepo.login_Username_txt);
		type(ele, "admin");
		type(findElement(ObjectRepo.login_Password_txt),"admin123");
		click(findElement(ObjectRepo.login_login_btn));
		return new DashBoardPage(d);
	}
	
	public void add() {
		//sysos("printing");
	}


}
