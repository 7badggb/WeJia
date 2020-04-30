package edu.hml;

import org.testng.annotations.Test;

import edu.base.BaseAction;
import edu.base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class PermissionEditTest extends BaseTest{
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public PermissionEditTest(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
		this.action = new BaseAction(driver);
	}
	private AndroidElement btn_permission_nav(){//�����������Ȩ�ް�ť
		return driver.findElementByXPath("//*[@href='/xxb/index.php?m=group&f=browse']");
	}
	private AndroidElement permission(){//�������Ա������Ȩ�ް�ť
		return driver.findElementByXPath("//*[@href='/xxb/index.php?m=group&f=managePriv&type=byGroup&param=1']");
	}
	private AndroidElement checkbox(){//��ѡȨ�޷����ĸ�ѡ��
		return driver.findElementByXPath("//tbody/tr[3][@class='checkModule']");
	}
	private AndroidElement save(){//�������
		return driver.findElementById("submit");
	}
	@Test(description="���÷����Ȩ��")
	public void test(){
		action.click(btn_permission_nav());
		action.click(permission());
		action.click(checkbox());
		action.click(save());
	}

}
