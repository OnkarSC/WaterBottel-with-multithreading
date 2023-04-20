package com.jspiders.multithreading.synchronization;

public class Supplier1 extends Thread{
    Shop shop;
    public Supplier1(Shop shop){
        this.shop=shop;
    }
    @Override
    public void run() {
            shop.restockBottle(25);
    }
}
