package com.hasnat.multithreadingtask3;

public class Bakery {
    private int goodsAvailable;
    private final int MAX_GOODS_PER_DAY = 100;
    private int goodsProducedToday;

    public synchronized void bakeGoods() {
        while (goodsAvailable > 0) {  // Corrected condition
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (goodsProducedToday < MAX_GOODS_PER_DAY) {  // Check if production is still allowed
            goodsProducedToday += 10;
            goodsAvailable = 10;
            System.out.println("10 products added");
            notifyAll();  // Notify all waiting threads
        }
    }

    public synchronized void buyGoods(String customerName) {
        while (goodsAvailable <= 0 && goodsProducedToday < MAX_GOODS_PER_DAY) {  // Check if there are no goods and production is still ongoing
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (goodsAvailable > 0) {  // Check again if goods are available
            goodsAvailable--;
            System.out.println(customerName + " got a product");
            if (goodsAvailable == 0) {
                notifyAll();  // Notify baker if goods are finished
            }
        }
    }

    public boolean isProductionFinished() {
        return goodsProducedToday >= MAX_GOODS_PER_DAY && goodsAvailable <= 0;
    }
}
