package com.hasnat.multithreadingtask3;

public class BakeryExample {
    public static void main(String[] args) {
        //System.out.println("main class started");

        Bakery bakery = new Bakery();
        Baker baker = new Baker(bakery);
        Thread t1 = new Thread(baker);

        Customer customer1 = new Customer(bakery, "abc");
        Customer customer2 = new Customer(bakery, "def");
        Customer customer3 = new Customer(bakery, "ghi");

        Thread t2 = new Thread(customer1);
        Thread t3 = new Thread(customer2);
        Thread t4 = new Thread(customer3);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

       // System.out.println("main class ended");
    }
}
