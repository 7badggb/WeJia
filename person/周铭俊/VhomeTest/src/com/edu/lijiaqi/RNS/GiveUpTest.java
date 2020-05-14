package com.edu.lijiaqi.RNS;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.edu.base.BaseTest;

public class GiveUpTest extends BaseTest{
	
	@Test(description="点赞",priority=1)
	public void giveOnTest() {
		GiveUpPage giveUpPage = new GiveUpPage(driver);
		giveUpPage.giveOn();
	}
	@Test(description="取消点赞",priority=2)
	public void giveOffTest() {
		GiveUpPage giveUpPage = new GiveUpPage(driver);
		giveUpPage.giveOff();
	}
	@Test(description="关注",priority=3)
	public void followOnTest() {
		GiveUpPage giveUpPage = new GiveUpPage(driver);
		giveUpPage.followOn();
		assertEquals(giveUpPage.getNews(), "取消关注");
	}
	@Test(description="取消关注",priority=4)
	public void followOffTest() {
		GiveUpPage giveUpPage = new GiveUpPage(driver);
		giveUpPage.followOn();
		assertEquals(giveUpPage.getNews(), "+关注");
	}
	@Test(description="进入空间",priority=5)
	public void enterTest() {
		GiveUpPage giveUpPage = new GiveUpPage(driver);
		giveUpPage.enter();
	}
}
