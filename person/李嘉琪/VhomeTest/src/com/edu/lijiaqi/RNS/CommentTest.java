package com.edu.lijiaqi.RNS;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.edu.base.BaseTest;
import com.edu.dataprovider.ExcelDataProvider;

public class CommentTest extends BaseTest{

	@DataProvider(name="data1")
	public static Object [][] data() throws IOException{
		ExcelDataProvider dataProvider = new ExcelDataProvider();
		return dataProvider.getTestDataByExcel("D:\\cishi\\data1.xlsx", "Sheet1");
	}
	
	@Test(description="∆¿¬€",dataProvider="data1")
	public void comtTest(String a1) {
		CommentPage commentPage = new CommentPage(driver);
		commentPage.comt(a1);
		assertEquals(commentPage.getComt(), "’‚1a£ø");
	}
}
