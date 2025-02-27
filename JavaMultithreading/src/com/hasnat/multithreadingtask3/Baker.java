package com.hasnat.multithreadingtask3;

public class Baker implements Runnable {
    Bakery bakery;

    public Baker(Bakery bakery) {
        this.bakery = bakery;
    }

    @Override
    public void run() {
        while (!bakery.isProductionFinished()) {
            bakery.bakeGoods();
        }
    }
}
