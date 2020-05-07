package edu.page;



import edu.utils.BaseAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CommunityPage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public CommunityPage (AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action=new BaseAction(driver);
	}
	private AndroidElement broadcase_item() {
		return driver.findElementByXPath("//*[@text='收音机']");
	}
	public BroadcastPage enterBroadcastPage() {
		action.click(broadcase_item());
		return new BroadcastPage(driver);
	}

}
