package com.mgc;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class asstmain {
	
    static WebDriver driver;
	
	@BeforeClass
	public static void launch() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADVENTURES200\\eclipse-workspace\\JunitProject\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	String url = "https://www.facebook.com/";
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@BeforeMethod
	public void start() {
		Date d = new Date();
		System.out.println(d);
	}
	@AfterMethod
	public void end() {
		Date d = new Date();
		System.out.println(d);
	}
    @AfterClass
    public static void quit() throws InterruptedException {
    	Thread.sleep(30000);
    	driver.quit();
    }
    @Test
    public void test1() {
    	WebElement user = driver.findElement(By.id("email"));
    	user.sendKeys("pradeep");
    }
    
}
