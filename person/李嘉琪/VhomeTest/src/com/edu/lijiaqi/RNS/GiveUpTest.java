package com.edu.lijiaqi.RNS;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.edu.base.BaseTest;

public class GiveUpTest extends BaseTest{
	
	@Test(description="����",priority=1)
	public void giveOnTest() {
		GiveUpPage giveUpPage = new GiveUpPage(driver);
		giveUpPage.giveOn();
	}
	@Test(description="ȡ������",priority=2)
	public void giveOffTest() {
		GiveUpPage giveUpPage = new GiveUpPage(driver);
		giveUpPage.giveOff();
	}
	@Test(description="��ע",priority=3)
	public void followOnTest() {
		GiveUpPage giveUpPage = new GiveUpPage(driver);
		giveUpPage.followOn();
		assertEquals(giveUpPage.getNews(), "ȡ����ע");
	}
	@Test(description="ȡ����ע",priority=4)
	public void followOffTest() {
		GiveUpPage giveUpPage = new GiveUpPage(driver);
		giveUpPage.followOn();
		assertEquals(giveUpPage.getNews(), "+��ע");
	}
	@Test(description="����ռ�",priority=5)
	public void enterTest() {
		GiveUpPage giveUpPage = new GiveUpPage(driver);
		giveUpPage.enter();
	}
}
