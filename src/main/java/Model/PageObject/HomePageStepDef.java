package Model.PageObject;

import org.openqa.selenium.WebElement;

import Model.util.Driver;
import Model.util.ObjectRepo;

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
		WebElement ele = findElement(ObjectRepo.login_Username_txt);
		type(ele, "admin");
		type(findElement(ObjectRepo.login_Password_txt),"admin123");
		click(findElement(ObjectRepo.login_login_btn));
		return new DashBoardPage(d);
	}
	
	public void add(){
		syso("printing the values");
	}
	

}
