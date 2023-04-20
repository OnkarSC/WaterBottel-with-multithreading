package com.jspiders.multithreading.synchronization;

public class Customer2 extends Thread{
    Shop shop;
    public Customer2(Shop shop){
        this.shop=shop;
    }
    @Override
    public void run() {
        synchronized (Integer.valueOf(shop.waterBottle)) {
            shop.purchase(20);
        }
    }
}
