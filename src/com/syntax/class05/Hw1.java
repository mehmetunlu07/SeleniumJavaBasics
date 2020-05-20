package com.syntax.class05;
//TC 1: Amazon Department List Verification
//Open chrome browser
//Go to “http://amazon.com/”
//Verify how many department options available.
//Print each department 
//Select Computers
//Quit browser

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hw1 {

	public static void main(String[] args) throws InterruptedException {
		String url="http://amazon.com";
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		WebElement allDepartments=driver.findElement(By.id("searchDropdownBox"));  // locate all departments element
		Select select=new Select(allDepartments);
		
		List<WebElement> options=select.getOptions();
		int numDepartments=options.size();
		System.out.println("Number of all departments: "+numDepartments);
		
		select.selectByVisibleText("Computers");   // select computers by text
		Thread.sleep(1000);
		select.selectByValue("search-alias=baby-products");   // select baby by value
		Thread.sleep(1000);
		select.selectByIndex(1);  //// select audible books by index 1
		Thread.sleep(1000);
		driver.quit();
		
	}

}
