package com.edu.gl;

import com.edu.base.BaseAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

//密码登录页面

public class PwdLoginPage {

	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	
	public PwdLoginPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
//	手机号
	public AndroidElement etPhone() {
		return this.driver.findElementById("h.jpc.vhome:id/etPhone");
	}
//	密码
	public AndroidElement etPwd() {
		return this.driver.findElementById("h.jpc.vhome:id/etPwd");
	}
//	可见不可见
	public AndroidElement togglePwd() {
		return this.driver.findElementById("h.jpc.vhome:id/togglePwd");
	}
//	验证码登录
	public AndroidElement use_code() {
		return this.driver.findElementById("h.jpc.vhome:id/use_code");
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
	
	public String loginSuccess(String phone,String password) {
		action.type(etPhone(),"15176906306");
		action.type(etPwd(),"123456");
		action.click(pwdLogin());
		return action.getToast();
	}
	
	public String loginFail(String phone,String password) {
		action.type(etPhone(),"15176906306");
		action.type(etPwd(),"123456");
		action.click(pwdLogin());
		return action.getToast();
	}
}
