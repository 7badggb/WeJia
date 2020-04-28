package com.edu.gl;

import com.edu.base.BaseAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

//��֤���¼ҳ��

public class CodeLoginPage {

	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	
	public CodeLoginPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}	
//	�ֻ���
	public AndroidElement input_phone_et() {
		return this.driver.findElementById("h.jpc.vhome:id/input_phone_et");
	}
//	��ȡ��֤��
	public AndroidElement request_code_btn() {
		return this.driver.findElementById("h.jpc.vhome:id/request_code_btn");
	}
//	������֤��
	public AndroidElement input_code_et() {
		return this.driver.findElementById("h.jpc.vhome:id/input_code_et");
	}
//	ʹ�������¼
	public AndroidElement use_pwd() {
		return this.driver.findElementById("h.jpc.vhome:id/use_pwd");
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
