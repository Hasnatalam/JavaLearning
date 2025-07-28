package com.hasnat.easy;


public class PrimeOrNot{
    public static void main(String [] args){
       int num=21;
       if(num==1){
           System.out.println("num is not prime");
           return;
       }
       int count=1;
       for(int i=2;i<=num/2;i++){
            if(num%i==0)count++;
            
            if(count>1){
                System.out.println(num+" is not prime");
                return;
            }
       }
       System.out.println(num+" is prime");
    }
}
