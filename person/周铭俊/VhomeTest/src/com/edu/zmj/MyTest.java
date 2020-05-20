package com.edu.zmj;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.edu.base.BaseTest;

public class MyTest extends BaseTest{

	@Test(description="成功查看我的关注")
	public void mySuccess1() throws InterruptedException {
		MyPage myPage = new MyPage(driver);
		myPage.gz();
		Assert.assertEquals(this.driver.currentActivity(),"h.jpc.vhome.parents.fragment.myself.MyAttentionsActivity");
	}
	
	@Test(description="成功查看我的粉丝")
	public void mySuccess2() throws InterruptedException {
		MyPage myPage = new MyPage(driver);
		myPage.fs();
		Assert.assertEquals(this.driver.currentActivity(),"h.jpc.vhome.parents.fragment.myself.MyFunsActivity");
	}
	
	@Test(description="成功查看我的消息")
	public void mySuccess3() throws InterruptedException {
		MyPage myPage = new MyPage(driver);
		myPage.xx();
		Assert.assertEquals(this.driver.currentActivity(),"h.jpc.vhome.parents.fragment.myself.MyNewsActivity");
	}

	@Test(description="成功查看我的帖子")
	public void mySuccess4() throws InterruptedException {
		MyPage myPage = new MyPage(driver);
		myPage.tz();
		Assert.assertEquals(this.driver.currentActivity(),"h.jpc.vhome.parents.fragment.myself.MyPostActivity");
	}
	
	@Test(description="成功查看我的关联")
	public void mySuccess5() throws InterruptedException {
		MyPage myPage = new MyPage(driver);
		myPage.gl();
		Assert.assertEquals(this.driver.currentActivity(),"h.jpc.vhome.chat.activity.ContactsActivity");
	}
	@Test(description="成功查看我的收藏")
	public void mySuccess6() throws InterruptedException {
		MyPage myPage = new MyPage(driver);
		myPage.sc();
		Assert.assertEquals(this.driver.currentActivity(),"h.jpc.vhome.parents.fragment.myself.MyCollectionsActivity");
	}
	@Test(description="成功查看关于微家")
	public void mySuccess7() throws InterruptedException {
		MyPage myPage = new MyPage(driver);
		myPage.gy();
		Assert.assertEquals(this.driver.currentActivity(),"h.jpc.vhome.parents.fragment.myself.AboutVhomeActivity");
	}
}
