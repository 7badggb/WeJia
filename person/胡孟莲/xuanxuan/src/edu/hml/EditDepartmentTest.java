package edu.hml;

import org.testng.annotations.Test;

import edu.base.BaseAction;
import edu.base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class EditDepartmentTest extends BaseTest{
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public EditDepartmentTest(AndroidDriver<AndroidElement> driver){
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
	private AndroidElement user(){//点击导航栏用户按钮
		return driver.findElementByXPath("//*[@href='/xxb/index.php?m=user&f=admin']");
	}
	private AndroidElement weihu_department(){//点击维护部门按钮
		return driver.findElementByXPath("//*[@href='/xxb/index.php?m=tree&f=browser&type=dept']");
	}
	private AndroidElement edit_department(){//点击开发部门后面的编辑部门按钮
		return driver.findElementByXPath("//div/div/div/div/div/div[2]/div/ul/li/a[@href='/xxb/index.php?m=tree&f=edit&category=6']");
	}
	private AndroidElement higher_department(){//上级部门
		return driver.findElementByXPath("//*[@title id='parent_chosen']");
	}
	private AndroidElement higher_department2(){//上级部门
		//return driver.findElementByXPath("//*[@title data-option-array-index='2']");
		return driver.findElementByXPath("//*[@text='管理']");
	}
	private AndroidElement manager(){//部门经理
		return driver.findElementByXPath("//*[@title id='moderators_chosen']");
	}
	private AndroidElement manager_name(){//部门经理名字
		return driver.findElementByXPath("//*[@text='李四']");
	}
	private AndroidElement save(){//点击保存
		return driver.findElementById("submit");
	}
	private AndroidElement delete(){//点击销售后的删除按钮
		return driver.findElementByXPath("//div/div/div/div/div/div[2]/div/ul/li[2]/a[@href='/xxb/index.php?m=tree&f=delete&category=7']");
	}
	private AndroidElement ok(){//点击确定
		return driver.findElementByXPath("//*[@text='确定']");
	}
	@Test(description="编辑开发部门")
	public void test_edit(){
		action.click(user());
		action.click(weihu_department());
		action.click(edit_department());
		action.click(higher_department());
		action.click(higher_department2());
		action.click(manager());
		action.click(manager_name());
		action.click(save());
	}
	@Test(description="删除销售部门")
	public void test_delete(){
		action.click(user());
		action.click(weihu_department());
		action.click(delete());
		action.click(ok());
	}

}