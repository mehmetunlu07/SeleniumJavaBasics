package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HrmsLogin {

	public static void main(String[] args) {

		String url="http://166.62.36.207/humanresources/symfony/web/index.php/dashboard";
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(url);
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		
		driver.findElement(By.id("btnLogin")).click();    //className("button")  //id("btnLogin")  //name("Submit")
		
		driver.manage().window().fullscreen();  
		
		driver.findElement(By.id("menu_pim_viewPimModule")).click();  //
		
		driver.findElement(By.id("menu_pim_addEmployee")).click();   //firstName
		
		driver.findElement(By.id("firstName")).sendKeys("David");
		
		//driver.close();
		
	}

}
