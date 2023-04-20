package com.jspiders.multithreading.synchronization;

public class Shop {
    int waterBottle;

    public Shop(int minBottle) {
        this.waterBottle = minBottle;
    }

    public void stock() {
        System.out.println("Available bottle : " + waterBottle);
    }

    public synchronized void purchase(int quantity) {
        if (quantity > waterBottle) {
            System.out.println(Thread.currentThread().getName() + " - " + quantity + " stock is not available please wait....");
            try {
                System.out.println("restocking stock........");
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread().getName() + " - " + quantity + " bottle are purchase successful..");
        waterBottle -= quantity;
        stock();

    }

    public synchronized void restockBottle(int quantity) {
        System.out.println(Thread.currentThread().getName() + " - " + quantity + " bottle are stocked sent...");
        waterBottle += quantity;
        stock();
        notifyAll();
    }
}
