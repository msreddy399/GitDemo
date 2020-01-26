package com.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
public class InstallAndroidReaalDevice {
	
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		//cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		cap.setCapability(MobileCapabilityType.APP, "D:\\Calculator_v7.8 (271241277)_apkpure.com.apk");
		//cap.setCapability(MobileCapabilityType.A, value);
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,cap);
		
		System.out.println(driver.currentActivity());
		 System.out.println(driver.getContext());
		//views - Native , Hybrid, Webview
		System.out.println(driver.getOrientation());
		//driver.pressKeyCode(AndroidKeyCode.BACK);
		//System.out.println(driver.isLocked());
	    driver.navigate().back();
	    driver.pressKey(new KeyEvent(AndroidKey.BACK));
        Set<String> contextHandles = driver.getContextHandles();
        //driver.context("Native")

		TouchActions t= new TouchActions(driver);
		
		
		t.singleTap(driver.findElementByXPath("//")).perform();//tap
		t.longPress(driver.findElementByXPath("//")).perform();//longPress
		t.longPress(driver.findElementByXPath("//")).moveToElement(driver.findElementByXPath("//")).release().perform();//swipe
		//t.scroll(xOffset, yOffset)
		//t.dragAndDrop(source, target)
		//t.flick(xSpeed, ySpeed)
		//t.scroll(xOffset, yOffset)
		
  		
	}
}
