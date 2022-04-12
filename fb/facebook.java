package fb;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		driver.get("https://www.facebook.com/");
		WebElement cnc = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		cnc.click();
		Thread.sleep(3000);
		
		WebElement name = driver.findElement(By.name("firstname"));
		Thread.sleep(3000);
		name.sendKeys("Abdullah");
		
		WebElement surname = driver.findElement(By.name("lastname"));
		surname.sendKeys("k");
		
		WebElement email = driver.findElement(By.name("reg_email__"));
		Thread.sleep(3000);
		email.sendKeys("ishaq666abd@gmail.com");
		
		WebElement re_enter = driver.findElement(By.name("reg_email_confirmation__"));
		Thread.sleep(3000);
		re_enter.sendKeys("ishaq666abd@gmail.com");
		
		WebElement password = driver.findElement(By.id("password_step_input"));
		Thread.sleep(3000);
		password.sendKeys("bismi*6");
		
		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByValue("12");
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
		s1.selectByValue("2");
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
		s2.selectByValue("1997");
		Thread.sleep(2000);
		
		WebElement sex = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
		sex.click();
		
		WebElement button = driver.findElement(By.name("websubmit"));
		button.click();
		
		TakesScreenshot ab = (TakesScreenshot) driver;
		File pop = ab.getScreenshotAs(OutputType.FILE);
		File up = new File("C:\\Users\\91814\\eclipse-workspace\\selenium\\screenshot\\driver.png");
		FileUtils.copyFile(pop,up);
		
		
		
		
		
		
		
		
		
	}

}
