package com.edu.zmj;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.edu.base.BaseTest;

public class MainTest extends BaseTest{

	@Test(description="�ɹ��޸��ǳ�")
	public void mainSuccess1() throws InterruptedException {
		MainPage mainPage = new MainPage(driver);
		mainPage.changegxqm("yellow");
		Assert.assertEquals(this.driver.currentActivity(),"yellow");
	}
	
	@Test(description="�ɹ��鿴��ά��")
	public void mainSuccess2() throws InterruptedException {
		MainPage mainPage = new MainPage(driver);
		mainPage.ewm();
		Assert.assertEquals(this.driver.currentActivity(),"h.jpc.vhome.chat.activity.Person2CodeActivity");
	}
	
	@Test(description="�ɹ��޸��Ա�")
	public void mainSuccess3() throws InterruptedException {
		MainPage mainPage = new MainPage(driver);
		mainPage.changesex();
		Assert.assertEquals(this.driver.currentActivity(),"h.jpc.vhome.parents.fragment.myself.MyNewsActivity");
	}

	@Test(description="�ɹ��޸ĸ���ǩ��")
	public void mainSuccess4() throws InterruptedException {
		MainPage mainPage = new MainPage(driver);
		mainPage.changegxqm("123");
		Assert.assertEquals(this.driver.currentActivity(),"123");
	}
}

