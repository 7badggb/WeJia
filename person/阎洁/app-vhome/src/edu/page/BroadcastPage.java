package edu.page;

import java.util.List;

import org.openqa.selenium.By;

import edu.utils.BaseAction;
import io.appium.java_client.MobileElement;
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
	//得到第一条音乐
		public MobileElement getMusicItem() {
			List<MobileElement> items = music_list().findElements(By.className("android.widget.RelativeLayout"));
			int count = items.size();
			return items.get(0);
			}
		//得到整个列表的大小，看是不是7个
		public int getMusicCount() {
			List<MobileElement> items = music_list().findElements(By.className("android.widget.RelativeLayout"));
			int count = items.size();
			return count;
			}
		//打开第一条音乐
		public boolean clickMusic() {
			return getMusicItem().isEnabled();
		}
		public DouyinPage enterDouyinPage() {
			action.click(getMusicItem());
			return new DouyinPage(driver);
		}
		private AndroidElement mine_item() {
			return driver.findElementByXPath("//*[@text='我的']");		
		}
		public MyPage enterMine() {
			action.click(mine_item());
			return new MyPage(driver);
		}


}
