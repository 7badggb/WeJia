package edu.hml;

import org.testng.annotations.Test;

import edu.base.BaseAction;
import edu.base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AddAppTest extends BaseTest{
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public AddAppTest(AndroidDriver<AndroidElement> driver){
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
	private AndroidElement app(){//���������Ӧ�ð�ť
		return driver.findElementByXPath("//*[@href='/xxb/index.php?m=entry&f=admin']");
	}
	private AndroidElement add_app(){//������Ӧ�ð�ť
		return driver.findElementByXPath("//*[@href='/xxb/index.php?m=entry&f=create']");
	}
	private AndroidElement name(){//����
		return driver.findElementById("name");
	}
	private AndroidElement code(){//����
		return driver.findElementById("code");
	}
	private AndroidElement save(){//�������
		return driver.findElementById("submit");
	}
	@Test(description="���Ӧ��-���Ÿ�ʽ��ȷ")
	public void test1(){
		action.click(app());
		action.click(add_app());
		action.type(name(),"����");
		action.type(code(),"dushu");
		action.click(save());
	}
	@Test(description="���Ӧ��-���Ÿ�ʽ����")
	public void test2(){
		action.click(app());
		action.click(add_app());
		action.type(name(),"����");
		action.type(code(),"����");
		action.click(save());
	}

}