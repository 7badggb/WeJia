package edu.page;

import edu.utils.BaseAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LoginPage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public LoginPage (AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action=new BaseAction(driver);
	}
	
	private AndroidElement phone_et() {
		return driver.findElementById("h.jpc.vhome:id/etPhone");
	}
	private AndroidElement password_et() {
		return driver.findElementById("h.jpc.vhome:id/etPwd");
	}
	private AndroidElement login_btn() {
		return driver.findElementById("h.jpc.vhome:id/pwdLogin");
	}
	
	public MainPage login(String phone,String password) {
		action.type(phone_et(), phone);
		action.type(password_et(), password);
		action.click(login_btn());
		return new MainPage(driver);
	}


}
