package edu.page;

import edu.utils.BaseAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class NewsPage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public NewsPage (AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action=new BaseAction(driver);
	}
	private AndroidElement lv_data() {
		return driver.findElementById("h.jpc.vhome:id/lv_data");//8条，点击它的第0条子孩子
	}

}
