package edu.page;

import edu.utils.BaseAction;
import edu.utils.FindElementZ;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MainPage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public MainPage (AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action=new BaseAction(driver);
	}
	private AndroidElement weather_item() {
		return driver.findElementById("h.jpc.vhome:id/kantianqi");
	}
	private AndroidElement news_item() {
		return driver.findElementById("h.jpc.vhome:id/quxinwen");
	}
	
	private AndroidElement mine_item() {
		return driver.findElementByXPath("//*[@text='我的']");
		
	}
	public WeatherPage enterWeather() {
		action.click(weather_item());
		return new WeatherPage(driver);
	}
	public MyPage enterMine() {
		action.returnLastPage();
		action.click(mine_item());
		return new MyPage(driver);
	}
	
	public void exitApp() {
		action.returnLastPage();
	}


}
