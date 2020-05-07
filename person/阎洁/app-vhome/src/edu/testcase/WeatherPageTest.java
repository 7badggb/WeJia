package edu.testcase;


import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import edu.base.BaseTest;
import edu.page.LoginPage;
import edu.page.MainPage;
import edu.page.MyPage;
import edu.page.WeatherPage;
import edu.page.WelcomePage;

public class WeatherPageTest extends BaseTest {
	WelcomePage welcomePage;
	LoginPage loginpage;
	MainPage mainPage;
	WeatherPage wp;
	MyPage mypage;
	

	@BeforeClass
	public void enterWeatherPage() {
		WelcomePage welcomePage=new WelcomePage(driver);
		loginpage=welcomePage.switchToLogin();
		mainPage=loginpage.login("15513155225", "qqq123");
		wp=mainPage.enterWeather();		
	}
	@Test(description="测试中国城市")
	public void testSearchCity1(){
		wp.searchCity("唐山");	
		assertEquals(wp.getCity().equals("唐山"),true);
	}
	@Test(description="测试外国城市")
	public void testSearchCity2(){
		wp.searchCity("London");
		assertEquals(wp.getCity().equals("London"),true);
	}
	@Test(description="测试空值")
	public void testSearchCity3(){
		wp.searchCity("");	
	}
	@Test(description="测试非法字符")
	public void testSearchCity4(){
		wp.searchCity("@#?");	
	}
	@Test(description="测试输入超出最大长度的字符")
	public void testSearchCity5(){
		wp.searchCity("11111111111111111111111111111111111111111");	
	}
	@Test(description="测试输入脚本")
	public void testSearchCity6(){
		wp.searchCity("<script>aler('abc')</script>");	
	}
	@Test(description="测试是否显示7天的数据")
	public void testGetWeatherCount() {
		assertEquals(wp.getWeatherCount(), 7);
	}
	@Test(description="测试上滑加载更多数据")
	public void testGetMore(){	
		assertEquals(wp.getMore().equals("最多显示最近7天天气数据"),true);
	}
	@Test(description="测试下拉刷新")
	public void testRefreshPage(){	
		assertEquals(wp.refreshPage().equals("刷新完成"),true);	
	}
	@Test(description="测试能否查看一天的详细天气情况")
	public void testClickWeekItem() {
		assertEquals(wp.clickWeekItem(), true);
	}
	@Test(description="测试能否返回主界面")
	public void testClickReturnLastPage() {
		wp.returnMainPage();
		
	}	
	@AfterClass
	public void logout() {
		mypage=mainPage.enterMine();
		mypage.logout();
		
	}

}
