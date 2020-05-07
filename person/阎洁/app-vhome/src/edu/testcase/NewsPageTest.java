package edu.testcase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import edu.base.BaseTest;
import edu.page.LoginPage;
import edu.page.MainPage;
import edu.page.MyPage;
import edu.page.NewsPage;
import edu.page.WeatherPage;
import edu.page.WelcomePage;

public class NewsPageTest extends BaseTest {
	WelcomePage welcomePage;
	LoginPage loginpage;
	MainPage mainPage;
	NewsPage np;
	MyPage mypage;
	@BeforeClass
	public void enterNewsPage() {
		WelcomePage welcomePage=new WelcomePage(driver);
		loginpage=welcomePage.switchToLogin();
		mainPage=loginpage.login("15513155225", "qqq123");
		np=mainPage.enterNews();		
	}
	
	@Test(description="点击一条新闻")
	public void testclickNews() {
		assertTrue(np.clickNews());	
	}
	@Test(description="新闻的数量是不是8")
	public void testNewsCount() {
		assertEquals(np.getNewsCount(),8);
	}
	
	@AfterClass
	public void logout() {
		mypage=mainPage.enterMine();
		mypage.logout();
		
	}

}
