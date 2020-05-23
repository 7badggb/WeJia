package com.example.xuanxuan;

import android.app.Instrumentation;
import android.os.RemoteException;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LoginTest {
    Instrumentation mInstrumation;
    UiDevice mDevice;
    @Before
    public void startup() throws RemoteException,InterruptedException {
        mInstrumation = InstrumentationRegistry.getInstrumentation();
        mDevice = UiDevice.getInstance(mInstrumation);
        //按键home
        mDevice.pressHome();
        //判断是否锁屏
        boolean status = mDevice.isScreenOn();
        if (!status) {
            mDevice.wakeUp();
        }
        mDevice.findObject(By.text("喧喧")).click();
        Thread.sleep(3000);
    }
    @Test
    public void test1() throws InterruptedException{//登录
        //输入用户名
        mDevice.findObject(By.res("192.168.43.83:id/account")).setText("admin");
        // 输入密码
        mDevice.findObject(By.res("192.168.43.83:id/password")).setText("123456");
        //点击登录
        mDevice.findObject(By.res("192.168.43.83:id/submit")).click();
    }
    @Test
    public void test2() throws InterruptedException{//登录-用户名错误
        //输入用户名
        mDevice.findObject(By.res("192.168.43.83:id/account")).setText("admi");
        // 输入密码
        mDevice.findObject(By.res("192.168.43.83:id/password")).setText("123456");
        //点击登录
        mDevice.findObject(By.res("192.168.43.83:id/submit")).click();
    }
    @Test
    public void test3() throws InterruptedException{//登录-密码错误
        //输入用户名
        mDevice.findObject(By.res("192.168.43.83:id/account")).setText("admin");
        // 输入密码
        mDevice.findObject(By.res("192.168.43.83:id/password")).setText("1234");
        //点击登录
        mDevice.findObject(By.res("192.168.43.83:id/submit")).click();
    }
    @After
    public void cleardown() throws InterruptedException {
        //退出登录
        mDevice.findObject(By.text("退出")).click();
    }
}
