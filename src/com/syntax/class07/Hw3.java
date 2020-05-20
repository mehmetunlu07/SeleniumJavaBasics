package com.syntax.class07;
//TC 3: Windows Handling
//Open chrome browser
//Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//Click on “Javascript Alerts” link
//Click on “Window Popup Modal” link
//Click on the “ Follow On Instagram” button
//Verify title of the page is “Syntax Technologies (@syntaxtechs) • Instagram photos and videos” 
//Click on the “Like us On Facebook ” button
//Verify title of the page is “Go to Facebook Home” 
//Quit the browser

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://jiravm.centralus.cloudapp.azure.com:8081/index.html");
		
		driver.manage().window().maximize();
		List<WebElement> options=driver.findElements(By.xpath("//a[@class='dropdown-toggle']"));
		for(WebElement el:options) {
		System.out.println(el.getText());
			if(el.getText().equalsIgnoreCase("Alerts & Modals")) {
				el.click();
				break;
			}
		}
		driver.findElement(By.xpath("//a[text()='Javascript Alerts']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
//		Alert simpleAlert=driver.switchTo().alert();
//		Thread.sleep(2000);
//		simpleAlert.accept();
		

		
	}

}
