package edu.testcase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import edu.base.BaseTest;
import edu.page.BroadcastPage;
import edu.page.CommunityPage;
import edu.page.DouyinPage;
import edu.page.LoginPage;
import edu.page.MainPage;
import edu.page.MyPage;
import edu.page.WelcomePage;

public class DouyinPageTest extends BaseTest {
	WelcomePage welcomePage;
	LoginPage loginpage;
	MainPage mainPage;
	CommunityPage cPage;
	BroadcastPage bPage;
	DouyinPage dPage;
	MyPage mypage;
	@BeforeClass
	public void enterDouyinPage() {
		WelcomePage welcomePage=new WelcomePage(driver);
		loginpage=welcomePage.switchToLogin();
		mainPage=loginpage.login("15513155225", "qqq123");
		cPage=mainPage.enterCommunity()	;
		bPage=cPage.enterBroadcastPage();
		dPage=bPage.enterDouyinPage();
	}
	
	@Test(description="测试音乐的数量是不是5")
	public void test1MusicCount() {
		assertEquals(dPage.getMusicCount(),5);
	}
	@Test(description="测试能否点击其他的歌")
	public void test2ClickMusic() {
		assertEquals(dPage.clickMusic(), true);
	}
	@Test(description="测试音乐的进度条是否可以滑动")
	public void test3ScrollBar() {
		dPage.enterMusic();
		assertTrue(dPage.scrollBar());
	}
	@Test(description="测试是否可以点击左键播放上一首")
	public void test4LeftBtn() {
		dPage.enterMusic();
		assertTrue(dPage.clickLeftBtn());	
	}
	@Test(description="测试是否可以点击左键播放上一首")
	public void test5StopBtn() {
		dPage.enterMusic();
		assertTrue(dPage.clickStopBtn());	
	}
	@Test(description="测试是否可以点击右键播放上一首")
	public void test6RightBtn() {
		dPage.enterMusic();
		assertTrue(dPage.clickRightBtn());	
	}
	@Test(description="测试是否可以返回broadcastPage")
	public void test7returnLastPage() {
		dPage.returnBroadcastPage();
	}
	
	@AfterClass
	public void logout() {
		mypage=bPage.enterMine();
		mypage.logout();
		
	}


}
