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
    	
        WebDriver driver=new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--window-size=1920,1080");
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        System.out.println( "Automation script is executing" );
        
        //Implicit wait
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize(); 
        driver.get("https://www.facebook.com/");
        System.out.println("FB Site opened");
        
        WebElement userEmail = driver.findElement(By.id("email"));
        userEmail.sendKeys("test123@email.com");
        System.out.println("email entered");
        
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("Test@123");
        System.out.println("password entered");
        
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement logInButton = driver.findElement(By.name("login"));
        logInButton.click();
        System.out.println("Log in button clicked");

        driver.quit();
        System.out.println("script executed successfully");
    }
}
