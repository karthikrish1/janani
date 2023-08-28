package testnglist;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class i1 implements ITestListener {

	public void onTestSuccess(ITestResult result) {
		System.out.println("passed ");
	}

	public void onTestFailure(ITestResult result) {
	System.out.println("Faileddd");
	}

	public void onStart(ITestContext context) {
		System.out.println("started");
	}

	public void onFinish(ITestContext context) {
	System.out.println("finished ");
	}
	
	//ITestListner=> onstart, onfinis, ontestsucess....
    //right click=> source=> override/implement methods 
}
