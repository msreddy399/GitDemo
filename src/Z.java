import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Z {

	public static void main(String[] args) {

		String p = System.getProperty("user.dir");
		System.out.println(p);
		}
	}
	//Select s = new Select(driver.findElement(By.id("dropdown-class-example"))); ::Select class
			//s.selectByValue("option1");
			//driver.findElement(By.id("alertbtn")).click(); 
			//Alert a = driver.switchTo().alert(); a.accept(); ::Alert
			//driver.findElement(By.xpath("//input[@value='radio1']")).click(); ::radio button
			//driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).click(); ::check box
			
			/*driver.findElement(By.xpath("//button[@id='openwindow']")).click(); ::window handling
			
			Set<String> wh = driver.getWindowHandles();
			
			Iterator<String> itr = wh.iterator();
			
			String pw = itr.next();
			String cw = itr.next();
			
			driver.switchTo().window(cw);
			
			System.out.println(driver.getCurrentUrl());
			
			driver.switchTo().window(pw);
			System.out.println(driver.getCurrentUrl());*/
	
	/*List<WebElement> list = driver.findElements(By.className("ui-menu-item"));
	
	for(int i=0;i<list.size();i++){
		
		if(list.get(i).getText().equalsIgnoreCase("China")){
			
			list.get(i).click();
			break;
		}
	}		*/ //Handling auto suggestion dropdowns
	
	/*driver.findElement(By.xpath("//*[@id='autocomplete']")).sendKeys("in");
	
	Actions a = new Actions(driver);
	
	a.moveToElement(driver.findElement(By.className("ui-menu-item"))).click().build().perform();*/
	//Handling auto suggestion dropdowns method-2
	
	//JavascriptExecutor js=(JavascriptExecutor)driver;
	
	//js.executeScript("window.scrollBy(0,250)", "");//scroll down vertical
	//js.executeScript("window.scrollBy(250,0)", "");//scroll Horizontal
	//js.executeScript("window.scrollBy(0,-250)", "");//scroll up
	//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");//scroll bottom
	//js.executeScript("window.scrollBy(0,1000)", "");
	 // driver.switchTo().frame("iframe-name");
	//a.moveToElement(driver.findElement(By.xpath("//*[@id='autocomplete']"))).
	//keyDown(Keys.SHIFT).sendKeys("INDia").build().perform();

