package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class chelsea {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91814\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/The_Ashes");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("title:"+ title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("url:"+currentUrl);
		
		String pageSource = driver.getPageSource();
		System.out.println("ps:"+pageSource);
		
	    driver.navigate().to("https://www.premierleague.com/");
		driver.navigate().back();
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.google.co.in/");
		driver.navigate().refresh();
		
		driver.close();
		
		
	}

}
