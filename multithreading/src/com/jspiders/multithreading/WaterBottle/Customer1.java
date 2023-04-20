package com.jspiders.multithreading.synchronization;

public class Customer1 extends Thread {
    Shop shop;

    public Customer1(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        synchronized (Integer.valueOf(shop.waterBottle)) {
            shop.purchase(10);
        }
    }
}
