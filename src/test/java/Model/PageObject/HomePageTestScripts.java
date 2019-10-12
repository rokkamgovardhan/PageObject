package Model.PageObject;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Model.util.BaseTest;

public class HomePageTestScripts extends BaseTest{
	
	/*@BeforeTest
	public void intialiseDriver() {
		//super.createDriver();
	}*/
	
	
	@Test
	public void test() {
		HomePageStepDef homePageStepDef = new HomePageStepDef(d);
		DashBoardPage dashBoardPage = homePageStepDef.login();
	}
	
	/*@Test
	public void practice() {
		String[] s = new String[3];
		s[0] ="ram";
		s[1] = "raj";
		s[2]="rohit";
		
		String[][] d = new String[2][2]; 
		
		d[0][0] = "sam";
		
		for(int i=0;i<1;i++) {
			for(int j=0;j<1;j++) {
			if(d[i][j]=="sam") {
				System.out.println("rohith value index is"+i+d[i][j]);				
			}
			}
		}
	}

	@Test
	public void run() {
		
		List l = new LinkedList();
		l.add("ab");
		l.add(2);
		l.add("ab");
		l.add(2);
		System.out.println(l);
		System.out.println(l.get(0));
	}
	
	@Test
	public void test1() {
		
		Map m = new LinkedHashMap();
		m.put("New York", 10019);
		m.put("ohio", 43054);
		System.out.println(m.get("New York"));
	}
	
	@Test
	public void test2() {
		
		Map m = new LinkedHashMap();
		m.put("New York", 10019);
		m.put("ohio", 43054);
		System.out.println(m.get("New York"));
	}
	
	@Test
	public void abc() {
		System.out.println("Enter Number");
		Scanner s = new Scanner(System.in);
		String val = s.nextLine();
		System.out.println();
		System.out.println(val);
		
		char[] ch = val.toCharArray();
		StringBuffer sb = new StringBuffer();
		StringBuffer temp = new StringBuffer();
		for(int i=0;i<ch.length;i++) {
			if(Character.isDigit(ch[i])) {
				sb.append(temp.reverse());
				temp.delete(0, temp.capacity());
				sb.append(ch[i]);
			}else {
				temp.append(ch[i]);
			}
		}
		
		System.out.println(sb.toString());
	}
*/	
	@Test(groups= {"Functiona"},description="This test script about so on so function")
	public void bbc() throws InterruptedException {
		//System.out.println("run");
		try {
			Thread.sleep(2500);
		}catch(Exception e) {
			
		}
		//Assert.fail();
		//throw new NullPointerException();
	}
	
	@Test(groups= {"Functiona"},description="This test script about so on so function")
	public void cbc() throws InterruptedException {
		//System.out.println("run");
		try {
			Assert.fail();
		}catch(Exception e) {
			
		}
		//Assert.fail();
		//throw new NullPointerException();
	}
	
	@Test(dependsOnMethods= {"bbc"},priority=1)
	public void ccc() {
		System.out.println("ccc");
	}
	//@Parameters({"username","passw0ord"})
	@Test(groups="abc")
	public void runner(String a,String b) {
		System.out.println(a+b);
	}
	
	@DataProvider(name="runner")
	public Object[][] data(){
		return new Object[][] {{"a","b"},{"c","d"}};
		//throw new SkipException("skipped intentionally");
	}	
	
	@Test
	public void asset() {
		
	}
}
