package example;

import org.testng.annotations.Test;
import org.openqa.selenium.By;      
import org.openqa.selenium.WebDriver;       
import org.openqa.selenium.firefox.FirefoxDriver;       
import org.testng.Assert;       
import org.testng.annotations.Test; 
import org.testng.annotations.BeforeTest;   
import org.testng.annotations.AfterTest; 
public class SecondTest {
	private WebDriver driver;       
    @Test              
    public void testEasy() {    
    //    driver.get("http://www.guru99.com/selenium-tutorial.html");  
    	driver.get("http://www.google.com");
 
         Error code Generation
               String title = driver.getTitle();
               System.out.println(title);
        Assert.assertTrue(title.contains("Google"));       
        
    }   
    @BeforeTest
    public void beforeTest() {  
        driver = new FirefoxDriver();  
    }       
    @AfterTest
    public void afterTest() {
      //  driver.quit();          
    }      
}
