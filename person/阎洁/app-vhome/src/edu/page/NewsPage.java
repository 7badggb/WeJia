package edu.page;

import java.util.List;

import org.openqa.selenium.By;

import edu.utils.BaseAction;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class NewsPage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public NewsPage (AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action=new BaseAction(driver);
	}
	//得到新闻列表
	private AndroidElement lv_data() {
		return driver.findElementById("h.jpc.vhome:id/lv_data");//8条，点击它的第0条子孩子
	}
	//得到第一条新闻
	public MobileElement getNewsItem() {
		List<MobileElement> items = lv_data().findElements(By.className("android.widget.LinearLayout"));
		int count = items.size();
		return items.get(0);
		}
	//得到整个列表的大小，看是不是8个
	public int getNewsCount() {
		List<MobileElement> items = lv_data().findElements(By.className("android.widget.LinearLayout"));
		int count = items.size();
		return count;
		}
	//打开第一条新闻
	public boolean clickNews() {
		return getNewsItem().isEnabled();
	}
		
		

}
