package com.mgc;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class assttv {
	public WebDriver driver;
	        @Test
	        public  void test3() {
	          WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
	        search.sendKeys("tv");
	        WebElement enter = driver.findElement(By.xpath("//button[@type='submit']"));
	        enter.click();
	 }
	        @Test
	        public void test4() {
	        	
	        }
}