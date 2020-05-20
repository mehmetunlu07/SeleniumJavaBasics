package com.syntax.class08;
//TC 1: Table headers and rows verification
//Open chrome browser
//Go to “http://166.62.36.207/syntaxpractice/”
//Click on “Table” link
//Click on “ITable Data Search” link
//Verify second table consist of 5 rows and 4 columns
//Print name of all column headers 
//Print data of all rows
//Quit Browser

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://166.62.36.207/syntaxpractice/");
		driver.findElement(By.linkText("Table")).click();
		driver.findElement(By.linkText("Table Data Search")).click();
		
		List<WebElement>rows=driver.findElements(By.xpath("//table[@class='table']//tbody//tr"));
		System.out.println("Number of rows: "+rows.size());
		for(WebElement row:rows) {
			String rowText=row.getText();
			System.out.println(rowText);
			
		}
		
		System.out.println("***************************************************");
		
		List<WebElement>cells=driver.findElements(By.xpath("//table[@class='table']/thead[2]/tr/th"));
		System.out.println("Number of cells: "+cells.size());
		for(WebElement cell:cells) {
			String cellText=cell.getText();
			System.out.println(cellText);
			
		}
		
		driver.quit();
		

	}

}
