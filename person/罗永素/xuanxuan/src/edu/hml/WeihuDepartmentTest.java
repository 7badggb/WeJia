package edu.hml;

import org.testng.annotations.Test;

import edu.base.BaseAction;
import edu.base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class WeihuDepartmentTest extends BaseTest{
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public WeihuDepartmentTest(AndroidDriver<AndroidElement> driver){
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
	private AndroidElement user(){//点击导航栏用户按钮
		return driver.findElementByXPath("//*[@href='/xxb/index.php?m=user&f=admin']");
	}
	private AndroidElement weihu_department(){//点击维护部门按钮
		return driver.findElementByXPath("//*[@href='/xxb/index.php?m=tree&f=browser&type=dept']");
	}
	private AndroidElement add_department_1(){//添加部门结构
		return driver.findElementByXPath("//input[@name='children[1]']");
	}
	private AndroidElement add_department_2(){//添加部门结构
		return driver.findElementByXPath("//input[@name='children[2]']");
	}
	private AndroidElement add_department_3(){//添加部门结构
		return driver.findElementByXPath("//input[@name='children[3]']");
	}
	private AndroidElement save(){//点击保存
		return driver.findElementById("submit");
	}
	@Test(description="维护部门-添加部门")
	public void test(){
		action.click(user());
		action.click(weihu_department());
		action.type(add_department_1(),"开发");
		action.type(add_department_2(),"销售");
		action.type(add_department_3(),"管理");
		action.click(save());
	}

}
