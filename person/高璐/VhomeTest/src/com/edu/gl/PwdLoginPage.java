package com.edu.gl;

import com.edu.base.BaseAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

//�����¼ҳ��

public class PwdLoginPage {

	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	
	public PwdLoginPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
//	�ֻ���
	public AndroidElement etPhone() {
		return this.driver.findElementById("h.jpc.vhome:id/etPhone");
	}
//	����
	public AndroidElement etPwd() {
		return this.driver.findElementById("h.jpc.vhome:id/etPwd");
	}
//	�ɼ����ɼ�
	public AndroidElement togglePwd() {
		return this.driver.findElementById("h.jpc.vhome:id/togglePwd");
	}
//	��֤���¼
	public AndroidElement use_code() {
		return this.driver.findElementById("h.jpc.vhome:id/use_code");
	}
//	��¼
	public AndroidElement pwdLogin() {
		return this.driver.findElementById("h.jpc.vhome:id/pwdLogin");
	}
//	�һ�����
	public AndroidElement findBackPwd() {
		return this.driver.findElementById("h.jpc.vhome:id/findBackPwd");
	}
//	�û�ע��
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
