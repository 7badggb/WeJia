package com.edu.lijiaqi.RNS;

import com.edu.base.BaseAction;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class GiveUpPage {

	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	
	public GiveUpPage (AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
	public AndroidElement dz_btn() {
		return this.driver.findElementById("h.jpc.vhome:id/rl_post_like");
	}
	public AndroidElement sc_btn() {
		return this.driver.findElementById("h.jpc.vhome:id/iv_hot_save");
	}
	public AndroidElement pl_btn() {
		return this.driver.findElementById("h.jpc.vhome:id/rl_post_comment");
	}
	public AndroidElement sq_btn() {
		return this.driver.findElementByXPath("//*[@text='社区']");
	}
	public AndroidElement gz1_btn() {
		return this.driver.findElementByXPath("//*[@text='+关注']");
	}
	public AndroidElement gz2_btn() {
		return this.driver.findElementById("h.jpc.vhome:id/tv_attention");
	}
	public AndroidElement kj_btn() {
		return this.driver.findElementById("h.jpc.vhome:id/iv_hot_person");
	}
	//点赞收藏
	public GiveUpPage giveOn() {
		action.click(sq_btn());
		action.click(dz_btn());
		action.click(sc_btn());
		return new GiveUpPage(driver);
	}
	//取消点赞收藏
	public GiveUpPage giveOff() {
		action.click(sq_btn());
		action.click(pl_btn());
		action.click(dz_btn());
		action.click(sc_btn());
		return new GiveUpPage(driver);
	}
	//关注
	public GiveUpPage followOn() {
		action.click(sq_btn());
		action.click(pl_btn());
		action.click(gz1_btn());
		return new GiveUpPage(driver);
	}
	//进入空间
	public GiveUpPage enter() {
		action.click(sq_btn());
		action.click(kj_btn());
		return new GiveUpPage(driver);
	}
	//断言方法
	public String getNews() {
		return gz2_btn().getText();
	}
}
