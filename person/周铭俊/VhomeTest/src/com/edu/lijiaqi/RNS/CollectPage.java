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
		return this.driver.findElementByXPath("//*[@text='社区']");
	}
	public AndroidElement sc_btn() {
		return this.driver.findElementByXPath("//*[@text='收藏']");
	}
	public AndroidElement wd_btn() {
		return this.driver.findElementByXPath("//*[@text='我的']");
	}
	public AndroidElement mysc_btn() {
		return this.driver.findElementByXPath("//*[@text='我的收藏']");
	}
	//得到收藏成功信息做断言
	public AndroidElement dec_btn() {
		return this.driver.findElementById("h.jpc.vhome:id/tv_hot_save");
	}
	//取消收藏
	public CollectPage sc_off() {
		action.click(sq_btn());
		action.click(sc_btn());
		action.click(wd_btn());
		action.click(mysc_btn());
		return new CollectPage(driver);
	}
	//收藏
	public CollectPage sc_on() {
		action.click(sq_btn());
		action.click(sc_btn());
		return new CollectPage(driver);
	}
	//断言方法
	public String getCon() {
		return dec_btn().getText();
	}
}
