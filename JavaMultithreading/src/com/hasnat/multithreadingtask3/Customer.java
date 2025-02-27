package com.hasnat.multithreadingtask3;

public class Customer implements Runnable {
    Bakery bakery;
    String customerName;

    public Customer(Bakery bakery, String customerName) {
        this.bakery = bakery;
        this.customerName = customerName;
    }

    @Override
    public void run() {
        while (!bakery.isProductionFinished()) {
            bakery.buyGoods(customerName);
        }
    }
}
