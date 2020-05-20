package com.syntax.class07;
//TC 2: Verify element is enabled
//Open chrome browser
//Go to “https://the-internet.herokuapp.com/”
//Click on “Click on the “Dynamic Controls” link
//Click on enable button
//Enter “Hello” and verify text is entered successfully
//Close the browser 

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hw2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/"); // navigate to url
		
		driver.findElement(By.xpath("//a[@href='/dynamic_controls']")).click();  //click dynamic Controls
		driver.findElement(By.xpath("//button[text()='Enable']")).click();     // click enable button
		
//		WebDriverWait wait=new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Disable']")));
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  //implicit wait
		//driver.findElement(By.xpath("//input[@type='text'][@style='width: 30%;']")).sendKeys("Hello");  // bu elementte bir problem var
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Disable']")).click();   //click disable
		System.out.println("Text is: "+driver.findElement(By.xpath("//p[@id='message']")).getText());   //get text
		driver.quit();
	}

}
