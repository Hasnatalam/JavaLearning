package com.hasnat.easy;

public class Fibonacchi{
    public static void main(String [] args){
       int a=0,b=1,c=1;
       for(int i=0;i<5;i++){
           System.out.println(a+" ");
           c=a+b;
           a=b;
           b=c;
       }
    }
}