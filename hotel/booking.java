package hotel;

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

public class booking {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		
		WebElement name = driver.findElement(By.name("username"));
		name.sendKeys("Abdullah97");
		
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("qwerty*6");
		
		WebElement touch = driver.findElement(By.name("login"));
		touch.click();
		
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByValue("Paris");
		Thread.sleep(2000);
		
		WebElement hot = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hot);
		s1.selectByValue("Hotel Creek");
		
		WebElement type = driver.findElement(By.id("room_type"));
		Select s2 = new Select(type);
		s2.selectByValue("Double");
		
		WebElement nos = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(nos);
		s3.selectByValue("6");
		
		WebElement ar = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(ar);
		s4.selectByValue("2");
		
		WebElement cr = driver.findElement(By.id("child_room"));
		Select s5 = new Select(cr);
		s5.selectByValue("1");
		
		WebElement su = driver.findElement(By.id("Submit"));
		su.click();
		
		WebElement rb = driver.findElement(By.id("radiobutton_0"));
		rb.click();
		
		WebElement co = driver.findElement(By.id("continue"));
		co.click();
		
		WebElement f_name = driver.findElement(By.id("first_name"));
		f_name.sendKeys("Abdullah");
		
		WebElement ln = driver.findElement(By.id("last_name"));
		ln.sendKeys("k");
		
		WebElement ad = driver.findElement(By.id("address"));
		ad.sendKeys("no 49 south africa");
		
		WebElement cc = driver.findElement(By.id("cc_num"));
		cc.sendKeys("2526 4512 7895 1265");
		
		WebElement c_type = driver.findElement(By.id("cc_type"));
		Select s6 = new Select(c_type);
		s6.selectByValue("VISA");
		
		WebElement month = driver.findElement(By.id("cc_exp_month"));
		Select s7 = new Select(month);
		s7.selectByVisibleText("January");
		
		WebElement year = driver.findElement(By.id("cc_exp_year"));
		Select s8 = new Select(year);
		s8.selectByValue("2018");
		
		WebElement cvv = driver.findElement(By.name("cc_cvv"));
		cvv.sendKeys("789");
		
		WebElement bn = driver.findElement(By.id("book_now"));
		bn.click();
		Thread.sleep(4000);
		
		TakesScreenshot ts =(TakesScreenshot) driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
		File des =new File("C:\\Users\\91814\\eclipse-workspace\\selenium\\screenshot\\adactin booking.png");
		FileUtils.copyFile(src, des);
		
		WebElement logout = driver.findElement(By.xpath("//a[text( )='Logout']"));
		logout.click();
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
