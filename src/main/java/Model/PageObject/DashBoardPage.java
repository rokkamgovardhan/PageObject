package Model.PageObject;

import Model.OjectRepos.ObjectRepo;
import Model.util.Driver;


public class DashBoardPage extends BasePage{

	public DashBoardPage(Driver d) {
		super(d);
		// TODO Auto-generated constructor stub
		findElemnts();
	}

	public void findElemnts(){
		findElement(ObjectRepo.dashBoard_logo_img);
	}
	
	
	
}
