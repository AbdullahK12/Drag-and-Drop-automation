package path;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91814\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
		WebDriver Amazon = new ChromeDriver();
        Amazon.get("https://www.amazon.com/ap/signin?clientContext=260-3324393-3088721&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.primevideo.com%2Fauth%2Freturn%2Fref%3Dav_auth_ap%3Flocation%3D%2F%3Fref_%253Ddv_auth_ret%2526mrntrk%253Dpcrid_75660303191630_slid__pgrid_1210562788151299_pgeo_150098_x__ptid_kwd-75660529116296%3Aloc-90&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&accountStatusPolicy=P1&openid.assoc_handle=amzn_prime_video_desktop_us&openid.mode=checkid_setup&language=en_US&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	    Amazon.manage().window().maximize();
	    
	    WebElement name = Amazon.findElement(By.xpath("(//input[@type='email'])[1]"));
	    name.sendKeys("Abdullah");
	    
	    
	    WebElement password = Amazon.findElement(By.xpath("//input [contains(@type,'pass')]"));
	    password.sendKeys("666666");	
	    
	    
	    WebElement touch = Amazon.findElement(By.id("signInSubmit"));
	    touch.click();
	    Thread.sleep(4000);
	    
		TakesScreenshot ab = (TakesScreenshot) Amazon;
		File pop = ab.getScreenshotAs(OutputType.FILE);
		File up = new File("C:\\Users\\91814\\eclipse-workspace\\selenium\\screenshot\\Amazon.png");
		FileUtils.copyFile(pop,up);
	    
        
        
        
        
        
	}
}
