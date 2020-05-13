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

public class MusicTest {
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
////        Thread.sleep(3000);
        //进入登录界面
        //输入用户名
        mDevice.findObject(By.res("h.jpc.vhome:id/etPhone")).setText("15513155225");
        // 输入密码
        mDevice.findObject(By.res("h.jpc.vhome:id/etPwd")).setText("qqq123");
        // 点击登录
        mDevice.findObject(By.res("h.jpc.vhome:id/pwdLogin")).click();
        Thread.sleep(3000);
        //点击社区
        mDevice.findObject(By.text("社区")).click();
        Thread.sleep(3000);
        // 点击收音机
        mDevice.findObject(By.text("收音机")).click();
        Thread.sleep(5000);
    }
    //打开收音机界面，选择第一个抖音歌曲
    @Test
    public void test9MusicCount() throws InterruptedException {

        //测试是否显示7个歌曲集
        UiObject2 listview=mDevice.findObject(By.res("h.jpc.vhome:id/recommend_list"));
        int count=listview.getChildCount();
        System.out.println(count);
        //点击第一个,是抖音
        mDevice.findObject(By.clazz("android.widget.RelativeLayout")).click();
        Thread.sleep(3000);
        //测试是否为5个
        int countDouyin =mDevice.findObject(By.clazz("android.widget.RelativeLayout")).getChildCount();
        System.out.println(countDouyin);
    }
    @Test
    public void test10PlayMusic() throws InterruptedException {
        //点击抖音
        mDevice.findObject(By.clazz("android.widget.RelativeLayout")).click();
        Thread.sleep(3000);
        //点击抖音的第一首歌曲
        mDevice.findObject(By.clazz("android.widget.RelativeLayout")).click();
        Thread.sleep(3000);
        //测试左键是否可以点击播放前一首
        mDevice.findObject(By.res("h.jpc.vhome:id/pre_btn")).isClickable();
        // 测试暂停键是否可以点击
        mDevice.findObject(By.res("h.jpc.vhome:play_stop_btn")).isClickable();
        // 测试右键是否可以点击播放后一首
        mDevice.findObject(By.res("h.jpc.vhome:id/next_btn")).isClickable();
        mDevice.pressBack();
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
