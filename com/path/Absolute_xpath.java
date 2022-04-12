package com.path;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_xpath {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/checkbox.html");
		WebElement third = driver.findElement(By.xpath("(/html/body/div/div/div[3]/section/div/div/input)[3]"));
		third.click();
		Thread.sleep(3000);
		
		WebElement option = driver.findElement(By.xpath("(//div[@id='wrapper']/div/div[3]/section/div/div/input)[12]"));
		option.click();
		Thread.sleep(2000);
		
		TakesScreenshot ts =(TakesScreenshot) driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
		File des =new File("C:\\Users\\91814\\eclipse-workspace\\selenium\\screenshot\\Absolute.png");
		FileUtils.copyFile(src, des);
	}

}
