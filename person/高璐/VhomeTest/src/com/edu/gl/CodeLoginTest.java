package com.edu.gl;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.edu.base.BaseTest;

public class CodeLoginTest extends BaseTest{

	@Test(description="成功登录")
	public void loginSuccess() throws InterruptedException {
		CodeLoginPage loginPage = new CodeLoginPage(driver);
		loginPage.loginSuccess("15176906306","");
		Assert.assertEquals(this.driver.currentActivity(),"h.jpc.vhome.chat.activity.WelcomeActivity");
	}
	
	@Test(description="未输入手机号")
	public void loginFail1() throws InterruptedException {
		CodeLoginPage loginPage = new CodeLoginPage(driver);
		String actResult=loginPage.loginFail("","");
		Assert.assertEquals(actResult,"请输入手机号");
	}
	
	@Test(description="未输入验证码")
	public void loginFail2() throws InterruptedException {
		CodeLoginPage loginPage = new CodeLoginPage(driver);
		String actResult=loginPage.loginFail("15176906306","");
		Assert.assertEquals(actResult,"请输入验证码");
	}

	@Test(description="手机号输入错误")
	public void loginFail3() throws InterruptedException {
		CodeLoginPage loginPage = new CodeLoginPage(driver);
		String actResult=loginPage.loginFail("1517690630","");
		Assert.assertEquals(actResult,"手机号输入有误");
	}
	
	@Test(description="验证码输入错误")
	public void loginFail4() throws InterruptedException {
		CodeLoginPage loginPage = new CodeLoginPage(driver);
		String actResult=loginPage.loginFail("15176906306","0416");
		Assert.assertEquals(actResult,"验证码错误");
	}
}
