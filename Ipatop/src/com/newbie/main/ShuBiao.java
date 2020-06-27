package com.newbie.main;

public class ShuBiao implements Usb {
    @Override
    public void openUsb() {
        System.out.println("开启鼠标");
    }

    @Override
    public void exitUsb() {
        System.out.println("关闭鼠标");
    }
}
