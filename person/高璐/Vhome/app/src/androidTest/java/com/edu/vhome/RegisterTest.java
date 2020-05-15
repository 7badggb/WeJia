package com.edu.vhome;

import android.app.Instrumentation;
import android.os.RemoteException;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RegisterTest {
    Instrumentation mInstrumation;
    UiDevice mDevice;

    @Before
    public void startUp() throws RemoteException, InterruptedException {
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
        mDevice.findObject(By.res("h.jpc.vhome:id/go")).click();
        Thread.sleep(3000);
    }

    //父母注册
    @Test
    public void registerFAM() throws InterruptedException {
        //点击用户注册
        mDevice.findObject(By.res("h.jpc.vhome:id/register")).click();
        Thread.sleep(3000);
        //进入注册页面
        //输入昵称
        mDevice.findObject(By.res("h.jpc.vhome:id/userName")).setText("zyl");
        //输入手机号
        mDevice.findObject(By.res("h.jpc.vhome:id/input_phone_et")).setText("15176906306");
        //点击获取验证码
        mDevice.findObject(By.res("h.jpc.vhome:id/request_code_btn")).click();
        Thread.sleep(3000);
        //输入验证码
        mDevice.findObject(By.res("h.jpc.vhome:id/input_code_et")).setText("0416");
        //输入密码
        mDevice.findObject(By.res("h.jpc.vhome:id/etPwd")).setText("123456");
        //点击父母注册
        mDevice.findObject(By.res("h.jpc.vhome:id/rb1")).click();
        //点击注册并登录
        mDevice.findObject(By.res("h.jpc.vhome:id/registerOK")).click();
    }

    //子女注册
    @Test
    public void registerSAD() throws InterruptedException {
        //点击用户注册
        mDevice.findObject(By.res("h.jpc.vhome:id/register")).click();
        Thread.sleep(3000);
        //进入注册页面
        //输入昵称
        mDevice.findObject(By.res("h.jpc.vhome:id/userName")).setText("zyl");
        //输入手机号
        mDevice.findObject(By.res("h.jpc.vhome:id/input_phone_et")).setText("15176906307");
        //点击获取验证码
        mDevice.findObject(By.res("h.jpc.vhome:id/request_code_btn")).click();
        Thread.sleep(3000);
        //输入验证码
        mDevice.findObject(By.res("h.jpc.vhome:id/input_code_et")).setText("0416");
        //输入密码
        mDevice.findObject(By.res("h.jpc.vhome:id/etPwd")).setText("123457");
        //点击子女注册
        mDevice.findObject(By.res("h.jpc.vhome:id/rb2")).click();
        //点击注册并登录
        mDevice.findObject(By.res("h.jpc.vhome:id/registerOK")).click();
    }

    //退出注册页面
    @Test
    public void registerBack() throws InterruptedException {
        //点击返回键
        mDevice.findObject(By.res("h.jpc.vhome:id/backToLogin")).click();
        Thread.sleep(3000);
    }

    @After
    public void clearDown() throws InterruptedException {
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
