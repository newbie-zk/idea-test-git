package com.newbie.main;

public class JianPan implements Usb {
    @Override
    public void openUsb() {
        System.out.println("开启键盘");
    }

    @Override
    public void exitUsb() {
        System.out.println("关闭键盘");
    }
}
