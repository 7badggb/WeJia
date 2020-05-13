package com.edu.vhome;

import android.app.Instrumentation;
import android.os.RemoteException;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject2;
import androidx.test.uiautomator.UiObjectNotFoundException;
import androidx.test.uiautomator.UiScrollable;
import androidx.test.uiautomator.UiSelector;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WeatherTest {
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
    @Test
    public void test1Tangshan() throws InterruptedException {
        // 点击看天气
        mDevice.findObject(By.res("h.jpc.vhome:id/kantianqi")).click();
        Thread.sleep(3000);
        //点击搜索框输入
        mDevice.findObject(By.res("h.jpc.vhome:id/city_name")).setText("唐山");
        // 点击搜索
        mDevice.findObject(By.res("h.jpc.vhome:id/button")).click();
        Thread.sleep(3000);
    }
    @Test
    public void test2London() throws InterruptedException {
        // 点击看天气
        mDevice.findObject(By.res("h.jpc.vhome:id/kantianqi")).click();
        Thread.sleep(3000);
        //点击搜索框输入
        mDevice.findObject(By.res("h.jpc.vhome:id/city_name")).setText("London");
        // 点击搜索
        mDevice.findObject(By.res("h.jpc.vhome:id/button")).click();
        Thread.sleep(3000);
    }
    @Test
    public void test3Kong() throws InterruptedException {
        // 点击看天气
        mDevice.findObject(By.res("h.jpc.vhome:id/kantianqi")).click();
        Thread.sleep(3000);
        //点击搜索框输入
        mDevice.findObject(By.res("h.jpc.vhome:id/city_name")).setText("");
        // 点击搜索
        mDevice.findObject(By.res("h.jpc.vhome:id/button")).click();
        Thread.sleep(3000);
    }
    @Test
    public void test4Illegal() throws InterruptedException {
        // 点击看天气
        mDevice.findObject(By.res("h.jpc.vhome:id/kantianqi")).click();
        Thread.sleep(3000);
        //点击搜索框输入
        mDevice.findObject(By.res("h.jpc.vhome:id/city_name")).setText("@#$");
        // 点击搜索
        mDevice.findObject(By.res("h.jpc.vhome:id/button")).click();
        Thread.sleep(3000);
    }
    @Test
    public void test5Script() throws InterruptedException {
        // 点击看天气
        mDevice.findObject(By.res("h.jpc.vhome:id/kantianqi")).click();
        Thread.sleep(3000);
        //点击搜索框输入
        mDevice.findObject(By.res("h.jpc.vhome:id/city_name")).setText("<script>alert('abc')</script>");
        // 点击搜索
        mDevice.findObject(By.res("h.jpc.vhome:id/button")).click();
        Thread.sleep(3000);
    }
    //测试是否显示7天的天气情况
    @Test
    public void test6WeekDay() throws InterruptedException {
        // 点击看天气
        mDevice.findObject(By.res("h.jpc.vhome:id/kantianqi")).click();
        Thread.sleep(3000);
        UiObject2 listview=mDevice.findObject(By.res("h.jpc.vhome:id/lv_weather"));
        int count=listview.getChildCount();
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
