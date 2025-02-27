package com.hasnat.comparator;

import java.util.*;
class Product{
    int pId;
    String pName;
    int pPrice;
    public Product(int id,String name,int price){
        this.pId= id;
        this.pName= name;
        this.pPrice= price;
    }
    public String toString(){
        return "id "+pId+" name "+pName+" Price "+pPrice;
    }
}
class IDSort implements Comparator<Product>{
    public int compare(Product p1,Product p2){
        return p1.pName.compareTo(p2.pName);
    }
}
public class SortingUsingComparator {
    public static void main(String[] args) {

        List <Product> list = new ArrayList<>();
        list.add(new Product(1,"Laptop",50000));
        list.add(new Product(2,"Mobile",20000));
        list.add(new Product(3,"Camera",80000));
        list.add(new Product(4,"Tab",25000));
        
        //Using lembda expression
       /*Collections.sort(list,(p1,p2)->p1.pName.compareTo(p2.pName));*/
       
       //Using annonymous inner class without refrence
        /*Collections.sort(list,new Comparator(){
            public int compare(Product p1, Product p2){
                return p2.pId-p1.pId;
            }
        });*/
        //Using Annonymos inner class with refrence
        /*Comparator idSort= new Comparator<Product>(){
            public int compare(Product p1, Product p2){
                return p2.pId-p1.pId;
            }
        };
        Collections.sort(list,idSort);*/
        
        //Using annonymous inner class using sort method
        list.sort((p1,p2)->p1.pName.compareTo(p2.pName));
        
        list.forEach(System.out::println);
    }
}