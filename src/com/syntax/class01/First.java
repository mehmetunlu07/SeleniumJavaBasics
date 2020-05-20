package com.syntax.class01;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class First {

	public static void main(String[] args) throws InterruptedException {

		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe"); // ie for explorer, gecko for Firefox																	// Firefox
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://syntaxtechs.com");
		driver.manage().window().maximize();   //makes the page size max
		driver.navigate().to("https://amazon.com");
		//driver.navigate().refresh();   //refresh the page

		driver.navigate().back();
		Thread.sleep(2000);     // 2 sn wait
		driver.navigate().forward();

		String url = driver.getCurrentUrl();
		System.out.println(url);

		if (url.equalsIgnoreCase("https://syntaxtechs.com")) {
			String title = driver.getTitle();
			System.out.println(title);
		
		} else if (url.contains("amazon")){
			System.out.println("You navigate to amazon.com");
		}else {
			System.out.println("Wrong URL is returned");
		}

		driver.navigate().to("https://www.google.com");

		driver.close();

	}

}