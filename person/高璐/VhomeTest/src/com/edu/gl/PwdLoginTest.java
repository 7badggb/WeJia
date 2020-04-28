package com.edu.gl;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.edu.base.BaseTest;

public class PwdLoginTest extends BaseTest{

	@Test(description="成功登录")
	public void loginSuccess() {
		PwdLoginPage loginPage = new PwdLoginPage(driver);
		loginPage.loginSuccess("15176906306","123456");
		Assert.assertEquals(this.driver.currentActivity(),"h.jpc.vhome.chat.activity.WelcomeActivity");
	}

	@Test(description="手机号输入错误")
	public void loginFail1() {
		PwdLoginPage loginPage = new PwdLoginPage(driver);
		String actResult=loginPage.loginFail("1517690630","123456");
		Assert.assertEquals(actResult,"用户名或密码错误");
	}
	
	@Test(description="密码输入错误")
	public void loginFail2() {
		PwdLoginPage loginPage = new PwdLoginPage(driver);
		String actResult=loginPage.loginFail("15176906306","123458");
		Assert.assertEquals(actResult,"用户名或密码错误");
	}
}
