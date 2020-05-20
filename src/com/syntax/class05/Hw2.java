package com.syntax.class05;
//TC 2: Select and Deselect values
//Open chrome browser
//Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//Click on “Input Forms” links
//Click on “Select Dropdown List” links
//Select value from “Select List Demo” section
//Verify value has been selected
//Select 4 options from “Multi Select List Demo”
//Deselect 1 of the option from the dd
//Quit browser

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hw2 {

	public static void main(String[] args) throws InterruptedException {
		String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		
		driver.findElement(By.className("dropdown-toggle")).click();; //Select Input Forms
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Select Dropdown List']")).click();;  //Select Dropdown List
				
		WebElement elementLD=driver.findElement(By.id("select-demo"));  //Select List Demo
		elementLD.click();
		Thread.sleep(2000);
		Select select=new Select(elementLD);
		select.selectByValue("Monday");
		Thread.sleep(1000);
		
		System.out.println("Selected option is: "+select.getFirstSelectedOption().getText());  // is selected?
		select.selectByIndex(3);
		Thread.sleep(1000);
		
		WebElement driverMulti=driver.findElement(By.xpath("//select[@id='multi-select']"));
		Select selectMulti=new Select(driverMulti);
		
		selectMulti.selectByIndex(1);
		selectMulti.selectByIndex(2);
		selectMulti.selectByValue("New York");
		selectMulti.selectByVisibleText("Ohio");
		Thread.sleep(1000);
		selectMulti.deselectByIndex(2);
		System.out.println("Is select option multiple? "+selectMulti.isMultiple());
		driver.quit();
		

	}

}
