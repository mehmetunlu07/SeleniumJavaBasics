package com.syntax.class07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.utils.BaseClass;

public class WaitDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://uitestpractice.com/Students/Contact");
		driver.manage().window().fullscreen();
		
		/*
		 * Implicit wait is kind of global wait and it will wait for each and every element.
		 * it waits on for element to be found, meaning it will work for findElement and 
		 * findElements methods only. as soon as its found, the remaining time will be ignored.
		 */
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		
		driver.findElement(By.linkText("This is a Ajax link")).click();
		
		WebElement elementText=driver.findElement(By.className("ContactUs"));
		String text=elementText.getText();
		System.out.println(text);
		
		System.out.println("--------------  ---------------- ------------------------");
		
		System.out.println("Is element displayed? "+elementText.isDisplayed());
		System.out.println("TagName is:"+elementText.getTagName());
		System.out.println("Class: "+elementText.getAttribute("class"));
		System.out.println("Is element enabled? "+elementText.isEnabled());

		
	}

}
