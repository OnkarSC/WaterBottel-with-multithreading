package com.jspiders.multithreading.synchronization;

public class Customer3 extends Thread{
    Shop shop;
    public Customer3(Shop shop){
        this.shop=shop;
    }
    @Override
    public void run() {
        shop.purchase(5);
    }
}
