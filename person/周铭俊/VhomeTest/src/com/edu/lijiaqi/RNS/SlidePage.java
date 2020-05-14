package com.edu.lijiaqi.RNS;

import com.edu.base.BaseAction;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;

public class SlidePage {

	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	
	public SlidePage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
	public AndroidElement sq_btn() {
		return this.driver.findElementByXPath("//*[@text='社区']");
	}
	//下拉刷新
		public SlidePage refreshTest() {
			PointOption pOption=new PointOption();
			action.click(sq_btn());
			action.swip(pOption.point(200,350), pOption.point(200,800));
			return new SlidePage(driver);
		}
	//下拉刷新
		public SlidePage downTest() {
			PointOption pOption=new PointOption();
			action.click(sq_btn());
			action.swip(pOption.point(200,1300), pOption.point(200,350));
			return new SlidePage(driver);
		}
}
