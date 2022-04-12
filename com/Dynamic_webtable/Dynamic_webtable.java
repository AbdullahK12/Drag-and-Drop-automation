package com.Dynamic_webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamic_webtable {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		WebElement company = driver.findElement(By.xpath("//table/tbody/tr[6]/td"));
		System.out.println(company.getText());
		
		
		WebElement stock = driver.findElement(By.xpath("//table/tbody/tr[6]/td[5]"));
		System.out.println(stock .getText());
		
		
	}

}
