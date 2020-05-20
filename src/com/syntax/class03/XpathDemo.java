package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
	
	public static String url="http://166.62.36.207/humanresources/symfony/web/index.php/dashboard";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");  //input[@type='text']   //input[@id='txtUsername']  //input[@name='txtUsername']
		
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");   //input[@type='password']
		
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();  //input[@value='LOGIN']    //input[@name='Submit']
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(@class,'panel')]")).click();  //a[@id='welcome']  //a[contains(@class,'panel')]
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[starts-with(text(),'Log')]")).click();  //a[text()='Logout']
		
		
	}

}
