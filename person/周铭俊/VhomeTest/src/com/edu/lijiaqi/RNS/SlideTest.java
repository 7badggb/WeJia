package com.edu.lijiaqi.RNS;


import org.testng.annotations.Test;

import com.edu.base.BaseTest;

public class SlideTest extends BaseTest{

	@Test(description="�»�ˢ��",priority=1)
	public void refreshTest() {
		SlidePage slidePage = new SlidePage(driver);
		slidePage.refreshTest();
	}
	@Test(description="�ϻ��鿴����",priority=2)
	public void downTest() {
		SlidePage slidePage = new SlidePage(driver);
		slidePage.downTest();
	}
}
