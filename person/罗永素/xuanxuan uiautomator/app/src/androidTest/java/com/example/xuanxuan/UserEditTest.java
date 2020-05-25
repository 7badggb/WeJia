package com.example.xuanxuan;

import android.app.Instrumentation;
import android.os.RemoteException;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UserEditTest {
    Instrumentation mInstrumation;
    UiDevice mDevice;
    @Before
    public void startup() throws RemoteException,InterruptedException{
        mInstrumation= InstrumentationRegistry.getInstrumentation();
        mDevice=UiDevice.getInstance(mInstrumation);
        //按键home
        mDevice.pressHome();
        //判断是否锁屏
        boolean status = mDevice.isScreenOn();
        if(!status){
            mDevice.wakeUp();
        }
        mDevice.findObject(By.text("喧喧")).click();
        Thread.sleep(3000);
        //进入登录界面
        //输入用户名
        mDevice.findObject(By.res("192.168.43.83:id/account")).setText("admin");
        // 输入密码
        mDevice.findObject(By.res("192.168.43.83:id/password")).setText("123456");
        //点击登录
        mDevice.findObject(By.res("192.168.43.83:id/submit")).click();
    }
    @Test
    public void test1() throws  InterruptedException{//编辑用户信息-正确格式邮箱
        //点击admin
        mDevice.findObject(By.res("192.168.43.83:data-id/profile")).click();
        //点击编辑信息
        mDevice.findObject(By.clazz("btn btn-primary loadInModal")).click();
        //邮箱填写为“111@163.com”
        mDevice.findObject(By.res("192.168.43.83:id/email")).setText("111@163.com");
        //点击保存
        mDevice.findObject(By.res("192.168.43.83:id/submit")).click();
    }
    @Test
    public void test2() throws  InterruptedException{//编辑用户信息-错误格式邮箱
        //点击admin
        mDevice.findObject(By.res("192.168.43.83:data-id/profile")).click();
        //点击编辑信息
        mDevice.findObject(By.clazz("btn btn-primary loadInModal")).click();
        //邮箱填写为“111”
        mDevice.findObject(By.res("192.168.43.83:id/email")).setText("111");
        //点击保存
        mDevice.findObject(By.res("192.168.43.83:id/submit")).click();
    }
    @Test
    public void test3() throws  InterruptedException{//编辑用户信息-正确格式手机号
        //点击admin
        mDevice.findObject(By.res("192.168.43.83:data-id/profile")).click();
        //点击编辑信息
        mDevice.findObject(By.clazz("btn btn-primary loadInModal")).click();
        //邮箱填写为“11111111111”
        mDevice.findObject(By.res("192.168.43.83:id/mobile")).setText("11111111111");
        //点击保存
        mDevice.findObject(By.res("192.168.43.83:id/submit")).click();
    }
    @Test
    public void test4() throws  InterruptedException{//编辑用户信息-错误格式手机号
        //点击admin
        mDevice.findObject(By.res("192.168.43.83:data-id/profile")).click();
        //点击编辑信息
        mDevice.findObject(By.clazz("btn btn-primary loadInModal")).click();
        //邮箱填写为“11111”
        mDevice.findObject(By.res("192.168.43.83:id/mobile")).setText("11111");
        //点击保存
        mDevice.findObject(By.res("192.168.43.83:id/submit")).click();
    }
    @After
    public void cleardown() throws InterruptedException {
        //退出登录
        mDevice.findObject(By.text("退出")).click();
    }
}
