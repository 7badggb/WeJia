package edu.base;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BaseTest {
	public AndroidDriver<AndroidElement> driver;
	@BeforeClass
	public void Connet() throws MalformedURLException {
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("deviceName", "127.0.0.1:62001");
	capabilities.setCapability("appPackage", "com.example.android.notepad");
	capabilities.setCapability("appActivity", ".NotesList");
	capabilities.setCapability("noReset", "true");
	driver = new AndroidDriver<AndroidElement>
	(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	}
}
