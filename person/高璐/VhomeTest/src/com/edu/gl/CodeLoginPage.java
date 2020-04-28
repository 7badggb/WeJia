package com.edu.gl;

import com.edu.base.BaseAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

//验证码登录页面

public class CodeLoginPage {

	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	
	public CodeLoginPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}	
//	手机号
	public AndroidElement input_phone_et() {
		return this.driver.findElementById("h.jpc.vhome:id/input_phone_et");
	}
//	获取验证码
	public AndroidElement request_code_btn() {
		return this.driver.findElementById("h.jpc.vhome:id/request_code_btn");
	}
//	输入验证码
	public AndroidElement input_code_et() {
		return this.driver.findElementById("h.jpc.vhome:id/input_code_et");
	}
//	使用密码登录
	public AndroidElement use_pwd() {
		return this.driver.findElementById("h.jpc.vhome:id/use_pwd");
	}
//	登录
	public AndroidElement pwdLogin() {
		return this.driver.findElementById("h.jpc.vhome:id/pwdLogin");
	}
//	找回密码
	public AndroidElement findBackPwd() {
		return this.driver.findElementById("h.jpc.vhome:id/findBackPwd");
	}
//	用户注册
	public AndroidElement register() {
		return this.driver.findElementById("h.jpc.vhome:id/register");
	}
	
	public String loginSuccess(String phone) throws InterruptedException {
		action.type(input_phone_et(),"15176906306");
		action.click(request_code_btn());
		Thread.sleep(3000);
		action.type(input_code_et(),"");
		action.click(pwdLogin());
		return action.getToast();
	}
	
	public String loginFail(String phone) throws InterruptedException {
		action.type(input_phone_et(),"15176906306");
		action.click(request_code_btn());
		Thread.sleep(3000);
		action.type(input_code_et(),"");
		action.click(pwdLogin());
		return action.getToast();
	}
}
