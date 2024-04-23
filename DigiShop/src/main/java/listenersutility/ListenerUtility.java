package listenersutility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerUtility implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Exceution Started");

	}
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Exceution Compledted");
		
	}
@Override
public void onTestStart(ITestResult result) {
	System.out.println(result.getName()+"execution Started");
	
}
@Override
public void onTestSucess(ITestResult result) {
	System.out.println(result.getName()+"execution completed Com");
	
	
	
}
@Override
public void onTestFailure(ITestResult result) {
	test.log(logStatus.Fail,test.addressScrernCapture(getWebPageScre(driver)));
}
}
