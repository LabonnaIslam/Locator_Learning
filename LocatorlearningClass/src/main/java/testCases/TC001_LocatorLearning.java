package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.DriverSetup;

public class TC001_LocatorLearning extends DriverSetup {

	String baseurl = "https://rahulshettyacademy.com/locatorspractice/";

	@Test
	public void LocatorLearning() throws InterruptedException {
		driver.get(baseurl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("inputUsername")).sendKeys("Labonna");
		Thread.sleep(2000);
		
		driver.findElement(By.name("inputPassword")).sendKeys("bioooo");
		Thread.sleep(2000);
		
		
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		//Formula:	tagname.value(if class is given)
		//			tagname#value(if id is given)
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//input[@placeholder='name']")).sendKeys("toni");
		//inout[@attribute='value'] 
		
		
		//driver.findElement(By.xpath(""))
	
	}

}
