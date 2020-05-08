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
	private AndroidElement user(){//����������û���ť
		return driver.findElementByXPath("//*[@href='/xxb/index.php?m=user&f=admin']");
	}
	private AndroidElement search_box(){//������
		return driver.findElementById("search");
	}
	private AndroidElement search(){//�������
		return driver.findElementById("submit");
	}
	@Test(description="������¼�д��ڵ��û�")
	public void test1(){
		action.click(user());
		action.type(search_box(),"zhangsan");
		action.click(search());
	}
	@Test(description="������¼�в����ڵ��û�")
	public void test2(){
		action.click(user());
		action.type(search_box(),"�ܽ���");
		action.click(search());
	}

}

