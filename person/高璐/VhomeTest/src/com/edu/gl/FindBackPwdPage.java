package com.edu.gl;

import com.edu.base.BaseAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

//�һ�����ҳ��

public class FindBackPwdPage {

	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	
	public FindBackPwdPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
//	���ؼ�
	public AndroidElement backToLogin() {
		return driver.findElementById("h.jpc.vhome:id/backToLogin");
	}
//	�ֻ���
	public AndroidElement etPhone() {
		return this.driver.findElementById("h.jpc.vhome:id/input_phone_et");
	}
//	��ȡ��֤��
	public AndroidElement etPwd() {
		return this.driver.findElementById("h.jpc.vhome:id/request_code_btn");
	}
//	������֤��
	public AndroidElement use_code() {
		return this.driver.findElementById("h.jpc.vhome:id/input_code_et");
	}
//	��һ��
	public AndroidElement next_btu() {
		return this.driver.findElementByXPath("//*[@text='��һ��']");
	}
}
