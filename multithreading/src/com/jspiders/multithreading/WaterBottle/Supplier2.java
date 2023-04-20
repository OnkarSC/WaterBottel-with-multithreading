package com.jspiders.multithreading.synchronization;

public class Supplier2 extends Thread{
    Shop shop;
    public Supplier2(Shop shop){
        this.shop=shop;
    }
    @Override
    public void run() {
        shop.restockBottle(50);
    }
}
