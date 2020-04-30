package edu.hml;

import org.testng.annotations.Test;

import edu.base.BaseAction;
import edu.base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LoginTest extends BaseTest{
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public LoginTest(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
		this.action = new BaseAction(driver);
	}
	private AndroidElement username(){//ÓÃ»§Ãû
		return driver.findElementById("account");
	}
	private AndroidElement password(){//ÃÜÂë
		return driver.findElementById("password");
	}
	private AndroidElement login(){//µã»÷µÇÂ¼
		return driver.findElementById("submit");
	}
	@Test(description="µÇÂ¼")
	public void test1(){
		action.type(username(),"admin");
		action.type(password(),"123456");
		action.click(login());
	}
	@Test(description="µÇÂ¼-ÓÃ»§Ãû´íÎó")
	public void test2(){
		action.type(username(),"admi");
		action.type(password(),"123456");
		action.click(login());
	}
	@Test(description="µÇÂ¼-ÃÜÂë´íÎó")
	public void test3(){
		action.type(username(),"admin");
		action.type(password(),"1234");
		action.click(login());
	}

}
