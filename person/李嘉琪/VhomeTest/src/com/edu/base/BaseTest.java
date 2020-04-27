package com.edu.base;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BaseTest {
	public AndroidDriver<AndroidElement> driver;
	
	@BeforeClass
	public void Connet() throws MalformedURLException {
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("deviceName", "c76fb395");
	capabilities.setCapability("appPackage", "h.jpc.vhome");
	capabilities.setCapability("appActivity", ".chat.activity.WelcomeActivity");
	capabilities.setCapability("noReset", "true");
	driver = new AndroidDriver<AndroidElement>
	(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	}
//	@AfterClass
//	public void CloseApp() {
//		driver.closeApp();
//	}
}
