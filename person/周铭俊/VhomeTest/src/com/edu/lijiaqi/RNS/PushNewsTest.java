package com.edu.lijiaqi.RNS;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.edu.base.BaseTest;
import com.edu.dataprovider.ExcelDataProvider;

public class PushNewsTest extends BaseTest{
	
	@DataProvider(name="data2")
	public static Object [][] data() throws IOException{
		ExcelDataProvider dataProvider = new ExcelDataProvider();
		return dataProvider.getTestDataByExcel("D:\\cishi\\data1.xlsx", "Sheet2");
	}

	@Test(description="发表动态",priority=1,dataProvider="data2")
	public void pushTest(String a1) {
		PushNewsPage pushNewsPage = new PushNewsPage(driver);
		pushNewsPage.push(a1);
		assertEquals(pushNewsPage.getNews(),a1);
	}
	@Test(description="删除动态",priority=2)
	public void deleteTest() {
		PushNewsPage pushNewsPage = new PushNewsPage(driver);
		pushNewsPage.delete();
	}
	@Test(description="取消发表",priority=3)
	public void cancleTest() {
		PushNewsPage pushNewsPage = new PushNewsPage(driver);
		pushNewsPage.cancle("哈哈哈");
	}
}
