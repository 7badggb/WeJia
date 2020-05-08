package com.edu.lijiaqi.RNS;


import org.testng.annotations.Test;

import com.edu.base.BaseTest;

public class SlideTest extends BaseTest{

	@Test(description="下滑刷新",priority=1)
	public void refreshTest() {
		SlidePage slidePage = new SlidePage(driver);
		slidePage.refreshTest();
	}
	@Test(description="上滑查看更多",priority=2)
	public void downTest() {
		SlidePage slidePage = new SlidePage(driver);
		slidePage.downTest();
	}
}
