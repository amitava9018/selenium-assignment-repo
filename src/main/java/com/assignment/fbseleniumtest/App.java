package com.assignment.fbseleniumtest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args ) throws InterruptedException
    {
    	//System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

	WebDriverManager.chromedriver().setup(); 
    	ChromeOptions chromeOptions = new ChromeOptions(); 
    	chromeOptions.addArguments("--headless");
    	  
    	WebDriver driver = new ChromeDriver(chromeOptions);
    	  
        System.out.println("Scripted Executing");
    	  
    	  //1. Open the browser and get to the url
    	  driver.get("https://www.facebook.com/");
    	  System.out.println("FB Site opened");
	    
    	  //enable wait of 3 seconds 
    	  driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    	  
    	  //Locate user name and enter details.
    	  driver.findElement(By.id("email")).sendKeys("test123@email.com");
    	  System.out.println("email entered");
    	  
    	  
    	  //locate password and enter details.
    	  driver.findElement(By.id("pass")).sendKeys("Test@123");
    	  System.out.println("password entered");
    	  
    	  //Locate Login button and click on save
    	  driver.findElement(By.name("login")).click();
    	  System.out.println("Log in button clicked");
	    
    	  Thread.sleep(1000);
    	  
    	  System.out.println("Scripted executed successfully"); Thread.sleep(1000); 
    }
}
