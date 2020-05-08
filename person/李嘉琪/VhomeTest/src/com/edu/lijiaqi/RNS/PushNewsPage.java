package com.edu.lijiaqi.RNS;

import com.edu.base.BaseAction;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class PushNewsPage {

	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	
	public PushNewsPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
	public AndroidElement sq_btn() {
		return this.driver.findElementByXPath("//*[@text='社区']");
	}
	public AndroidElement add_btn() {
		return this.driver.findElementById("h.jpc.vhome:id/addPost");
	}
	public AndroidElement publish_edt() {
		return this.driver.findElementById("h.jpc.vhome:id/edt_post_publish");
	}
	public AndroidElement publish_btn() {
		return this.driver.findElementByXPath("//*[@text='发表']");
	}
	public AndroidElement wd_btn() {
		return this.driver.findElementByXPath("//*[@text='我的']");
	}
	public AndroidElement tz_btn() {
		return this.driver.findElementByXPath("//*[@text='我的帖子']");
	}
	public AndroidElement delete_edt() {
		return this.driver.findElementById("h.jpc.vhome:id/tv_hot_content");
	}
	public AndroidElement delete_btn() {
		return this.driver.findElementByXPath("//*[@text='确定']");
	}
	public AndroidElement qx_btn() {
		return this.driver.findElementByXPath("//*[@text='取消']");
	}
	//发表动态
	public PushNewsPage push(String a1) {
		action.click(sq_btn());
		action.click(add_btn());
		action.click(publish_edt());
		action.type(publish_edt(), a1);
		action.click(publish_btn());
		return new PushNewsPage(driver);
	}
	//取消动态
	public PushNewsPage cancle(String a2) {
		action.click(sq_btn());
		action.click(add_btn());
		action.click(publish_edt());
		action.type(publish_edt(), a2);
		action.click(qx_btn());
		return new PushNewsPage(driver);
	}
	//断言
	public String getNews() {
		return delete_edt().getText();
	}
	//删除动态
	public PushNewsPage delete() {
		action.click(wd_btn());
		action.click(tz_btn());
		action.longPress(delete_edt());
		action.click(delete_btn());
		return new PushNewsPage(driver);
	}
}
