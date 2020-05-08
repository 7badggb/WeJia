package edu.hml;

import org.testng.annotations.Test;

import edu.base.BaseAction;
import edu.base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AddAppTest extends BaseTest{
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public AddAppTest(AndroidDriver<AndroidElement> driver){
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
	private AndroidElement app(){//点击导航栏应用按钮
		return driver.findElementByXPath("//*[@href='/xxb/index.php?m=entry&f=admin']");
	}
	private AndroidElement add_app(){//点击添加应用按钮
		return driver.findElementByXPath("//*[@href='/xxb/index.php?m=entry&f=create']");
	}
	private AndroidElement name(){//名称
		return driver.findElementById("name");
	}
	private AndroidElement code(){//代号
		return driver.findElementById("code");
	}
	private AndroidElement save(){//点击保存
		return driver.findElementById("submit");
	}
	@Test(description="添加应用-代号格式正确")
	public void test1(){
		action.click(app());
		action.click(add_app());
		action.type(name(),"读书");
		action.type(code(),"dushu");
		action.click(save());
	}
	@Test(description="添加应用-代号格式错误")
	public void test2(){
		action.click(app());
		action.click(add_app());
		action.type(name(),"读书");
		action.type(code(),"读书");
		action.click(save());
	}

}