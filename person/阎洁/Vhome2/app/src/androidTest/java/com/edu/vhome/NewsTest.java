package com.edu.vhome;

import android.app.Instrumentation;
import android.os.RemoteException;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NewsTest {
    Instrumentation mInstrumation;
    UiDevice mDevice;


    @Before
    public void startup() throws RemoteException, InterruptedException {
        mInstrumation= InstrumentationRegistry.getInstrumentation();
        mDevice=UiDevice.getInstance(mInstrumation);
        //按键home
        mDevice.pressHome();
        //判断是否锁屏
        boolean status=mDevice.isScreenOn();
        if(!status) {
            mDevice.wakeUp();
        }
        mDevice.findObject(By.text("微家")).click();
        Thread.sleep(3000);
        //点击go
//        mDevice.findObject(By.res("h.jpc.vhome:id/go")).click();
//        Thread.sleep(3000);
        //进入登录界面
        //输入用户名
        mDevice.findObject(By.res("h.jpc.vhome:id/etPhone")).setText("15513155225");
        // 输入密码
        mDevice.findObject(By.res("h.jpc.vhome:id/etPwd")).setText("qqq123");
        // 点击登录
        mDevice.findObject(By.res("h.jpc.vhome:id/pwdLogin")).click();
        Thread.sleep(3000);
    }
    //查看新闻的数量是不是8
    @Test
    public void test7NewsCount() throws InterruptedException {
        //点击趣新闻
        mDevice.findObject(By.res("h.jpc.vhome:id/quxinwen")).click();
        Thread.sleep(3000);
        UiObject2 listview=mDevice.findObject(By.res("h.jpc.vhome:id/lv_data"));
        int count=listview.getChildCount();
        System.out.println(count);
    }
    //打开第一条新闻
    @Test
    public void test8ClickNews() throws InterruptedException {
        mDevice.findObject(By.clazz("android.widget.LinearLayout")).click();
        Thread.sleep(3000);
    }
    @After
    public void cleardown() throws InterruptedException {
        //返回到主页面
        mDevice.pressBack();
        //点击我的
        mDevice.findObject(By.text("我的")).click();
        Thread.sleep(3000);
        //点击退出登录
        mDevice.findObject(By.text("退出登录")).click();
        Thread.sleep(3000);
        //点击确定
        mDevice.findObject(By.res("h.jpc.vhome:id/commit")).click();
        Thread.sleep(3000);
    }

}
