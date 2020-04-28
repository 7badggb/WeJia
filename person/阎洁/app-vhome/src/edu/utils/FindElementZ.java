package edu.utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class FindElementZ {
	public AndroidDriver<AndroidElement> driver;
	public AndroidElement findZ(String locator,String content) {
		if (locator.equals("xpath")) {
			return driver.findElementByXPath(content);			
		}else if (locator.equals("id")) {
			return driver.findElementById(content);			
		}else if (locator.equals("className")) {
			return driver.findElementByClassName(content);
		}
		return null;
	}

}
