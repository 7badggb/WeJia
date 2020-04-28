package edu.page;

import edu.utils.BaseAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MyPage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public MyPage (AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action=new BaseAction(driver);
	}
	
	private AndroidElement exit_btn() {
		return driver.findElementByXPath("//*[@text='退出登录']");
	}
	private AndroidElement ok_btn() {
		return driver.findElementById("h.jpc.vhome:id/commit");
	}
	public void logout() {
		action.click(exit_btn());
		action.click(ok_btn());
	}
	

}
