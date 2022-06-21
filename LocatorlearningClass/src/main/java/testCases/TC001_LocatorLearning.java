package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.DriverSetup;

public class TC001_LocatorLearning extends DriverSetup {

	static String baseurl = "https://rahulshettyacademy.com/locatorspractice/";

	@Test(invocationCount=2)
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
		
		String password=getpassword(driver);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Tanvir");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
    	
	    
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		
		//driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("password");
		//Thread.sleep(2000);
		
		driver.findElement(By.id("chkboxOne")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(2000);
		
		//tagname[@attribute='value']
		//Tagname[contains(text(),'')]
		//driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		//text= Sign in
		//tagname=button

		//driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		//Thread.sleep(2000);
	}
	

	public static String getpassword(WebDriver driver) throws InterruptedException{
		
		driver.get(baseurl);
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[]passwordArray=passwordText.split("'");
		//String[]passwordArray2=passwordText[1].split("");
		//String password=passwordArray2[0];
		
		String password =passwordArray[1].split("'")[0];
		return password;
		
	}
} 
