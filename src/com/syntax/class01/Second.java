package com.syntax.class01;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;  
import org.openqa.selenium.remote.DesiredCapabilities;  
import org.openqa.selenium.support.ui.Select;  
  
public class Second {  
  
    public static void main(String[] args) {  
          
          // System Property for Gecko Driver   
    System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe" );  
          
         // Initialize Gecko Driver using Desired Capabilities Class  
    		WebDriver driver = new ChromeDriver();
          
        // Launch Website  
     driver.navigate().to("https://www.facebook.com");  
      
     // Click on the textbox and send value  
     driver.findElement(By.id("email")).sendKeys("munlu2008@gmail.com"); 
     driver.findElement(By.id("pass")).sendKeys("030647"); 
     driver.findElement(By.id("u_0_b")).click();
       
          
          // Use the linkText locator method to find the link and perform click using click() method  
   //  driver.findElement(By.linkText("This is a link")).click();  
       
         
//        // Clear the text written in the textbox  
//     driver.findElement(By.id("fname")).clear();  
//          
//        // Click on the Submit button using click() command  
//     driver.findElement(By.id("idOfButton")).click();  
//   
//        // Locate the radio button by id and check it using click() function  
//     driver.findElement(By.id("male")).click();  
//          
//        // Locate the checkbox by cssSelector and check it using click() function  
//     driver.findElement(By.cssSelector("input.Automation")).click();  
//              
//        // Use Select class for selecting value from dropdown  
//    Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));  
//    dropdown.selectByVisibleText("Automation Testing");  
//       
        // Close the Browser  
         driver.close();  
      
    }  
  
}  