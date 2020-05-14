package com.edu.lijiaqi.RNS;

import com.edu.base.BaseAction;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CollectPage {

	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	
	public CollectPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
	public AndroidElement sq_btn() {
		return this.driver.findElementByXPath("//*[@text='����']");
	}
	public AndroidElement sc_btn() {
		return this.driver.findElementByXPath("//*[@text='�ղ�']");
	}
	public AndroidElement wd_btn() {
		return this.driver.findElementByXPath("//*[@text='�ҵ�']");
	}
	public AndroidElement mysc_btn() {
		return this.driver.findElementByXPath("//*[@text='�ҵ��ղ�']");
	}
	//�õ��ղسɹ���Ϣ������
	public AndroidElement dec_btn() {
		return this.driver.findElementById("h.jpc.vhome:id/tv_hot_save");
	}
	//ȡ���ղ�
	public CollectPage sc_off() {
		action.click(sq_btn());
		action.click(sc_btn());
		action.click(wd_btn());
		action.click(mysc_btn());
		return new CollectPage(driver);
	}
	//�ղ�
	public CollectPage sc_on() {
		action.click(sq_btn());
		action.click(sc_btn());
		return new CollectPage(driver);
	}
	//���Է���
	public String getCon() {
		return dec_btn().getText();
	}
}
