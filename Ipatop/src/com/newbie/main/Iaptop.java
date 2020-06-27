package com.newbie.main;

public class Iaptop {
    public void openIaptop() {
        System.out.println("开启笔记本电脑");
    }

    public void exitIaptop() {
        System.out.println("关闭笔记本电脑");
    }

    public void openUsb(Usb usb) {
        usb.openUsb();
        System.out.println("使用完了设备");
        usb.exitUsb();
    }
}