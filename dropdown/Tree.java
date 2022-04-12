package dropdown;
//Single Dropdown and Multiple dropdown
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tree {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver Pilot = new ChromeDriver();
		Pilot.manage().window().maximize();
		
		Pilot.get("http://leafground.com/pages/Dropdown.html");//fully load the page
		//navigate to - will not load the page completely
		
		WebElement Passenger = Pilot.findElement(By.id("dropdown1"));
		Select Q = new Select(Passenger);
		
		Q.selectByIndex(1);
		Thread.sleep(3000);
		
		Q.selectByValue("3");
		Thread.sleep(3000);
		
		Q.selectByVisibleText("Loadrunner");
		Thread.sleep(3000);
		
		WebElement more = Pilot.findElement(By.xpath("(//select)[6]"));
		Select n = new Select(more);
		
		boolean multiple = n.isMultiple();
		System.out.println("multiple:"+multiple);
		
		List<WebElement> options = n.getOptions();
		
		System.out.println("options:"+options.size());
		
		for(WebElement i:options)
		{
			System.out.println(i.getText());
		}
		n.selectByValue("3");
		Thread.sleep(1000);
		
		n.selectByIndex(4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
