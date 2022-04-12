package Table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/table.html");
		System.out.println("___________________________All data___________________________");
		List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for(WebElement i : alldata) {
			System.out.println(i.getText());
		}
		System.out.println("*************Header******************************");
		List<WebElement> header = driver.findElements(By.xpath("//table/tbody/tr/th"));
		for(WebElement h : header) {
			System.out.println(h.getText());
		}
		System.out.println("**************Specific Row*********************************");
		
		List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr[2]/td"));
		for(WebElement a : row) {
			System.out.println(a.getText());
		}
		System.out.println("*************Specific Column****************************");
		List<WebElement> column = driver.findElements(By.xpath("//table/tbody/tr/td[5]"));
		for(WebElement b : column) {
			System.out.println(b.getText());
		}
		System.out.println("***************************Row Size*******************************");
		List<WebElement> rowsize = driver.findElements(By.tagName("tr"));	
			int size = rowsize.size();
			System.out.println("Rowsize:"+size);
		System.out.println("***************************Column Size****************************");	
		List<WebElement> columnsize = driver.findElements(By.tagName("th"));
		     int size2 = columnsize.size();
		     System.out.println("Columnsize:"+size2);
		System.out.println("*******************Following*************************");         
		WebElement follow = driver.findElement(By.xpath("//td[normalize-space( )='Gopi']//following::td[6]"));     
		System.out.println("follow:"+follow.getText());
		    
		    
	}

}
