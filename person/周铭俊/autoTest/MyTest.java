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
        mDevice.findObject(By.text("微家")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("我的")).click();
        Thread.sleep(3000);
    }
    //查看我的关注
    @Test
    public void PushNewsTest1()throws InterruptedException{
        mDevice.findObject(By.res("h.jpc.vhome:id/tv_myself_attention")).click();
        Thread.sleep(3000);
    }
    //查看我的粉丝
    @Test
    public void PushNewsTest2()throws InterruptedException{
        mDevice.findObject(By.res("h.jpc.vhome:id/tv_myself_funs")).click();
        Thread.sleep(3000);
        
    }
    //查看我的消息
    @Test
    public void PushNewsTest3()throws InterruptedException{
        mDevice.findObject(By.text("我的消息")).click();
        Thread.sleep(3000);
    }
    //查看我的帖子
    @Test
    public void PushNewsTest3()throws InterruptedException{
        mDevice.findObject(By.text("我的帖子")).click();
        Thread.sleep(3000);
    }
    //查看我的关联
    @Test
    public void PushNewsTest3()throws InterruptedException{
        mDevice.findObject(By.text("我的关联")).click();
        Thread.sleep(3000);
    }
    //查看我的收藏
    @Test
    public void PushNewsTest3()throws InterruptedException{
        mDevice.findObject(By.text("我的收藏")).click();
        Thread.sleep(3000);
    }
    //查看关于微家
    @Test
    public void PushNewsTest3()throws InterruptedException{
        mDevice.findObject(By.text("关于微家")).click();
        Thread.sleep(3000);
    }
}
