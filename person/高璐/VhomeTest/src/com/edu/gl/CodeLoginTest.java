package com.edu.gl;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.edu.base.BaseTest;

public class CodeLoginTest extends BaseTest{

	@Test(description="�ɹ���¼")
	public void loginSuccess() throws InterruptedException {
		CodeLoginPage loginPage = new CodeLoginPage(driver);
		loginPage.loginSuccess("15176906306","");
		Assert.assertEquals(this.driver.currentActivity(),"h.jpc.vhome.chat.activity.WelcomeActivity");
	}
	
	@Test(description="δ�����ֻ���")
	public void loginFail1() throws InterruptedException {
		CodeLoginPage loginPage = new CodeLoginPage(driver);
		String actResult=loginPage.loginFail("","");
		Assert.assertEquals(actResult,"�������ֻ���");
	}
	
	@Test(description="δ������֤��")
	public void loginFail2() throws InterruptedException {
		CodeLoginPage loginPage = new CodeLoginPage(driver);
		String actResult=loginPage.loginFail("15176906306","");
		Assert.assertEquals(actResult,"��������֤��");
	}

	@Test(description="�ֻ����������")
	public void loginFail3() throws InterruptedException {
		CodeLoginPage loginPage = new CodeLoginPage(driver);
		String actResult=loginPage.loginFail("1517690630","");
		Assert.assertEquals(actResult,"�ֻ�����������");
	}
	
	@Test(description="��֤���������")
	public void loginFail4() throws InterruptedException {
		CodeLoginPage loginPage = new CodeLoginPage(driver);
		String actResult=loginPage.loginFail("15176906306","0416");
		Assert.assertEquals(actResult,"��֤�����");
	}
}
