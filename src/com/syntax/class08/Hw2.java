package com.syntax.class08;
//TC 2: Delete Employee
//Open chrome browser
//Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
//Login into the application
//Add Employee
//Verify Employee has been added
//Go to Employee List
//Delete added Employee
//Quit the browser

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");  
		driver.findElement(By.id("btnLogin")).click();

	}

}
