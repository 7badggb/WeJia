package edu.hml;

import org.testng.annotations.Test;

import edu.base.BaseAction;
import edu.base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AddUserTest extends BaseTest{
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public AddUserTest(AndroidDriver<AndroidElement> driver){
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
	private AndroidElement user(){//点击导航栏用户按钮
		return driver.findElementByXPath("//*[@href='/xxb/index.php?m=user&f=admin']");
	}
	private AndroidElement add_user(){//点击添加成员
		return driver.findElementByXPath("//*[@href='/xxb/index.php?m=user&f=create']");
	}
	private AndroidElement input_username(){//输入用户名
		return driver.findElementByXPath("//*[@name='account']");
	}
	private AndroidElement input_realname(){//输入真实姓名
		return driver.findElementByXPath("//*[@name=realname]");
	}
	private AndroidElement sex(){//选择性别男
		return driver.findElementById("genderm");
	}
	private AndroidElement role(){//选择角色人事
		return driver.findElementByXPath("//*[@data-keys='renshi rs']");
	}
	private AndroidElement password1(){//输入密码
		return driver.findElementByXPath("//*[@name='password1']");
	}
	private AndroidElement password2(){//重复密码
		return driver.findElementByXPath("//*[@name='password2']");
	}
	private AndroidElement email(){//邮箱
		return driver.findElementByXPath("//*[@name='email']");
	}
	private AndroidElement save(){//点击保存
		return driver.findElementById("submit");
	}
	@Test(description="添加成员-用户名，邮箱错误")
	public void test1(){
		action.click(user());
		action.click(add_user());
		action.type(input_username(),"张三");
		action.type(input_realname(),"李四");
		action.click(sex());
		action.click(role());
		action.type(password1(),"111111");
		action.type(password2(),"111111");
		action.type(email(),"222");
		action.click(save());
	}
	@Test(description="添加成员")
	public void test2(){
		action.click(user());
		action.click(add_user());
		action.type(input_username(),"zhangsan");
		action.type(input_realname(),"李四");
		action.click(sex());
		action.click(role());
		action.type(password1(),"111111");
		action.type(password2(),"111111");
		action.type(email(),"222@163.com");
		action.click(save());
	}

}
