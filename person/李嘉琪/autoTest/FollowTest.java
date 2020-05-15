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
        //点击社区
        mDevice.findObject(By.text("社区")).click();
        Thread.sleep(3000);
    }
    //发表动态
    @Test
    public void PushNewsTest1()throws InterruptedException{
        mDevice.findObject(By.res("h.jpc.vhome:id/addPost")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("h.jpc.vhome:id/edt_post_publish")).setText("帖子1");
        mDevice.findObject(By.text("发表")).click();
    }
    //取消发表帖子
    @Test
    public void PushNewsTest2()throws InterruptedException{
        mDevice.findObject(By.res("h.jpc.vhome:id/addPost")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("h.jpc.vhome:id/edt_post_publish")).setText("帖子1");
        mDevice.findObject(By.text("取消")).click();
    }
    //删除帖子
    @Test
    public void PushNewsTest3()throws InterruptedException{
        mDevice.findObject(By.text("我的")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("我的帖子")).click();
        Thread.sleep(2000);
        //判断是否可以长按
        mDevice.findObject(By.res("h.jpc.vhome:id/tv_hot_content")).isLongClickable();
        //长按
        mDevice.findObject(By.res("h.jpc.vhome:id/tv_hot_content")).click();
        mDevice.findObject(By.text("确定")).click();
    }
}
