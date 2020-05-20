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
		return this.driver.findElementByXPath("//*[@text='我的']");
	}
	public AndroidElement gz_btn() {
		return this.driver.findElementById("h.jpc.vhome:id/tv_myself_attention");
	}
	public AndroidElement fs_btn() {
		return this.driver.findElementById("h.jpc.vhome:id/tv_myself_funs");
	}
	public AndroidElement wdxx_btn() {
		return this.driver.findElementByXPath("//*[@text='我的消息']");
	}
	public AndroidElement wdtz_btn() {
		return this.driver.findElementByXPath("//*[@text='我的帖子']");
	}
	public AndroidElement wdgl_btn() {
		return this.driver.findElementByXPath("//*[@text='我的关联']");
	}
	public AndroidElement gywj_btn() {
		return this.driver.findElementByXPath("//*[@text='关于微家']");
	}
	public AndroidElement wdsc_btn() {
		return this.driver.findElementByXPath("//*[@text='我的收藏']");
	}
	//关注
	public MyPage gz() {
		action.click(wd_btn());
		action.click(gz_btn());
		return new MyPage(driver);
	}
	//粉丝
	public MyPage fs() {
		action.click(wd_btn());
		action.click(fs_btn());
		return new MyPage(driver);
	}
	//消息
	public MyPage xx() {
		action.click(wd_btn());
		action.click(wdxx_btn());
		return new MyPage(driver);
	}
	//帖子
	public MyPage tz() {
		action.click(wd_btn());
		action.click(wdtz_btn());
		return new MyPage(driver);
	}
	//关联
	public MyPage gl() {
		action.click(wd_btn());
		action.click(wdgl_btn());
		return new MyPage(driver);
	}
	//收藏
	public MyPage sc() {
		action.click(wd_btn());
		action.click(wdsc_btn());
		return new MyPage(driver);
	}
	//关于
	public MyPage gy() {
		action.click(wd_btn());
		action.click(gywj_btn());
		return new MyPage(driver);
	}
}
