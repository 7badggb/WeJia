package edu.page;

import org.openqa.selenium.remote.server.handler.GetScreenOrientation;

import edu.utils.BaseAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;

public class WelcomePage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public WelcomePage (AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action=new BaseAction(driver);
	}
	
	private AndroidElement go_btn() {
		return driver.findElementById("h.jpc.vhome:id/go");
	}
	public LoginPage switchToLogin() {
		PointOption pOption=new PointOption();
		for(int i=0;i<3;i++) {
		action.swip(pOption.point(1000,1200), pOption.point(0,1200));
		}
		action.click(go_btn());
		return new LoginPage(driver);
	}

}
