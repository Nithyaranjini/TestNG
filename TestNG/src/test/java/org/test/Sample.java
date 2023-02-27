package org.test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
static WebDriver driver;
@Test
@Parameters({"UserName","Password"})

private void Test1( String s1,String s2) {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https:www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys(s1);
	driver.findElement(By.name("pass")).sendKeys(s2);
	driver.findElement(By.name("login")).click();}
	
	
	
}


