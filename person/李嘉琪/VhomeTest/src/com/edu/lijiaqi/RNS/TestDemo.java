package com.edu.lijiaqi.RNS;

import org.testng.annotations.Test;

import com.edu.base.BaseTest;

public class TestDemo extends BaseTest{
	@Test
	public void test1() {
		driver.findElementByXPath("//*[@text='ÉçÇø']").click();
	}

}
