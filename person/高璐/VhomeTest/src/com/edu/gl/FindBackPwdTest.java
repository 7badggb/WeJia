package com.edu.gl;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.edu.base.BaseTest;

public class FindBackPwdTest extends BaseTest{

	@Test(description="找回密码")
	public void registerSuccess() {
		FindBackPwdPage fbpPage = new FindBackPwdPage(driver);
		fbpPage.fbpSuccess("15176906306","0416");
		Assert.assertEquals(this.driver.currentActivity(),"h.jpc.vhome.chat.activity.WelcomeActivity");
	}
	
	@Test(description="手机号输入错误")
	public void registerFail1() {
		FindBackPwdPage fbpPage = new FindBackPwdPage(driver);
		String actResult=fbpPage.fbpFail("1517690630601","0416");
		Assert.assertEquals(actResult,"请输入正确的手机号");
	}
	
	@Test(description="验证码输入错误")
	public void registerFail2() {
		FindBackPwdPage fbpPage = new FindBackPwdPage(driver);
		String actResult=fbpPage.fbpFail("15176906306","041601");
		Assert.assertEquals(actResult,"请输入正确的验证码");
	}
}
