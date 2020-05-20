package com.example.testone;

import android.app.Instrumentation;
import android.os.RemoteException;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;

import org.junit.Before;
import org.junit.Test;

public class FollowTest {
    Instrumentation mInstrumentation;
    UiDevice mDevice;
    @Before
    public void starUp() throws RemoteException,InterruptedException{
        mInstrumentation = InstrumentationRegistry.getInstrumentation();
        mDevice = UiDevice.getInstance(mInstrumentation);
        mDevice.pressHome();
        boolean status = mDevice.isScreenOn();
        if(!status){
            mDevice.wakeUp();
        }
        mDevice.findObject(By.text("΢��")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("�ҵ�")).click();
        Thread.sleep(3000);
    }
    //�鿴�ҵĹ�ע
    @Test
    public void PushNewsTest1()throws InterruptedException{
        mDevice.findObject(By.res("h.jpc.vhome:id/tv_myself_attention")).click();
        Thread.sleep(3000);
    }
    //�鿴�ҵķ�˿
    @Test
    public void PushNewsTest2()throws InterruptedException{
        mDevice.findObject(By.res("h.jpc.vhome:id/tv_myself_funs")).click();
        Thread.sleep(3000);
        
    }
    //�鿴�ҵ���Ϣ
    @Test
    public void PushNewsTest3()throws InterruptedException{
        mDevice.findObject(By.text("�ҵ���Ϣ")).click();
        Thread.sleep(3000);
    }
    //�鿴�ҵ�����
    @Test
    public void PushNewsTest3()throws InterruptedException{
        mDevice.findObject(By.text("�ҵ�����")).click();
        Thread.sleep(3000);
    }
    //�鿴�ҵĹ���
    @Test
    public void PushNewsTest3()throws InterruptedException{
        mDevice.findObject(By.text("�ҵĹ���")).click();
        Thread.sleep(3000);
    }
    //�鿴�ҵ��ղ�
    @Test
    public void PushNewsTest3()throws InterruptedException{
        mDevice.findObject(By.text("�ҵ��ղ�")).click();
        Thread.sleep(3000);
    }
    //�鿴����΢��
    @Test
    public void PushNewsTest3()throws InterruptedException{
        mDevice.findObject(By.text("����΢��")).click();
        Thread.sleep(3000);
    }
}
