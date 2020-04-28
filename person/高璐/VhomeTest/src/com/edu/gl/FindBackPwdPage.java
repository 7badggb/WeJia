package com.edu.gl;

import com.edu.base.BaseAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

//找回密码页面

public class FindBackPwdPage {

	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	
	public FindBackPwdPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
//	返回键
	public AndroidElement backToLogin() {
		return driver.findElementById("h.jpc.vhome:id/backToLogin");
	}
//	手机号
	public AndroidElement etPhone() {
		return this.driver.findElementById("h.jpc.vhome:id/input_phone_et");
	}
//	获取验证码
	public AndroidElement etPwd() {
		return this.driver.findElementById("h.jpc.vhome:id/request_code_btn");
	}
//	输入验证码
	public AndroidElement use_code() {
		return this.driver.findElementById("h.jpc.vhome:id/input_code_et");
	}
//	下一步
	public AndroidElement next_btu() {
		return this.driver.findElementByXPath("//*[@text='下一步']");
	}
}
