import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class A {
	
	static WebDriver driver = new ChromeDriver();
	
	
	
	 


	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Dimension size = driver.manage().window().getSize();
		
		//driver.manage().window().setSize(arg0);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		

		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		
		/*driver.findElement(By.id("hide-textbox")).click();
		driver.findElement(By.id("show-textbox")).click();*/
		String att = driver.findElement(By.xpath("//*[@id='alertbtn']")).getAttribute("value");
		 String cssValue = driver.findElement(By.xpath("//*[@id='alertbtn']")).getCssValue("font-size");
		 
		 driver.findElement(By.xpath("//*[@id='alertbtn']")).sendKeys(Keys.ENTER);
		 WebElement findElement = driver.findElement(By.id(""));
		 
		 System.out.println(size);
		 String s="sss";
		 s.contains("ssssd");
		
		System.out.println(att);
		
		/*Wait<WebDriver> w=new FluentWait<WebDriver>(driver).
				withTimeout(45,TimeUnit.SECONDS).
				pollingEvery(t,TimeUnit.SECONDS).
				ignoring(NoSuchElementException.class);
		 */
		Thread.sleep(9000);
		driver.quit();
		
		
	}

}
