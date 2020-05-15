package com.example.testone;

import android.app.Instrumentation;
import android.os.RemoteException;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.By;

import org.junit.Before;
import org.junit.Test;

public class HotTroubleTest {

    Instrumentation mInstrumentation;
    UiDevice mDevice;
    @Before
    public void starUp() throws RemoteException, InterruptedException{
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
    //收藏内容
    @Test
    public void CollectTest() throws InterruptedException{
        //收藏并在我的收藏里确认是否收藏成功
        mDevice.findObject(By.text("收藏")).click();
        mDevice.findObject(By.text("我的")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("我的收藏")).click();
    }
    //评论帖子
    @Test
    public void CommentTest1()throws InterruptedException{
        mDevice.findObject(By.res("h.jpc.vhome:id/iv_hot_comment")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.res("h.jpc.vhome:id/edt_comment_content")).setText("哈喽");
        mDevice.findObject(By.text("评论")).click();
    }
    //回复帖子
    @Test
    public void CommentTest2()throws InterruptedException{
        mDevice.findObject(By.res("h.jpc.vhome:id/iv_hot_comment")).click();
        Thread.sleep(2000);
        //点击评论进行回复
        mDevice.findObject(By.clazz("android.widget.LinearLayout")).click();
        mDevice.findObject(By.text("回复 长者 的评论:")).setText("你好");
        mDevice.findObject(By.text("发布")).click();
    }
    //删除帖子
    @Test
    public void DeleteTest() throws InterruptedException{
        mDevice.findObject(By.res("h.jpc.vhome:id/iv_hot_comment")).click();
        //判断是否可以长按
        mDevice.findObject(By.text("长者")).isLongClickable();
        //长按一条帖子删除
        mDevice.findObject(By.text("长者")).longClick();
        Thread.sleep(2000);
        mDevice.findObject(By.text("确定")).click();
    }
    //点赞关注
    @Test
    public void GiveUpTest1() throws InterruptedException{
        //点赞
        mDevice.findObject(By.res("h.jpc.vhome:id/rl_post_like")).click();
        mDevice.findObject(By.res("h.jpc.vhome:id/iv_hot_comment")).click();
        Thread.sleep(2000);
        //关注
        mDevice.findObject(By.text("+关注")).click();
    }
}
