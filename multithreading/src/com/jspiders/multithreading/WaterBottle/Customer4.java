package com.jspiders.multithreading.synchronization;

public class Customer4 extends Thread{
    Shop shop;
    public Customer4(Shop shop){
        this.shop=shop;
    }
    @Override
    public void run() {
        synchronized (Integer.valueOf(shop.waterBottle)) {
            shop.purchase(30);
        }
    }
}
