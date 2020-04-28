package edu.page;

import edu.utils.BaseAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BroadcastPage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public BroadcastPage (AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action=new BaseAction(driver);
	}
	private AndroidElement music_list() {
		return driver.findElementById("h.jpc.vhome:id/recommend_list");//7条，点击它的第0条子孩子
	}

}
