package edu.utils;

import org.testng.annotations.DataProvider;

public class NSDataProvider {
	@DataProvider(name="txt")
	public  Object[][] getTxtData() throws Exception{
		return new  ExcelDataProvider().getTxtUser("D:\\demo\\city.txt");
	}
	

}
