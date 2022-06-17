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
		
		
		//driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("toni");
		//Thread.sleep(2000);
		
	//	driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("toni@gnail.com");
		

		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("76213");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("toni");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("toni@gnail.com");
		
		
		
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]" )).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Tanvir");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		Thread.sleep(2000);
		driver.findElement(By.id("chkboxOne")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(2000);



	
	}

}
