package edu.page;

import java.util.List;

import org.openqa.selenium.By;

import edu.utils.BaseAction;
import io.appium.java_client.MobileElement;
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
	public MobileElement getFirstMusic() {
		List<MobileElement> items = album_detail_list().findElements(By.className("android.widget.RelativeLayout"));
		int count = items.size();
		return items.get(0);
		}
	//得到整个列表的大小，看是不是5个
	public int getMusicCount() {
		List<MobileElement> items = album_detail_list().findElements(By.className("android.widget.RelativeLayout"));
		int count = items.size();
		return count;
		}
	//进入第一首歌
	public void enterMusic() {
		action.click(getFirstMusic());
	}
	//点击其他的歌
	public boolean clickMusic() {
		List<MobileElement> items = album_detail_list().findElements(By.className("android.widget.RelativeLayout"));
		int count = items.size();
		return items.get(1).isEnabled();	
	}
	
	//歌的进度条
	private AndroidElement track_seek_bar() {
		return driver.findElementById("h.jpc.vhome:id/track_seek_bar");
	}
	//左
	private AndroidElement left_btn() {
		return driver.findElementById("h.jpc.vhome:id/pre_btn");	}
	//暂停
	private AndroidElement center_btn() {
		return driver.findElementById("h.jpc.vhome:id/play_stop_btn");
	}
	//右
	private AndroidElement right_btn() {
		return driver.findElementById("h.jpc.vhome:id/next_btn");
	}
	//歌的进度条是否可以滑动
	public boolean scrollBar() {
		return track_seek_bar().isEnabled();	
	}
	//左键是否可以点击
	public boolean clickLeftBtn() {
		return left_btn().isEnabled();	
	}
	//暂停键是否可以点击
		public boolean clickStopBtn() {
			return center_btn().isEnabled();	
		}
		//右键是否可以点击
		public boolean clickRightBtn() {
			return right_btn().isEnabled();	
		}
		//返回到broadcasePage界面
		public void returnBroadcastPage() {
			action.returnLastPage();
			action.returnLastPage();
		}
	
	
	
	
	
	

}
