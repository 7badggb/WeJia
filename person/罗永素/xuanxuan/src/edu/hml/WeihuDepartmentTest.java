package edu.hml;

import org.testng.annotations.Test;

import edu.base.BaseAction;
import edu.base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class WeihuDepartmentTest extends BaseTest{
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public WeihuDepartmentTest(AndroidDriver<AndroidElement> driver){
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
	private AndroidElement user(){//����������û���ť
		return driver.findElementByXPath("//*[@href='/xxb/index.php?m=user&f=admin']");
	}
	private AndroidElement weihu_department(){//���ά�����Ű�ť
		return driver.findElementByXPath("//*[@href='/xxb/index.php?m=tree&f=browser&type=dept']");
	}
	private AndroidElement add_department_1(){//��Ӳ��Žṹ
		return driver.findElementByXPath("//input[@name='children[1]']");
	}
	private AndroidElement add_department_2(){//��Ӳ��Žṹ
		return driver.findElementByXPath("//input[@name='children[2]']");
	}
	private AndroidElement add_department_3(){//��Ӳ��Žṹ
		return driver.findElementByXPath("//input[@name='children[3]']");
	}
	private AndroidElement save(){//�������
		return driver.findElementById("submit");
	}
	@Test(description="ά������-��Ӳ���")
	public void test(){
		action.click(user());
		action.click(weihu_department());
		action.type(add_department_1(),"����");
		action.type(add_department_2(),"����");
		action.type(add_department_3(),"����");
		action.click(save());
	}

}
