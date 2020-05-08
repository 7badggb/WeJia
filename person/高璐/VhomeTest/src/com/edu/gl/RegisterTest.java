package com.edu.gl;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.edu.base.BaseTest;

public class RegisterTest extends BaseTest{

	@Test(description="�ɹ�ע��")
	public void registerSuccess() {
		RegisterPage registerPage = new RegisterPage(driver);
		registerPage.registerSuccess("zyl","15176906306","0416","123456");
		Assert.assertEquals(this.driver.currentActivity(),"h.jpc.vhome.chat.activity.WelcomeActivity");
	}
	
	@Test(description="δ�����ǳ�")
	public void registerFail1() {
		RegisterPage registerPage = new RegisterPage(driver);
		String actResult=registerPage.registerFail("","15176906306","0416","123456");
		Assert.assertEquals(actResult,"��������ȷ�ǳ�");
	}
	
	@Test(description="�ǳ����벻���Ϲ淶")
	public void registerFail2() {
		RegisterPage registerPage = new RegisterPage(driver);
		String actResult=registerPage.registerFail("zyloooong,,,...","15176906306","0416","123456");
		Assert.assertEquals(actResult,"��������ȷ�ǳ�");
	}
	
	@Test(description="δ�����ֻ���")
	public void registerFail3() {
		RegisterPage registerPage = new RegisterPage(driver);
		String actResult=registerPage.registerFail("zyl","","0416","123456");
		Assert.assertEquals(actResult,"�ֻ�����������");
	}
	
	@Test(description="�ֻ����������")
	public void registerFail4() {
		RegisterPage registerPage = new RegisterPage(driver);
		String actResult=registerPage.registerFail("zyl","1517690630","0416","123456");
		Assert.assertEquals(actResult,"�ֻ�����������");
	}
	
	@Test(description="δ������֤��")
	public void registerFail5() {
		RegisterPage registerPage = new RegisterPage(driver);
		String actResult=registerPage.registerFail("zyl","15176906306","","123456");
		Assert.assertEquals(actResult,"δ������֤��");
	}
	
	@Test(description="��֤���������")
	public void registerFail6() {
		RegisterPage registerPage = new RegisterPage(driver);
		String actResult=registerPage.registerFail("zyl","15176906306","19880416","123");
		Assert.assertEquals(actResult,"��֤���������");
	}
	
	@Test(description="δ��������")
	public void registerFail7() {
		RegisterPage registerPage = new RegisterPage(driver);
		String actResult=registerPage.registerFail("zyl","15176906306","0416","");
		Assert.assertEquals(actResult,"����������λ");
	}
	
	@Test(description="�������벻���Ϲ淶")
	public void registerFail8() {
		RegisterPage registerPage = new RegisterPage(driver);
		String actResult=registerPage.registerFail("zyl","15176906306","0416","123");
		Assert.assertEquals(actResult,"����������λ");
	}
	

}
