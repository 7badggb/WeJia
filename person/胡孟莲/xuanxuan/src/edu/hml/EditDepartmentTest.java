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
	private AndroidElement user(){//����������û���ť
		return driver.findElementByXPath("//*[@href='/xxb/index.php?m=user&f=admin']");
	}
	private AndroidElement weihu_department(){//���ά�����Ű�ť
		return driver.findElementByXPath("//*[@href='/xxb/index.php?m=tree&f=browser&type=dept']");
	}
	private AndroidElement edit_department(){//����������ź���ı༭���Ű�ť
		return driver.findElementByXPath("//div/div/div/div/div/div[2]/div/ul/li/a[@href='/xxb/index.php?m=tree&f=edit&category=6']");
	}
	private AndroidElement higher_department(){//�ϼ�����
		return driver.findElementByXPath("//*[@title id='parent_chosen']");
	}
	private AndroidElement higher_department2(){//�ϼ�����
		//return driver.findElementByXPath("//*[@title data-option-array-index='2']");
		return driver.findElementByXPath("//*[@text='����']");
	}
	private AndroidElement manager(){//���ž���
		return driver.findElementByXPath("//*[@title id='moderators_chosen']");
	}
	private AndroidElement manager_name(){//���ž�������
		return driver.findElementByXPath("//*[@text='����']");
	}
	private AndroidElement save(){//�������
		return driver.findElementById("submit");
	}
	private AndroidElement delete(){//������ۺ��ɾ����ť
		return driver.findElementByXPath("//div/div/div/div/div/div[2]/div/ul/li[2]/a[@href='/xxb/index.php?m=tree&f=delete&category=7']");
	}
	private AndroidElement ok(){//���ȷ��
		return driver.findElementByXPath("//*[@text='ȷ��']");
	}
	@Test(description="�༭��������")
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
	@Test(description="ɾ�����۲���")
	public void test_delete(){
		action.click(user());
		action.click(weihu_department());
		action.click(delete());
		action.click(ok());
	}

}