

package genericLibrary;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BasicClass  extends Utilitymethods{
	public WebDriver driver:
		
		@BeforeSuite
		public void bs{
		Reporter.log("Before Suite",true);
		
	}
		@AfterSuite
		public void as() {
			Reporter.log("After Suite",true);
			
			
		}
//@Parameters({"Browsers",url"})
		@BeforeClass
		
	@Test
	public void test1() {
		
		Reporter.log("Test 2",true);
		
	}
@Test
public void test2
Reporter
}
