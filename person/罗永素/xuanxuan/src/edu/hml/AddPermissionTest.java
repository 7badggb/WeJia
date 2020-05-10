package edu.hml;

import org.testng.annotations.Test;

import edu.base.BaseAction;
import edu.base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AddPermissionTest extends BaseTest{
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public AddPermissionTest(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
		this.action = new BaseAction(driver);
	}
	private AndroidElement btn_permission(){//点击导航栏中权限按钮
		return driver.findElementByXPath("//*[@href='/xxb/index.php?m=group&f=browse']");
	}
	private AndroidElement permission_add(){//点击新增分组
		return driver.findElementByXPath("//*[@data-toggle='modal']");
	}
	private AndroidElement permission_name(){//填写分组名称
		return driver.findElementById("name");
	}
	private AndroidElement save(){//点击保存
		return driver.findElementById("submit");
	}
	@Test(description="新增权限分组")
	public void test(){
		action.click(btn_permission());
		action.click(permission_add());
		action.type(permission_name(),"管理员");
		action.click(save());
	}
	
}
