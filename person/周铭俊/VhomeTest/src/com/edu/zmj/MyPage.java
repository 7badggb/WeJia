package com.edu.zmj;

import com.edu.base.BaseAction;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MyPage {

	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	
	public MyPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
	public AndroidElement wd_btn() {
		return this.driver.findElementByXPath("//*[@text='�ҵ�']");
	}
	public AndroidElement gz_btn() {
		return this.driver.findElementById("h.jpc.vhome:id/tv_myself_attention");
	}
	public AndroidElement fs_btn() {
		return this.driver.findElementById("h.jpc.vhome:id/tv_myself_funs");
	}
	public AndroidElement wdxx_btn() {
		return this.driver.findElementByXPath("//*[@text='�ҵ���Ϣ']");
	}
	public AndroidElement wdtz_btn() {
		return this.driver.findElementByXPath("//*[@text='�ҵ�����']");
	}
	public AndroidElement wdgl_btn() {
		return this.driver.findElementByXPath("//*[@text='�ҵĹ���']");
	}
	public AndroidElement gywj_btn() {
		return this.driver.findElementByXPath("//*[@text='����΢��']");
	}
	public AndroidElement wdsc_btn() {
		return this.driver.findElementByXPath("//*[@text='�ҵ��ղ�']");
	}
	//��ע
	public MyPage gz() {
		action.click(wd_btn());
		action.click(gz_btn());
		return new MyPage(driver);
	}
	//��˿
	public MyPage fs() {
		action.click(wd_btn());
		action.click(fs_btn());
		return new MyPage(driver);
	}
	//��Ϣ
	public MyPage xx() {
		action.click(wd_btn());
		action.click(wdxx_btn());
		return new MyPage(driver);
	}
	//����
	public MyPage tz() {
		action.click(wd_btn());
		action.click(wdtz_btn());
		return new MyPage(driver);
	}
	//����
	public MyPage gl() {
		action.click(wd_btn());
		action.click(wdgl_btn());
		return new MyPage(driver);
	}
	//�ղ�
	public MyPage sc() {
		action.click(wd_btn());
		action.click(wdsc_btn());
		return new MyPage(driver);
	}
	//����
	public MyPage gy() {
		action.click(wd_btn());
		action.click(gywj_btn());
		return new MyPage(driver);
	}
}
