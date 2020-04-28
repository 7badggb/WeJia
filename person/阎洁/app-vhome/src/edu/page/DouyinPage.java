package edu.page;

import edu.utils.BaseAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DouyinPage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public DouyinPage (AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action=new BaseAction(driver);
	}
	private AndroidElement album_detail_list() {
		return driver.findElementById("h.jpc.vhome:id/album_detail_list");//5条，点击它的第0条子孩子
	}
	//歌的进度条
	private AndroidElement track_seek_bar() {
		return driver.findElementById("h.jpc.vhome:id/track_seek_bar");//5条，点击它的第0条子孩子
	}
	//左
	private AndroidElement left_btn() {
		return driver.findElementById("h.jpc.vhome:id/pre_btn");//5条，点击它的第0条子孩子
	}
	//暂停
	private AndroidElement center_btn() {
		return driver.findElementById("h.jpc.vhome:id/play_stop_btn");//5条，点击它的第0条子孩子
	}
	//右
	private AndroidElement right_btn() {
		return driver.findElementById("h.jpc.vhome:id/next_btn");//5条，点击它的第0条子孩子
	}
	
	
	
	
	

}
