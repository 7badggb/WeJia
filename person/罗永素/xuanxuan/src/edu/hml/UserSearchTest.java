package edu.hml;

import org.testng.annotations.Test;

import edu.base.BaseAction;
import edu.base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UserSearchTest extends BaseTest{
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public UserSearchTest(AndroidDriver<AndroidElement> driver){
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
	private AndroidElement user(){//点击导航栏用户按钮
		return driver.findElementByXPath("//*[@href='/xxb/index.php?m=user&f=admin']");
	}
	private AndroidElement search_box(){//搜索框
		return driver.findElementById("search");
	}
	private AndroidElement search(){//点击搜索
		return driver.findElementById("submit");
	}
	@Test(description="搜索记录中存在的用户")
	public void test1(){
		action.click(user());
		action.type(search_box(),"zhangsan");
		action.click(search());
	}
	@Test(description="搜索记录中不存在的用户")
	public void test2(){
		action.click(user());
		action.type(search_box(),"周杰伦");
		action.click(search());
	}

}

