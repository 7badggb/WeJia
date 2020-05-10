package edu.hml;

import org.testng.annotations.Test;

import edu.base.BaseAction;
import edu.base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ParaEditTest extends BaseTest{
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public ParaEditTest(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
		this.action = new BaseAction(driver);
	}
	private AndroidElement btn_para_set(){//����������ð�ť
		return driver.findElementByXPath("//*[@href='/xxb/index.php?m=setting&f=xuanxuan&type=edit']");
	}
	private AndroidElement para_edit(){//�޸�����
		return driver.findElementByXPath("//*[@name='server']");
	}
	private AndroidElement save(){//�������
		return driver.findElementById("submit");
	}
	private AndroidElement para(){//���������������ť
		return driver.findElementByXPath("//*[@href='/xxb/index.php?m=setting&f=xuanxuan']");
	}
	private AndroidElement btn_para_edit(){//����޸����ð�ť
		return driver.findElementByXPath("//*[@href='/xxb/index.php?m=setting&f=xuanxuan&type=edit']");
	}
	
	@Test(description="�޸Ĳ���-��ҳ")
	public void test1(){
		action.click(btn_para_set());
		action.type(para_edit(),"http://192.168.1.109:80");
		action.click(save());
	}
	@Test(description="�޸Ĳ���-����ҳ")
	public void test2(){
		action.click(para());
		action.click(btn_para_edit());
		action.type(para_edit(),"http://192.168.1.109:80");
		action.click(save());
	}

}
