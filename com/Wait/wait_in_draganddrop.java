package com.Wait;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait_in_draganddrop {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://www.dhtmlgoodies.com/scripts/arrange-table-rows/demo.html");
        Actions s = new Actions(driver);
        Thread.sleep(3000);
		
        WebElement drag = driver.findElement(By.xpath("(//td[@class='dg-arrange-table-rows-drag-icon'])[1]"));
        WebDriverWait w = new WebDriverWait(driver,50);
        w.until(ExpectedConditions.visibilityOf(drag));
        
        WebElement drop = driver.findElement(By.xpath("(//td[@class='dg-arrange-table-rows-drag-icon'])[6]"));
        WebDriverWait w1 = new WebDriverWait(driver,50);
        w1.until(ExpectedConditions.visibilityOf(drop));
        
        WebElement drag1 = driver.findElement(By.xpath("(//td[@class='dg-arrange-table-rows-drag-icon'])[5]"));
        WebDriverWait w2 = new WebDriverWait(driver,50);
        w2.until(ExpectedConditions.visibilityOf(drag1));
        
        WebElement drop1 = driver.findElement(By.xpath("(//td[@class='dg-arrange-table-rows-drag-icon'])[9]"));
        WebDriverWait w3 = new WebDriverWait(driver,50);
        w3.until(ExpectedConditions.visibilityOf(drop1));
        
        s.dragAndDrop(drag, drop).build().perform();
        Thread.sleep(2000);
        s.dragAndDrop(drag1, drop1).build().perform();
        Thread.sleep(2000);
        
        TakesScreenshot Ab = (TakesScreenshot) driver;
		File src =Ab.getScreenshotAs(OutputType.FILE);
		File des =new File("C:\\Users\\91814\\eclipse-workspace\\selenium\\screenshot\\wait.png");
		FileUtils.copyFile(src, des);
        
 
	}

}
