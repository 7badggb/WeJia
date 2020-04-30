package edu.hml;

import org.testng.annotations.Test;

import edu.base.BaseAction;
import edu.base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class PermissionEditTest extends BaseTest{
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public PermissionEditTest(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
		this.action = new BaseAction(driver);
	}
	private AndroidElement btn_permission_nav(){//点击导航栏中权限按钮
		return driver.findElementByXPath("//*[@href='/xxb/index.php?m=group&f=browse']");
	}
	private AndroidElement permission(){//点击管理员分组后的权限按钮
		return driver.findElementByXPath("//*[@href='/xxb/index.php?m=group&f=managePriv&type=byGroup&param=1']");
	}
	private AndroidElement checkbox(){//勾选权限分组后的复选框
		return driver.findElementByXPath("//tbody/tr[3][@class='checkModule']");
	}
	private AndroidElement save(){//点击保存
		return driver.findElementById("submit");
	}
	@Test(description="设置分组的权限")
	public void test(){
		action.click(btn_permission_nav());
		action.click(permission());
		action.click(checkbox());
		action.click(save());
	}

}
