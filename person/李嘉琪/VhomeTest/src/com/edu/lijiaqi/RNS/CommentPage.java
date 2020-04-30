package com.edu.lijiaqi.RNS;

import com.edu.base.BaseAction;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CommentPage {

	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	
	public CommentPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
	public AndroidElement sq_btn() {
		return this.driver.findElementByXPath("//*[@text='社区']");
	}
	public AndroidElement comt_btn() {
		return this.driver.findElementById("h.jpc.vhome:id/iv_hot_comment");
	}
	public AndroidElement input_btn() {
		return this.driver.findElementByXPath("//*[@text='来评论一句吧']");
	}
	public AndroidElement pl_button() {
		return this.driver.findElementByXPath("//*[@text='评论']");
	}
	//得到评论内容做断言
	public AndroidElement news_btn() {
		return this.driver.findElementById("h.jpc.vhome:id/comment_item_content");
	}
	//评论
	public CommentPage comt(String a1) {
		action.click(sq_btn());
		action.click(comt_btn());
		action.type(input_btn(),a1);
		action.click(pl_button());
		return new CommentPage(driver);
	}
	//断言方法
		public String getComt() {
			return news_btn().getText();
		}
}
