package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class SelfStudy extends CommonMethods{

	public static void main(String[] args) {
		setUp();
		driver.get("http://demo.guru99.com/test/radio.html");
		driver.findElement(By.id("vfb-7-3")).click();  // radio button click
		
		WebElement checkBox=driver.findElement(By.id("vfb-6-0"));   //checkBox
		
		for(int i=0;i<=2;i++) {
		checkBox.click();
		System.out.println(checkBox.isSelected());
		}
		
		driver.get("http://demo.guru99.com/test/link.html");
		
		WebElement linkText=driver.findElement(By.linkText("click here"));  //linkText
		linkText.click();
		System.out.println(driver.getTitle());
		
		
		driver.quit();

	}

}
