package com.syntax.class08;
//TC 1: Table headers and rows verification
//Open chrome browser
//Go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
//Login to the application
//Verify customer “Susan McLaren” is present in the table
//Click on customer details
//Update customers last name and credit card info
//Verify updated customers name and credit card number is displayed in table
//Close browser


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
		String expectText="Susan McLaren";
		for(int i=0;i<rows.size();i++) {
			String rowText=rows.get(i+1).getText();
			//System.out.println(rowText);
			if(rowText.contains(expectText)) {
				driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[1]")).get(i).click();
				driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[13]")).get(i).click();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				WebElement nameText=driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
				nameText.clear();
				nameText.sendKeys("Susan Yilmaz");
				WebElement cardRB=driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_2"));
				cardRB.click();
				driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton")).click();
				
				break;
				
			}
		}
		
		driver.quit();

	}

}
