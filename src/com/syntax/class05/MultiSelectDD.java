package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;



public class MultiSelectDD extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		//config dosyasindan url ayarla  --->  url=https://demoqa.com/automation-practice-form/
		WebDriver driver=setUp();
		
		WebElement multiSelectDD=driver.findElement(By.id("continentsmultiple"));
		
		Select select=new Select(multiSelectDD);
		
		boolean isMultiple=select.isMultiple();//This method identifies if this DD is multi select.
		System.out.println("This DropDown is Multi Select?: "+isMultiple);
		
		if(isMultiple) {
			select.selectByIndex(1);
			select.selectByIndex(3);
			select.selectByVisibleText("Africa");
			select.selectByValue("AS");
			Thread.sleep(2000);
			
			
			select.deselectByIndex(0);//you can deselect using any method: ByIndex,ByValue,orVisible text
			Thread.sleep(1000);
			select.deselectAll();
		}
		
	
		
		
		
		
	}

}
