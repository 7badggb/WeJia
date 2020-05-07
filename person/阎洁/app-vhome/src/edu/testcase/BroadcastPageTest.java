package edu.testcase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import edu.base.BaseTest;
import edu.page.BroadcastPage;
import edu.page.CommunityPage;
import edu.page.LoginPage;
import edu.page.MainPage;
import edu.page.MyPage;
import edu.page.NewsPage;
import edu.page.WelcomePage;

public class BroadcastPageTest extends BaseTest {
	WelcomePage welcomePage;
	LoginPage loginpage;
	MainPage mainPage;
	CommunityPage cPage;
	BroadcastPage bPage;
	MyPage mypage;
	@BeforeClass
	public void enterBroadcastPage() {
		WelcomePage welcomePage=new WelcomePage(driver);
		loginpage=welcomePage.switchToLogin();
		mainPage=loginpage.login("15513155225", "qqq123");
		cPage=mainPage.enterCommunity()	;
		bPage=cPage.enterBroadcastPage();
	}
	
	@Test(description="点击一条音乐")
	public void testclickMusic() {
		assertTrue(bPage.clickMusic());	
	}
	@Test(description="音乐的数量是不是7")
	public void testNewsCount() {
		assertEquals(bPage.getMusicCount(),7);
	}
	
	@AfterClass
	public void logout() {
		mypage=bPage.enterMine();
		mypage.logout();
		
	}


}
