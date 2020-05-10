package edu.hml;

import org.testng.annotations.Test;

import edu.base.BaseAction;
import edu.base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AddRoleTest extends BaseTest{
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public AddRoleTest(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
		this.action = new BaseAction(driver);
	}
	private AndroidElement user(){//点击用户
		return driver.findElementByXPath("//*[@href='/xxb/index.php?m=user&f=admin']");
	}
	private AndroidElement role(){//点击角色
		return driver.findElementByXPath("//*[@href='/xxb/index.php?m=setting&f=lang&module=user&field=roleList']");
	}
	private AndroidElement add(){//点击加号
		return driver.findElementByXPath("//table/tbody/tr/td[3]/a[@class='btn btn-mini add']");
	}
	private AndroidElement input_name(){//输入变量名
		return driver.findElementByXPath("//*[@placeholder='变量名']");
	}
	private AndroidElement input_value(){//自定义显示值
		return driver.findElementByXPath("//*[@placeholder='自定义显示值']");
	}
	private AndroidElement save(){//点击保存
		return driver.findElementById("submit");
	}
	@Test(description="添加角色")
	public void test(){
		action.click(user());
		action.click(role());
		action.click(add());
		action.type(input_name(),"chengxuyuan");
		action.type(input_value(),"程序员");
		action.click(save());
	}

}
