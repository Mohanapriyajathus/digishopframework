package testNGBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvider {


		// TODO Auto-generated method stub
		@org.testng.annotations.DataProvider(parallel = true)
		public String[] [] details(){
			String [] [] data= new String[2][2];
			
			//First details

			data[0] [0]="priya";
			data[0] [1]="Priya123@gmail.com";
			
			//Second Details
			
			data[1] [0]="dhivya";p[''p]
					
			data[1] [1]="dhivya@gmail.com";
			
			
			return data;
		}
		
		@Test(dataProvider = "details")
		public void Login_001(String Name, String Emailid) throws InterruptedException {
			
			//Launch the Browser
			WebDriver driver=new ChromeDriver();
			
			//Maximize the Browser
			driver.manage().window().maximize();
			
			//Navigate to webpage
			driver.get("https://demoapps.qspiders.com");
			
			//Implicity Wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			//To Click on Ui Testing Concepts
			driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
			Thread.sleep(1000);
			
			//To Enter the Name
			driver.findElement(By.id("name")).sendKeys(Name);
			Thread.sleep(1000);
			
			//To Enter the Email 
			driver.findElement(By.id("email")).sendKeys(Emailid);
			Thread.sleep(1000);
			
			
			//To Click on Register button
			driver.findElement(By.xpath("//button[.='Register']")).submit();
			Thread.sleep(1000);
			
			//To Close The Browser
			driver.quit();
		}
	

	}

