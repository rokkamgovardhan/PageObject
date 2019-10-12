package Model.retryAnalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryAnalyzer implements IRetryAnalyzer{
	int count =0;
	int retryCount = 2;
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(count<retryCount) {
			count++;
			return true;
		}
		else
			return false;
	}

}
