package example;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.openqa.selenium.By;      
import org.openqa.selenium.WebDriver;       
import org.openqa.selenium.firefox.FirefoxDriver;       
import org.testng.Assert;       
import org.testng.annotations.Test; 
import org.testng.annotations.BeforeTest;   
import org.testng.annotations.AfterTest; 
public class SecondTest {
	 private static WebDriver driver;       
           
     public static void main(String[] args) {   
    	  driver = new FirefoxDriver();  
         driver.get("http://www.guru99.com/selenium-tutorial.html");  
         String title = driver.getTitle();                
         AssertJUnit.assertTrue(title.contains("Free Selenium Tutorials"));       
    
       
   
   
    
         driver.quit();          
     }  
}
