package edu.hml;

import org.testng.annotations.Test;

import edu.base.BaseAction;
import edu.base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UserEditTest extends BaseTest{
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public UserEditTest(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
		this.action = new BaseAction(driver);
	}
	private AndroidElement admin(){//点击admin
		return driver.findElementByXPath("//*[@data-id='profile']");
	}
	private AndroidElement info_edit(){//点击编辑信息
		return driver.findElementByXPath("//*[@class='btn btn-primary loadInModal']");
	}
	private AndroidElement email(){//填写邮箱
		return driver.findElementByXPath("//*[@name='email']");
	}
	private AndroidElement save(){//点击保存
		return driver.findElementById("submit");
	}
	private AndroidElement user(){//点击导航栏中用户按钮
		return driver.findElementByXPath("//*[@href='/xxb/index.php?m=user&f=admin']");
	}
	private AndroidElement edit(){//点击用户名为admin的记录右侧操作栏中的编辑按钮
		return driver.findElementByXPath("//*[@href='/xxb/index.php?m=user&f=edit&account=admin&from=admin']");
	}
	private AndroidElement tel(){//手机
		return driver.findElementById("mobile");
	}
	@Test(description="编辑用户信息-正确格式邮箱")
	public void test1(){
		action.click(admin());
		action.click(info_edit());
		action.type(email(),"111@163.com");
		action.click(save());
	}
	@Test(description="编辑用户信息-错误格式邮箱")
	public void test2(){
		action.click(admin());
		action.click(info_edit());
		action.type(email(),"111");
		action.click(save());
	}
	@Test(description="编辑用户信息-正确格式手机号")
	public void test3(){
		action.click(user());
		action.click(edit());
		action.type(tel(),"11111111111");
		action.click(save());
	}
	@Test(description="编辑用户信息-错误格式手机号")
	public void test4(){
		action.click(user());
		action.click(edit());
		action.type(tel(),"11111");
		action.click(save());
	}

}
