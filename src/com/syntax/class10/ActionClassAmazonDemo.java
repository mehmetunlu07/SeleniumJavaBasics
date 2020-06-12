package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;

public class ActionClassAmazonDemo extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		setUp();   //Amazon.com
		
		WebElement account=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		action.moveToElement(account).perform();
		Thread.sleep(2000);
		//Hover the mouse over Menu
		WebElement element=driver.findElement(By.xpath("//div[@id='nav-flyout-ya-newCust']"));
		//Thread.sleep(5000);
		//validate the menu is poped up.
		if(element.getText().contains("Start")) {
			System.out.println("Menu displayed");
		}else {
		System.out.println("Menue did NOT display");
		}
//		
//		//How to right-click on a element
		action.contextClick(element).perform();
		
		WebElement searchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		//how to double click on a element.
		action.moveToElement(searchBox).click().sendKeys("Movies").doubleClick().perform();
		action.moveToElement(searchBox).click().keyUp(Keys.SHIFT).sendKeys("movie").perform();
		Thread.sleep(5000);
		tearDown();
		
	}

}
