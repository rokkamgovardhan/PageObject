package Model.OjectRepos;

import org.openqa.selenium.By;

public class ObjectRepo {
	
	//Home Page
	public static By login_Username_txt = By.xpath("//input[@id='txtUsername475']");
	public static By login_Password_txt = By.xpath("//input[@id='txtPassword']");
	public static By login_login_btn    = By.xpath("//input[@id='btnLogin']");
	
	
	//dash Borard
	public static By dashBoard_logo_img = By.xpath("//img[@alt='OrangeHRM']");

}
