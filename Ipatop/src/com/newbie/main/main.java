package com.newbie.main;

public class main {
    public static void main(String[] args) {
        Iaptop iaptop = new Iaptop();
        Usb usb1 = new ShuBiao();
        iaptop.openIaptop();
        iaptop.openUsb(usb1);
        iaptop.openUsb(new JianPan());
        iaptop.exitIaptop();
    }
}
