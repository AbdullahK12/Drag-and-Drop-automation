package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Red {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91814\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
		WebDriver Texas = new ChromeDriver();
		Texas.manage().window().maximize();
		Texas.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement Simple = Texas.findElement(By.xpath("//button[@class='btn btn-danger']"));
		Simple.click();
		
		Alert alert = Texas.switchTo().alert();
		alert.accept();
		
		
		WebElement Confirm = Texas.findElement(By.xpath("(//a[@data-toggle='tab'])[2]"));
		Confirm.click();
		
		WebElement cancel = Texas.findElement(By.xpath("//button[@class='btn btn-primary'][1]"));
		cancel.click();
		Texas.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
		WebElement Confirm2 = Texas.findElement(By.id("demo"));
		System.out.println(Confirm2.getText());
		
		//prompt
		
		WebElement prompt = Texas.findElement(By.xpath("(//a[@data-toggle='tab'])[3]"));
		prompt.click();
		
		WebElement prompt_1 = Texas.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		prompt_1.click();
		
		Alert alert2 = Texas.switchTo().alert();
		alert2.sendKeys("Automation Testing user");
		alert2.accept();
		WebElement text = Texas.findElement(By.id("demo1"));
		System.out.println(text.getText());
		Texas.close();
		
		
		
		
		
		
	}

}
