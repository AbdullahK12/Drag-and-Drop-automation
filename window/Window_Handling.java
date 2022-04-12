package window;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handling {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		Actions s = new Actions(driver);
		WebElement men = driver.findElement(By.xpath("(//a[@href='/shop/men'])[1]"));
		s.contextClick(men).build().perform();
		
		Robot u = new Robot();
		u.keyPress(KeyEvent.VK_DOWN);
		u.keyRelease(KeyEvent.VK_DOWN);
		u.keyPress(KeyEvent.VK_ENTER);
		u.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement women = driver.findElement(By.xpath("(//a[@href='/shop/women'])[3]"));
        s.contextClick(women).build().perform();
        
        u.keyPress(KeyEvent.VK_DOWN);
		u.keyRelease(KeyEvent.VK_DOWN);
		u.keyPress(KeyEvent.VK_ENTER);
		u.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement kids = driver.findElement(By.xpath("(//a[@href='/shop/kids'])[2]"));
		s.contextClick(kids).build().perform();
		
		u.keyPress(KeyEvent.VK_DOWN);
		u.keyRelease(KeyEvent.VK_DOWN);
		u.keyPress(KeyEvent.VK_ENTER);
		u.keyRelease(KeyEvent.VK_ENTER);
		
		String parent = driver.getWindowHandle();//parent ID
		System.out.println("parent:"+ parent);
		
		
		int size = driver.getWindowHandles().size();
		System.out.println("size:"+size);//no. of windows
		
		
		Set<String> allwindow = driver.getWindowHandles();
		
		     for (String i : allwindow) {
		    	 
		    	 String title = driver.switchTo().window(i).getTitle();
		    	 
		    	 System.out.println("Title:"+title);
		    	 Thread.sleep(2000);}}
		    	 
		    	 /*for (String closewindow : allwindow) {
		    		 
		    		 if(!closewindow.equals(parent)) {
		    			 driver.switchTo().window(closewindow).close();
		    		 }
					
				}*/
		    
			}
		



