package com.syntax.class07;
//TC 1: Verify element is clickable
//Open chrome browser
//Go to “https://the-internet.herokuapp.com/”
//Click on “Click on the “Dynamic Controls” link
//Select checkbox and click Remove
//Click on Add button and verify “It's back!” text is displayed   
//Close the browser 

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");  //navigate to url
		driver.findElement(By.xpath("//a[text()='Dynamic Controls']")).click();  //click to Dynamic controls link
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();  //selct check box
		driver.findElement(By.xpath("//button[text()='Remove']")).click();   //click remove button
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  // arrange implicit wait
		
		driver.findElement(By.xpath("//button[text()='Add']")).click();   // click add button
		WebElement element=driver.findElement(By.xpath("//p[@id='message']"));  //locate the message element
		
		System.out.println("Is text displayed? "+element.isDisplayed());  //verify if element is displayed
		
		String text=element.getText();    // get the text
		System.out.println("Text displayed is: "+text);
		
		driver.quit();
				

	}

}
