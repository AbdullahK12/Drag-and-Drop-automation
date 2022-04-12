package shopping;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dress {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.get("http://automationpractice.com/index.php");
		
		WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
		women.click();
		
		WebElement dresses = driver.findElement(By.xpath("(//span[@class='grower CLOSE'])[1]"));
		dresses.click();
		Thread.sleep(3000);
		
		WebElement bl = driver.findElement(By.xpath("(//a[@href='http://automationpractice.com/index.php?id_category=5&controller=category'])[3]"));
		bl.click();
		Thread.sleep(3000);
		
		WebElement tshirt = driver.findElement(By.xpath("(//a[@href='http://automationpractice.com/index.php?id_product=1&controller=product'])[4]"));
		tshirt.click();
		Thread.sleep(3000);
		
		WebElement qty = driver.findElement(By.xpath("(//i[@class='icon-plus'])"));
		qty.click();
		Thread.sleep(3000);
		
		WebElement size = driver.findElement(By.id("group_1"));
	    Select s = new Select(size);
		s.selectByValue("2");
		Thread.sleep(3000);
		
		WebElement name = driver.findElement(By.name("Orange"));
		name.click();
		Thread.sleep(3000);
		
		WebElement text = driver.findElement(By.xpath("//span[text( )='Add to cart']"));
		text.click();
		Thread.sleep(3000);
		
		WebElement proceed = driver.findElement(By.xpath("(//a[@href='http://automationpractice.com/index.php?controller=order'])[3]"));
		proceed.click();
		Thread.sleep(3000);
		
		WebElement next = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		next.click();
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("abdullah12@gmail.com");
		Thread.sleep(3000);
		
		WebElement pass = driver.findElement(By.id("passwd"));
		pass.sendKeys("123456");
		Thread.sleep(3000);
		
		WebElement submit = driver.findElement(By.id("SubmitLogin"));
		submit.click();
		Thread.sleep(3000);
		
		WebElement pr_add = driver.findElement(By.name("processAddress"));
		pr_add.click();
		Thread.sleep(3000);
		
		WebElement radio = driver.findElement(By.id("cgv"));
		radio.click();
		Thread.sleep(3000);
		
		WebElement nam = driver.findElement(By.name("processCarrier"));
		nam.click();
		Thread.sleep(3000);
		
		
		WebElement mode = driver.findElement(By.xpath("(//a[@class='bankwire'])"));
		mode.click();
		Thread.sleep(3000);
		
		WebElement conf = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		conf.click();
		Thread.sleep(5000);
		
		TakesScreenshot ss= (TakesScreenshot) driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\91814\\eclipse-workspace\\selenium\\screenshot\\shopping dress.png");
		FileUtils.copyFile(src, des);
		Thread.sleep(3000);
		
		driver.close();
	
	}

}
