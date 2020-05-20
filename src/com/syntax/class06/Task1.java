package com.syntax.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class Task1 {

	public static void main(String[] args) {
		WebDriver driver=BaseClass.setUp();
		WebElement searchDDBox=driver.findElement(By.id("searchDropdownBox"));
		Select selectDDBox=new Select(searchDDBox);
		selectDDBox.selectByValue("search-alias=stripbooks");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
		driver.findElement(By.className("nav-input")).click();
		WebElement checkBox=driver.findElement(By.xpath("//li[@id='p_lbr_books_series_browse-bin/Unofficial Cookbook']"));
		checkBox.click();
		

	}

}
