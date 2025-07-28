package com.hasnat.easy;


public class PrimeNoInRange{
    public static void main(String [] args){
       int num=10;
       int count=1;
       for(int n=2;n<=num;n++) {
       for(int i=2;i<=n/2;i++){
            if(n%i==0)count++;
       }
       if(count<2)
       System.out.println(n);
       count=1;
       }
    }
}
