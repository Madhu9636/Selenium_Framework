package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ReadXLSdata;

public class FirstTestCase extends BaseTest{
	
	@Test(dataProviderClass =ReadXLSdata.class,dataProvider = "bvtdata")
	public static void loginTest(String username,String password) {
		
		System.out.println("sucessfully");
		driver.findElement(By.xpath(loc.getProperty("username_field"))).sendKeys(username);
		driver.findElement(By.xpath(loc.getProperty("password_field"))).sendKeys(password);
		driver.findElement(By.xpath(loc.getProperty("login_button"))).click();
		
		
	}
	@DataProvider(name="testdata")
	public Object[][] tData()
	{
		return new Object[][]
		 {  
			{"Admin4r1","admin123"},
			{"madhu25499@gmail.com","Madhu99"},
			{"Admin","admin"},
			{"Admin","admin"}	
		};
	}

}
