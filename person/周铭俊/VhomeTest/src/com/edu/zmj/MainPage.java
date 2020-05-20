package com.edu.zmj;

import com.edu.base.BaseAction;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MainPage {

	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	
	public MainPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
	public AndroidElement name_btn() {
		return this.driver.findElementByXPath("//*[@text='�ǳ�']");
	}
	public AndroidElement inputname_btn() {
		return this.driver.findElementById("h.jpc.vhome:id/ed_sign");
	}
	public AndroidElement ewm_btn() {
		return this.driver.findElementByXPath("//*[@text='��ά��']");
	}
	public AndroidElement sex_btn() {
		return this.driver.findElementByXPath("//*[@text='�Ա�']");
	}
	public AndroidElement man_btn() {
		return this.driver.findElementByXPath("//*[@text='��']");
	}
	public AndroidElement woman_btn() {
		return this.driver.findElementByXPath("//*[@text='Ů']");
	}
	public AndroidElement birthday_btn() {
		return this.driver.findElementByXPath("//*[@text='����']");
	}
	public AndroidElement dq_btn() {
		return this.driver.findElementByXPath("//*[@text='����']");
	}
	public AndroidElement gxqm_btn() {
		return this.driver.findElementByXPath("//*[@text='����ǩ��']");
	}
	public AndroidElement inputgxqm_btn() {
		return this.driver.findElementById("h.jpc.vhome:id/ed_sign");
	}
	public AndroidElement year_btn() {
		return this.driver.findElementById("h.jpc.vhome:id/year");
	}
	public AndroidElement month_btn() {
		return this.driver.findElementById("h.jpc.vhome:id/month");
	}
	public AndroidElement day_btn() {
		return this.driver.findElementById("h.jpc.vhome:id/day");
	}
	public AndroidElement qd_btn() {
		return this.driver.findElementByXPath("//*[@text='ȷ��']");
	}
	public AndroidElement province_btn() {
		return this.driver.findElementById("h.jpc.vhome:id/id_province");
	}
	public AndroidElement city_btn() {
		return this.driver.findElementById("h.jpc.vhome:id/id_city");
	}
	public AndroidElement district_btn() {
		return this.driver.findElementById("h.jpc.vhome:id/id_district");
	}
	//�޸��ǳ�
	public MainPage changename(String a1) {
		action.click(name_btn());
		action.type(inputname_btn(),a1);
		return new MainPage(driver);
	}
	//��ά��
	public MainPage ewm() {
		action.click(ewm_btn());
		return new MainPage(driver);
	}
	//�Ա�
	public MainPage changesex() {
		action.click(sex_btn());
		action.click(man_btn());
		return new MainPage(driver);
	}
	//����ǩ��
	public MainPage changegxqm(String a2) {
		action.click(gxqm_btn());
		action.type(inputgxqm_btn(),a2);
		return new MainPage(driver);
	}
}