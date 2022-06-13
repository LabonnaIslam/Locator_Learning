package testCases;

import org.testng.annotations.Test;

import base.DriverSetup;

public class TC001_LocatorLearning extends DriverSetup {

	String baseurl = "https://rahulshettyacademy.com/locatorspractice/";

	@Test
	public void LocatorLearning() throws InterruptedException {
		driver.get(baseurl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

}
