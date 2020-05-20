package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioDemo {

	public static String url = "https://demoqa.com/automation-practice-form/";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().fullscreen();
		WebElement button = driver.findElement(By.xpath("//input[@id='sex-0']"));

		System.out.println(button.getAttribute("value"));
		
		System.out.println(button.isDisplayed());// true
		System.out.println(button.isEnabled());// true
		System.out.println("Radio Btn is Selected:: " + button.isSelected());// false
		System.out.println("**********");

		// first way to click on a Radio Button
		Thread.sleep(2000);
		button.click();
		System.out.println("Radio Btn is Selected:: " + button.isSelected());// true

		// second way to click on Radio buttons
		List<WebElement> proList = driver.findElements(By.xpath("//input[@name='profession']"));

		int listSize = proList.size();
		System.out.println("Size of CheckBoxes are:: " + listSize);

		String valueToBeSelected="Automation Tester";
		//driver.findElement(By.xpath("//input[@id='sex-0']")).getAttribute("value");
		for (WebElement profession : proList) {

			if(profession.isEnabled()) {//Checking is the check-box is enabled
				
				String value=profession.getAttribute("value");//get value of value attribute
				
				System.out.println(value);
				
				if(value.equals(valueToBeSelected)) {
					profession.click();
					break;
				}
				
			}
		}

	}

	
	
	
	
	
	
}
