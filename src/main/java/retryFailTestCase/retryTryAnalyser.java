package retryFailTestCase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryTryAnalyser implements IRetryAnalyzer {

	int counter = 0;
	int limtRetry = 3;

	@Override
	public boolean retry(ITestResult result) {
		if (counter < limtRetry) {
			counter++;
			return true;
		}
		return false;
	}

}
