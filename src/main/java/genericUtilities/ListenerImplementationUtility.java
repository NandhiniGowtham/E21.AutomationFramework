package genericUtilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * This class provides implementation to ITestListener Interface of TestNG
 * @author Nandhini V
 *
 */

public class ListenerImplementationUtility  implements ITestListener {


	public void onTestStart(ITestResult result) {
		
		//Capture method Name
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+" - Test execution Started");
		
	}

	public void onTestSuccess(ITestResult result) {
		
		//Capture method Name
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+" - Test PASS");
		
	}

	public void onTestFailure(ITestResult result) {
		
		//Capture method Name
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+" - Test FAIL");
		
		//Capture the Exception
		System.out.println(result.getThrowable());
		
		//Capture the screenshot
		SeleniumUtility s = new SeleniumUtility();
		JavaUtility j = new JavaUtility();
		
		//Configure screenshot name
		String screenshotName = methodName+"-"+j.getSystemDate();
		
		try {
			s.captureScreenShot(BaseClass.sDriver, screenshotName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		
		//Capture method Name
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+" - Test SKIP");
		
		//Capture the Exception
		System.out.println(result.getThrowable());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
		System.out.println("Suite execution Started");
		
	}

	public void onFinish(ITestContext context) {
		
		System.out.println("Suite execution Finished");
		
	}
	
	
}
