package com.edu.lijiaqi.RNS;

import com.edu.base.BaseAction;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DeletePage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	
	public DeletePage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
	public AndroidElement sq_btn() {
		return this.driver.findElementByXPath("//*[@text='社区']");
	}
	public AndroidElement comt_btn() {
		return this.driver.findElementById("h.jpc.vhome:id/iv_hot_comment");
	}
	public AndroidElement hf_btn() {
		return this.driver.findElementByXPath("//*[@text='长者']");
	}
	public AndroidElement qd_btn() {
		return this.driver.findElementByXPath("//*[@text='确定']");
	}
	//删除第一条属于自己的评论
	public DeletePage delete() {
		action.click(sq_btn());
		action.click(comt_btn());
		action.longPress(hf_btn());
		action.click(qd_btn());
		return new DeletePage(driver);
	}
}
