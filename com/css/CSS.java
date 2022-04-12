package com.css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement name = driver.findElement(By.cssSelector("input[id='email']")); //Attribute
		name.sendKeys("ABDULLAH");
		Thread.sleep(3000);
		name.clear();
		
		WebElement name2 = driver.findElement(By.cssSelector("input#email"));   //Symbol
		name2.sendKeys("ISHAQ");
		Thread.sleep(3000);
		name.clear();
		
		WebElement name3 = driver.findElement(By.cssSelector("[name^='em']"));   //Prefix
		name3.sendKeys("USA");
		Thread.sleep(3000);
		name.clear();
		
		WebElement name4 = driver.findElement(By.cssSelector("[name$='il']"));   //Suffix
		name4.sendKeys("FRANCE");
		Thread.sleep(3000);
		name.clear();
		
		WebElement name5 = driver.findElement(By.cssSelector("input[id='email'][type='text']")); //with 2 attribute
		name5.sendKeys("AUSTRALIA");
		Thread.sleep(3000);
		name.clear();
		
		WebElement name6 = driver.findElement(By.cssSelector("[class*='inputtext _55r1 _6luy']"));   //Contains
		name6.sendKeys("GERMANY");
		Thread.sleep(3000);
		name.clear();
		}
             
}
