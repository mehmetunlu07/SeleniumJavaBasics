package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {

	public static String url = "http://166.62.36.207/humanresources/symfony/web/index.php/dashboard";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.cssSelector("input[type^='text']")).sendKeys("Admin");    //  input[id='txtUsername']  //  input[type^='text']
		driver.findElement(By.cssSelector("input[id^='txtP']")).sendKeys("Hum@nhrm123");  //  input[id^='txtP']   //  input[id$='Password']
		driver.findElement(By.cssSelector("input[id='btnLogin'][name='Submit']")).click();  //  input.button   //   input#btnLogin   //  input[id='btnLogin'][name='Submit']
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a.panelTrigger")).click();  //  a#welcome   //  a.panelTrigger  //  a[id*='wel']
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,'/humanresources/symfony/web/index.php/auth/logout')]")).click();  //a[text()='Logout']  //a[contains(@href,'/humanresources/symfony/web/index.php/auth/logout')]
		
		driver.close();
		//How to copy xpath and Css using developer too.
		//select and Right click on the desired tag, go to copy and select Copy Xpath/Selector. 
		
		//Xpath copied using developer tool.
		//*[@id="txtUsername"]
		//*[@id="divPassword"]/span
	
		//CSS copied using developer tool.
		//#txtUsername
		//#divPassword > span
		//Not recommanded to use.
		//*[@id="login_form"]/table/tbody/tr[3]/td[2]/div/a
		
		
	}

}
