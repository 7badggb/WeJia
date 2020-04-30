package edu.hml;

import org.testng.annotations.Test;

import edu.base.BaseAction;
import edu.base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AddPermissionTest extends BaseTest{
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public AddPermissionTest(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
		this.action = new BaseAction(driver);
	}
	private AndroidElement btn_permission(){//�����������Ȩ�ް�ť
		return driver.findElementByXPath("//*[@href='/xxb/index.php?m=group&f=browse']");
	}
	private AndroidElement permission_add(){//�����������
		return driver.findElementByXPath("//*[@data-toggle='modal']");
	}
	private AndroidElement permission_name(){//��д��������
		return driver.findElementById("name");
	}
	private AndroidElement save(){//�������
		return driver.findElementById("submit");
	}
	@Test(description="����Ȩ�޷���")
	public void test(){
		action.click(btn_permission());
		action.click(permission_add());
		action.type(permission_name(),"����Ա");
		action.click(save());
	}
	
}
