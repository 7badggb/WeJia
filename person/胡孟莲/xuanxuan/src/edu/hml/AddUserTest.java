package edu.hml;

import org.testng.annotations.Test;

import edu.base.BaseAction;
import edu.base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AddUserTest extends BaseTest{
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public AddUserTest(AndroidDriver<AndroidElement> driver){
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
	private AndroidElement user(){//����������û���ť
		return driver.findElementByXPath("//*[@href='/xxb/index.php?m=user&f=admin']");
	}
	private AndroidElement add_user(){//�����ӳ�Ա
		return driver.findElementByXPath("//*[@href='/xxb/index.php?m=user&f=create']");
	}
	private AndroidElement input_username(){//�����û���
		return driver.findElementByXPath("//*[@name='account']");
	}
	private AndroidElement input_realname(){//������ʵ����
		return driver.findElementByXPath("//*[@name=realname]");
	}
	private AndroidElement sex(){//ѡ���Ա���
		return driver.findElementById("genderm");
	}
	private AndroidElement role(){//ѡ���ɫ����
		return driver.findElementByXPath("//*[@data-keys='renshi rs']");
	}
	private AndroidElement password1(){//��������
		return driver.findElementByXPath("//*[@name='password1']");
	}
	private AndroidElement password2(){//�ظ�����
		return driver.findElementByXPath("//*[@name='password2']");
	}
	private AndroidElement email(){//����
		return driver.findElementByXPath("//*[@name='email']");
	}
	private AndroidElement save(){//�������
		return driver.findElementById("submit");
	}
	@Test(description="��ӳ�Ա-�û������������")
	public void test1(){
		action.click(user());
		action.click(add_user());
		action.type(input_username(),"����");
		action.type(input_realname(),"����");
		action.click(sex());
		action.click(role());
		action.type(password1(),"111111");
		action.type(password2(),"111111");
		action.type(email(),"222");
		action.click(save());
	}
	@Test(description="��ӳ�Ա")
	public void test2(){
		action.click(user());
		action.click(add_user());
		action.type(input_username(),"zhangsan");
		action.type(input_realname(),"����");
		action.click(sex());
		action.click(role());
		action.type(password1(),"111111");
		action.type(password2(),"111111");
		action.type(email(),"222@163.com");
		action.click(save());
	}

}
