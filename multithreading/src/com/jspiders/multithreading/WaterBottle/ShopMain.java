package com.jspiders.multithreading.synchronization;

public class ShopMain {
    public static void main(String[] args) {
        Shop shop = new Shop(7);
        Customer1 customer1 = new Customer1(shop);
        Customer2 customer2 = new Customer2(shop);
        Customer3 customer3 = new Customer3(shop);
        Supplier1 supplier1 = new Supplier1(shop);
        Supplier2 supplier2 = new Supplier2(shop);
        Customer4 customer4 = new Customer4(shop);
        customer1.start();
        customer1.setName("Customer 1");
        customer2.setName("Customer 2");
        customer3.setName("Customer 3");
        customer4.setName("Customer 4");
        supplier1.setName("supplier 1");
        supplier2.setName("supplier 2");
        supplier1.start();
        supplier2.start();
        customer4.start();
        customer2.start();
        customer3.start();

    }
}
