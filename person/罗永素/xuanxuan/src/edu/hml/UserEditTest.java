package edu.hml;

import org.testng.annotations.Test;

import edu.base.BaseAction;
import edu.base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UserEditTest extends BaseTest{
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public UserEditTest(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
		this.action = new BaseAction(driver);
	}
	private AndroidElement admin(){//���admin
		return driver.findElementByXPath("//*[@data-id='profile']");
	}
	private AndroidElement info_edit(){//����༭��Ϣ
		return driver.findElementByXPath("//*[@class='btn btn-primary loadInModal']");
	}
	private AndroidElement email(){//��д����
		return driver.findElementByXPath("//*[@name='email']");
	}
	private AndroidElement save(){//�������
		return driver.findElementById("submit");
	}
	private AndroidElement user(){//������������û���ť
		return driver.findElementByXPath("//*[@href='/xxb/index.php?m=user&f=admin']");
	}
	private AndroidElement edit(){//����û���Ϊadmin�ļ�¼�Ҳ�������еı༭��ť
		return driver.findElementByXPath("//*[@href='/xxb/index.php?m=user&f=edit&account=admin&from=admin']");
	}
	private AndroidElement tel(){//�ֻ�
		return driver.findElementById("mobile");
	}
	@Test(description="�༭�û���Ϣ-��ȷ��ʽ����")
	public void test1(){
		action.click(admin());
		action.click(info_edit());
		action.type(email(),"111@163.com");
		action.click(save());
	}
	@Test(description="�༭�û���Ϣ-�����ʽ����")
	public void test2(){
		action.click(admin());
		action.click(info_edit());
		action.type(email(),"111");
		action.click(save());
	}
	@Test(description="�༭�û���Ϣ-��ȷ��ʽ�ֻ���")
	public void test3(){
		action.click(user());
		action.click(edit());
		action.type(tel(),"11111111111");
		action.click(save());
	}
	@Test(description="�༭�û���Ϣ-�����ʽ�ֻ���")
	public void test4(){
		action.click(user());
		action.click(edit());
		action.type(tel(),"11111");
		action.click(save());
	}

}
