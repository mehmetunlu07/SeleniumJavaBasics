package com.syntax.class01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//CREATE A PROPERTY FILE TO STORE following configurations:
//browser=
//url=
//username=
//password=
//In your Selenum code use values from properties file to open specifified browser, navigate to specified url and enter username and password
public class Hw {

	public static void main(String[] args) throws IOException {
		String filePath=System.getProperty("user.dir")+"\\configs\\Browser.properties";
		FileInputStream fis=new FileInputStream(filePath);
		
		Properties prop=new Properties();
		prop.load(fis);
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		String url=prop.getProperty("url");
		String username=prop.getProperty("username");

		driver.navigate().to(url);  
		driver.findElement(By.name("identifier")).sendKeys(username);
		
		//driver.findElement(By.linkText("RveJvd snByac")).click(); 
		//driver.findElement(By.name("register")).click(); 
		

	}

}
