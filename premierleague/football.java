package premierleague;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class football {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91814\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
		WebDriver chelsea = new ChromeDriver();
		
		
		chelsea.get("https://users.premierleague.com/");
		chelsea.manage().window().maximize();
		
		
		WebElement user = chelsea.findElement(By.name("login"));
		user.sendKeys("pogba@6.com");
		
		WebElement password = chelsea.findElement(By.name("password"));
		password.sendKeys("maria*6");
		
		WebElement login = chelsea.findElement(By.id("submit"));
		login.click();
		
		Thread.sleep(6000);
		
		
		
		
	}
	
	

}
