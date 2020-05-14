package com.edu.lijiaqi.RNS;


import com.edu.base.BaseAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class InitPage {
	
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	
	public InitPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
	public AndroidElement sq() {
		return this.driver.findElementByXPath("//*[@text='社区']");
	}
	public AndroidElement pl() {
		return this.driver.findElementByXPath("//*[@resource-id='h.jpc.vhome:id/rl_post_comment']");
	}
	public AndroidElement sr() {
		return this.driver.findElementByXPath("//*[@text='来评论一句吧']");
	}
	public AndroidElement pl_button() {
		return this.driver.findElementByXPath("//*[@text='评论']");
	}
	public InitPage HuaDong(String a1) {
		action.click(sq());
		action.click(pl());
		action.type(sr(),a1);
		action.click(pl_button());
		return new InitPage(driver);
	}
}
