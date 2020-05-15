package com.edu.vhome;

import android.app.Instrumentation;
import android.os.RemoteException;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FindBackPwdTest {
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

    //找回密码
    @Test
    public void fbpTest() throws InterruptedException {
        //点击找回密码
        mDevice.findObject(By.res("h.jpc.vhome:id/findBackPwd")).click();
        Thread.sleep(3000);
        //进入找回密码页面
        //输入手机号
        mDevice.findObject(By.res("h.jpc.vhome:id/input_phone_et")).setText("15176906306");
        // 点击获取验证码
        mDevice.findObject(By.res("h.jpc.vhome:id/request_code_btn")).click();
        Thread.sleep(3000);
        // 输入验证码
        mDevice.findObject(By.res("h.jpc.vhome:id/input_code_et")).setText("0514");
        // 点击下一步
        mDevice.findObject(By.text("下一步")).click();
        Thread.sleep(3000);
    }

    @Test
    public void fbpTestFail() throws InterruptedException {
        //点击找回密码
        mDevice.findObject(By.res("h.jpc.vhome:id/findBackPwd")).click();
        Thread.sleep(3000);
        //进入找回密码页面
        //输入手机号
        mDevice.findObject(By.res("h.jpc.vhome:id/input_phone_et")).setText("1517690630");
        // 点击获取验证码
        mDevice.findObject(By.res("h.jpc.vhome:id/request_code_btn")).click();
        Thread.sleep(3000);
    }

    //退出注册页面
    @Test
    public void fbpBack() throws InterruptedException {
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
