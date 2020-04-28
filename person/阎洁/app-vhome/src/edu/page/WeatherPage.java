package edu.page;

import java.util.List;

import org.openqa.selenium.By;

import edu.utils.BaseAction;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;

public class WeatherPage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	

	public WeatherPage (AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action=new BaseAction(driver);
	}
	private AndroidElement search_et() {
		return driver.findElementById("h.jpc.vhome:id/city_name");
	}
	private AndroidElement search_btn() {
		return driver.findElementById("h.jpc.vhome:id/button");
	}
	private AndroidElement city_item() {
		return driver.findElementById("h.jpc.vhome:id/city");
	}
	private AndroidElement weather_lv() {
		return driver.findElementById("h.jpc.vhome:id/lv_weather");//判断他 的个数是不是7，下拉捕捉更新完成的框，上拉捕捉只能显示7天的toast框，不知道是不是这个lv
	}
	
	
	
	public void searchCity(String city){
		action.type(search_et(), city);
		action.click(search_btn());
	}
	public void returnMainPage() {
		action.returnLastPage();
	}
	public String getCity() {
		return city_item().getText();
	}
	//得到第一天的天气
	public MobileElement getWeekItem() {
	List<MobileElement> items = weather_lv().findElements(By.className("android.widget.LinearLayout"));
	int count = items.size();
	return items.get(0);
	}
	//得到整个列表的大小，看是不是7个
	public int getWeatherCount() {
	List<MobileElement> items = weather_lv().findElements(By.className("android.widget.LinearLayout"));
	int count = items.size();
	return count;
	}
	//点击一天查看详细的天气情况
	public boolean clickWeekItem() {
	List<MobileElement> items = weather_lv().findElements(By.className("android.widget.LinearLayout"));	
	return items.get(0).isEnabled();
	}
	
	
	//下拉刷新
	public String refreshPage() {
		PointOption pOption=new PointOption();
		action.swip(pOption.point(800,800), pOption.point(800,1500));
		return action.getToast();
	}
	//上滑加载更多
	public String getMore() {
		PointOption pOption=new PointOption();
		action.swip(pOption.point(800,1500), pOption.point(800,100));
		return action.getToast();
	}
	
	


}
