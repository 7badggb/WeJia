package com.edu.lijiaqi.RNS;

import org.testng.annotations.Test;

import com.edu.base.BaseTest;

public class DeleteTest extends BaseTest{

	@Test(description="ɾ���ظ�")
	public void deleteTest() {
		DeletePage deletePage = new DeletePage(driver);
		deletePage.delete();
	}
}
