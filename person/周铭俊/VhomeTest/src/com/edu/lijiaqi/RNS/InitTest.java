package com.edu.lijiaqi.RNS;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.edu.base.BaseTest;
import com.edu.dataprovider.ExcelDataProvider;

public class InitTest extends BaseTest{
	@DataProvider(name="data5")
	public static Object [][] data() throws IOException{
		ExcelDataProvider dataProvider = new ExcelDataProvider();
		return dataProvider.getTestDataByExcel("D:\\cishi\\data1.xlsx", "Sheet1");
	}
	
	@Test(dataProvider="data5")
	public void HuaDongTest(String a1) throws InterruptedException{
		Thread.sleep(3000);
		InitPage initPage = new InitPage(driver);
		initPage.HuaDong(a1);
	}
}
