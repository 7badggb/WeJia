package com.edu.gl;

import com.edu.base.BaseAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

//ע��ҳ��

public class RegisterPage {

	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	
	public RegisterPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
//	���ؼ�
	public AndroidElement backToLogin() {
		return driver.findElementById("h.jpc.vhome:id/backToLogin");
	}
//	�ǳ�
	public AndroidElement userName() {
		return driver.findElementById("h.jpc.vhome:id/userName");
	}
//	�ֻ���
	public AndroidElement input_phone_et() {
		return driver.findElementById("h.jpc.vhome:id/input_phone_et");
	}
//	��ȡ��֤��
	public AndroidElement request_code_btn() {
		return driver.findElementById("h.jpc.vhome:id/request_code_btn");
	}
//	��֤��
	public AndroidElement input_code_et() {
		return driver.findElementById("h.jpc.vhome:id/input_code_et");
	}
//	����
	public AndroidElement etPwd() {
		return driver.findElementById("h.jpc.vhome:id/etPwd");
	}
//	�ɼ����ɼ�
	public AndroidElement togglePwd() {
		return driver.findElementById("h.jpc.vhome:id/togglePwd");
	}
//	��ĸע��
	public AndroidElement rb1() {
		return driver.findElementById("h.jpc.vhome:id/rb1");
	}
//	��Ůע��
	public AndroidElement rb2() {
		return driver.findElementById("h.jpc.vhome:id/rb2");
	}
//	ע�Ტ��¼
	public AndroidElement registerOK() {
		return driver.findElementById("h.jpc.vhome:id/registerOK");
	}
	
	public String registerSuccess(String name,String phone,String code,String password) {
		action.type(userName(),name);
		action.type(input_phone_et(),phone);
		action.click(request_code_btn());
		action.type(input_code_et(),code);
		action.type(etPwd(),password);
		action.click(rb1());
		return action.getToast();
	}
	public String registerFail(String name,String phone,String code,String password) {
		action.type(userName(),name);
		action.type(input_phone_et(),phone);
		action.click(request_code_btn());
		action.type(input_code_et(),code);
		action.type(etPwd(),password);
		action.click(rb2());	
		return action.getToast();
	}
}
