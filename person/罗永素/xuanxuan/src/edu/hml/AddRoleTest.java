package edu.hml;

import org.testng.annotations.Test;

import edu.base.BaseAction;
import edu.base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AddRoleTest extends BaseTest{
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public AddRoleTest(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
		this.action = new BaseAction(driver);
	}
	private AndroidElement user(){//����û�
		return driver.findElementByXPath("//*[@href='/xxb/index.php?m=user&f=admin']");
	}
	private AndroidElement role(){//�����ɫ
		return driver.findElementByXPath("//*[@href='/xxb/index.php?m=setting&f=lang&module=user&field=roleList']");
	}
	private AndroidElement add(){//����Ӻ�
		return driver.findElementByXPath("//table/tbody/tr/td[3]/a[@class='btn btn-mini add']");
	}
	private AndroidElement input_name(){//���������
		return driver.findElementByXPath("//*[@placeholder='������']");
	}
	private AndroidElement input_value(){//�Զ�����ʾֵ
		return driver.findElementByXPath("//*[@placeholder='�Զ�����ʾֵ']");
	}
	private AndroidElement save(){//�������
		return driver.findElementById("submit");
	}
	@Test(description="��ӽ�ɫ")
	public void test(){
		action.click(user());
		action.click(role());
		action.click(add());
		action.type(input_name(),"chengxuyuan");
		action.type(input_value(),"����Ա");
		action.click(save());
	}

}
