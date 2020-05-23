package com.example.xuanxuan;

import android.app.Instrumentation;
import android.os.RemoteException;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AddUserTest {
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
    public void test1() throws InterruptedException{//添加成员-用户名，邮箱错误
        //点击用户
        mDevice.findObject(By.res("192.168.43.83:href//xxb/index.php?m=user&f=admin")).click();
        //点击添加成员
        mDevice.findObject(By.res("192.168.43.83:href//xxb/index.php?m=user&f=create")).click();
        //输入用户名“张三”
        mDevice.findObject(By.res("192.168.43.83:id/account")).setText("张三");
        //输入真实姓名“李四”
        mDevice.findObject(By.res("192.168.43.83:id/realname")).setText("李四");
        //选择性别男
        mDevice.findObject(By.res("192.168.43.83:id/genderm")).click();
        //选择角色人事
        mDevice.findObject(By.res("192.168.43.83:data-keys/renshi rs")).click();
        //输入密码111111
        mDevice.findObject(By.res("192.168.43.83:id/password1")).setText("111111");
        //重复密码111111
        mDevice.findObject(By.res("192.168.43.83:id/password2")).setText("111111");
        //输入邮箱222
        mDevice.findObject(By.res("192.168.43.83:name/email")).setText("222");
        //点击保存
        mDevice.findObject(By.res("192.168.43.83:id/submit")).click();
    }
    @Test
    public void test2() throws InterruptedException{//添加成员
        //点击用户
        mDevice.findObject(By.res("192.168.43.83:href//xxb/index.php?m=user&f=admin")).click();
        //点击添加成员
        mDevice.findObject(By.res("192.168.43.83:href//xxb/index.php?m=user&f=create")).click();
        //输入用户名“zhangsan”
        mDevice.findObject(By.res("192.168.43.83:id/account")).setText("zhangsan");
        //输入真实姓名“李四”
        mDevice.findObject(By.res("192.168.43.83:id/realname")).setText("李四");
        //选择性别男
        mDevice.findObject(By.res("192.168.43.83:id/genderm")).click();
        //选择角色人事
        mDevice.findObject(By.res("192.168.43.83:data-keys/renshi rs")).click();
        //输入密码111111
        mDevice.findObject(By.res("192.168.43.83:id/password1")).setText("111111");
        //重复密码111111
        mDevice.findObject(By.res("192.168.43.83:id/password2")).setText("111111");
        //输入邮箱222@163.com
        mDevice.findObject(By.res("192.168.43.83:name/email")).setText("222@163.com");
        //点击保存
        mDevice.findObject(By.res("192.168.43.83:id/submit")).click();
    }
    @After
    public void cleardown() throws InterruptedException {
        //退出登录
        mDevice.findObject(By.text("退出")).click();
    }
}

