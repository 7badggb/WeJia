package com.edu.gl;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.edu.base.BaseTest;

public class RegisterTest extends BaseTest{

	@Test(description="成功注册")
	public void registerSuccess() {
		RegisterPage registerPage = new RegisterPage(driver);
		registerPage.registerSuccess("zyl","15176906306","0416","123456");
		Assert.assertEquals(this.driver.currentActivity(),"h.jpc.vhome.chat.activity.WelcomeActivity");
	}
	
	@Test(description="未输入昵称")
	public void registerFail1() {
		RegisterPage registerPage = new RegisterPage(driver);
		String actResult=registerPage.registerFail("","15176906306","0416","123456");
		Assert.assertEquals(actResult,"请输入正确昵称");
	}
	
	@Test(description="昵称输入不符合规范")
	public void registerFail2() {
		RegisterPage registerPage = new RegisterPage(driver);
		String actResult=registerPage.registerFail("zyloooong,,,...","15176906306","0416","123456");
		Assert.assertEquals(actResult,"请输入正确昵称");
	}
	
	@Test(description="未输入手机号")
	public void registerFail3() {
		RegisterPage registerPage = new RegisterPage(driver);
		String actResult=registerPage.registerFail("zyl","","0416","123456");
		Assert.assertEquals(actResult,"手机号输入有误");
	}
	
	@Test(description="手机号输入错误")
	public void registerFail4() {
		RegisterPage registerPage = new RegisterPage(driver);
		String actResult=registerPage.registerFail("zyl","1517690630","0416","123456");
		Assert.assertEquals(actResult,"手机号输入有误");
	}
	
	@Test(description="未输入验证码")
	public void registerFail5() {
		RegisterPage registerPage = new RegisterPage(driver);
		String actResult=registerPage.registerFail("zyl","15176906306","","123456");
		Assert.assertEquals(actResult,"未输入验证码");
	}
	
	@Test(description="验证码输入错误")
	public void registerFail6() {
		RegisterPage registerPage = new RegisterPage(driver);
		String actResult=registerPage.registerFail("zyl","15176906306","19880416","123");
		Assert.assertEquals(actResult,"验证码输入错误");
	}
	
	@Test(description="未输入密码")
	public void registerFail7() {
		RegisterPage registerPage = new RegisterPage(driver);
		String actResult=registerPage.registerFail("zyl","15176906306","0416","");
		Assert.assertEquals(actResult,"密码至少四位");
	}
	
	@Test(description="密码输入不符合规范")
	public void registerFail8() {
		RegisterPage registerPage = new RegisterPage(driver);
		String actResult=registerPage.registerFail("zyl","15176906306","0416","123");
		Assert.assertEquals(actResult,"密码至少四位");
	}
	

}
