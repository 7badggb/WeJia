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
	public AndroidElement hf1_btn() {
		return this.driver.findElementByXPath("//*[@text='长者']");
	}
	public AndroidElement hf2_btn()	{
		return this.driver.findElementByXPath("//*[@text='回复 长者 的评论:']");
	}
	public AndroidElement fb_btn()	{
		return this.driver.findElementByXPath("//*[@text='发布']");
	}
	//得到评论内容做断言
	public AndroidElement news_btn() {
		return this.driver.findElementById("h.jpc.vhome:id/comment_item_content");
	}
	//得到回复内容做断言
	public AndroidElement rp_btn() {
		return this.driver.findElementById("h.jpc.vhome:id/reply_item_content");
	}
	//评论
	public CommentPage comt(String a1) {
		action.click(sq_btn());
		action.click(comt_btn());
		action.type(input_btn(),a1);
		action.click(pl_button());
		return new CommentPage(driver);
	}
	//回复
	public CommentPage reply(String a2) {
		action.click(sq_btn());
		action.click(comt_btn());
		action.click(hf1_btn());
		action.type(hf2_btn(), a2);
		action.click(fb_btn());
		return new CommentPage(driver);
	}
	//断言方法
	public String getComt() {
		return news_btn().getText();
	}
	
	public String getReply() {
		return rp_btn().getText();
	}
		
}
