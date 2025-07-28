package com.hasnat.easy;

public class Pelindrome{
    public static void main(String [] args){
       int num=12;
       int temp=num;
       int reverse=0;
       while(num>0){
           System.out.println(reverse=reverse*10+num%10);
           num/=10;
       }
       System.out.println(reverse);
       System.out.println(temp==reverse);
    }
}