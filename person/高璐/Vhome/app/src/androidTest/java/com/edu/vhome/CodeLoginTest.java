package com.edu.vhome;

import android.app.Instrumentation;
import android.os.RemoteException;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CodeLoginTest {
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

    //验证码登录
    @Test
    public void codeSuccess() throws InterruptedException {
        //点击验证码登录
        mDevice.findObject(By.res("h.jpc.vhome:id/use_code")).click();
        Thread.sleep(3000);
        //进入验证码登录页面
        //输入手机号
        mDevice.findObject(By.res("h.jpc.vhome:id/etPhone")).setText("15176906306");
        // 点击获取验证码
        mDevice.findObject(By.res("h.jpc.vhome:id/request_code_btn")).click();
        Thread.sleep(3000);
        // 输入验证码
        mDevice.findObject(By.res("h.jpc.vhome:id/etPwd")).setText("0514");
        // 点击登录
        mDevice.findObject(By.res("h.jpc.vhome:id/pwdLogin")).click();
        Thread.sleep(3000);
    }

    @Test
    public void codeFail() throws InterruptedException {
        //点击验证码登录
        mDevice.findObject(By.res("h.jpc.vhome:id/use_code")).click();
        Thread.sleep(3000);
        //进入验证码登录页面
        //输入手机号
        mDevice.findObject(By.res("h.jpc.vhome:id/etPhone")).setText("1517690630");
        // 点击获取验证码
        mDevice.findObject(By.res("h.jpc.vhome:id/request_code_btn")).click();
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
