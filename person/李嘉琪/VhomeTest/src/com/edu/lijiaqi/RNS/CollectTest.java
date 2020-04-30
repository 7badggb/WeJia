package com.edu.lijiaqi.RNS;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import com.edu.base.BaseTest;

public class CollectTest extends BaseTest {

	@Test(description="取消收藏")
	public void offTest() {
		CollectPage collectPage = new CollectPage(driver);
		collectPage.sc_on();
	}
	@Test(description="点击收藏")
	public void onTest() {
		CollectPage collectPage = new CollectPage(driver);
		collectPage.sc_off();
		assertEquals(collectPage.getCon(), "收藏");
	}
}
