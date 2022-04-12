package chrome;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class incognito {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("incognito");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		
		driver.get("https://in.search.yahoo.com/search?fr=mcafee&type=E211IN826G0&p=premier+league");
		driver.navigate().to("https://in.search.yahoo.com/search?fr=mcafee&type=E211IN826G0&p=myntra");
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		
		TakesScreenshot it =(TakesScreenshot) driver;
		File src =it.getScreenshotAs(OutputType.FILE);
		File des =new File("C:\\Users\\91814\\eclipse-workspace\\selenium\\screenshot\\incognito.png");
		FileUtils.copyFile(src, des);
	}

}
