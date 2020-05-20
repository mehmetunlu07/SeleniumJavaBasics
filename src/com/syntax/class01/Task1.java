package com.syntax.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		// Initialize Gecko Driver using Desired Capabilities Class
		WebDriver driver = new ChromeDriver();

		// Launch Website
		driver.navigate().to("http://newtours.demoaut.com");

		// Click on the textbox and send value
		driver.findElement(By.linkText("Register here")).click();
		driver.findElement(By.name("firstName")).sendKeys("John");
		driver.findElement(By.name("lastName")).sendKeys("Wayne");
		driver.findElement(By.name("phone")).sendKeys("469876567");
		driver.findElement(By.id("userName")).sendKeys("john@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("7200 Ranch road");
		driver.findElement(By.name("city")).sendKeys("Dallas");
		driver.findElement(By.name("state")).sendKeys("TX");
		driver.findElement(By.name("postalCode")).sendKeys("75048");
		//driver.findElement(By.name("country")).equals("UNITED STATES");
		driver.findElement(By.id("email")).sendKeys("john123");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.name("confirmPassword")).sendKeys("12345");
		driver.findElement(By.name("register")).click();    
		driver.findElement(By.linkText("sign-in")).click(); 
		driver.findElement(By.name("userName")).sendKeys("john123");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.name("login")).click();
		
		driver.close();
	}

}
