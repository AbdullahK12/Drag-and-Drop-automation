package com.frames_;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ifraMes {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://ui.vision/demo/webtest/frames/");
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    WebElement frame1 = driver.findElement(By.xpath("/html/frameset/frame[1]"));
	    driver.switchTo().frame(frame1);
	    
	    WebElement inp_frame1 = driver.findElement(By.name("mytext1"));
	    inp_frame1.sendKeys("miss u warne");
	    driver.switchTo().defaultContent();
	    
	    WebElement frame2 = driver.findElement(By.xpath("/html/frameset/frameset/frame[1]"));
	    driver.switchTo().frame(frame2);
	    
	    WebElement inp_frame2 = driver.findElement(By.name("mytext2"));
	    inp_frame2.sendKeys("Thanjavur");
	    driver.switchTo().defaultContent();
	    
	    WebElement frame3 = driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
	    driver.switchTo().frame(frame3);
	    
	    WebElement inp_frame3 = driver.findElement(By.name("mytext3"));
	    inp_frame3.sendKeys("Bangalore");
	    driver.switchTo().frame(0);
	    
	    WebElement human = driver.findElement(By.xpath("//div[@id='i8']"));
	    human.click();
	    
	    WebElement webTesting = driver.findElement(By.xpath("//div[@id='i19']/div[2]"));
	    webTesting.click();
	    
	    WebElement choose = driver.findElement(By.xpath("//div[@role='listbox']/div/div[2]"));
	    choose.click();
	    
	    WebElement option_2 = driver.findElement(By.xpath("//div[@role='listbox']/div[2]/div[4]"));	
	    option_2.click();
	    
	    WebElement next = driver.findElement(By.xpath("(//div[@role='button'])[2]"));
	    next.click();
	    
	    WebElement text = driver.findElement(By.xpath("(//div[@role='listitem'])[2]/div/div/div[2]/div/div[1]/div/div[1]/input"));
	    WebDriverWait w=new WebDriverWait(driver,20);
	    w.until(ExpectedConditions.visibilityOf(text));
	    text.sendKeys("Hai Abdullah");
	    
	    WebElement text2 = driver.findElement(By.xpath("(//div[@role='listitem'])[3]/div/div/div[2]/div/div[1]/div[2]/textarea"));
	    text2.sendKeys("Bye Abdullah");
	    
	    WebElement button = driver.findElement(By.xpath("(//div[@role='button'])[2]"));
	    button.click();
	    Thread.sleep(3000);
	    
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    File des = new File("C:\\Users\\91814\\eclipse-workspace\\selenium\\screenshot\\iframe.png");
	    FileUtils.copyFile(source, des);
	    
	    
	    driver.close();
	}

}
