package com.edu.gl;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.edu.base.BaseTest;

public class PwdLoginTest extends BaseTest{

	@Test(description="�ɹ���¼")
	public void loginSuccess() {
		PwdLoginPage loginPage = new PwdLoginPage(driver);
		loginPage.loginSuccess("15176906306","123456");
		Assert.assertEquals(this.driver.currentActivity(),"h.jpc.vhome.chat.activity.WelcomeActivity");
	}

	@Test(description="�ֻ����������")
	public void loginFail1() {
		PwdLoginPage loginPage = new PwdLoginPage(driver);
		String actResult=loginPage.loginFail("1517690630","123456");
		Assert.assertEquals(actResult,"�û������������");
	}
	
	@Test(description="�����������")
	public void loginFail2() {
		PwdLoginPage loginPage = new PwdLoginPage(driver);
		String actResult=loginPage.loginFail("15176906306","123458");
		Assert.assertEquals(actResult,"�û������������");
	}
}
