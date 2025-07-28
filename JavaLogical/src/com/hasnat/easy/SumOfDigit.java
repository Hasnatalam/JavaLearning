package com.hasnat.easy;


public class SumOfDigit{
    public static void main(String [] args){
        int num=123;
        int result=0;
        while(num>0){
            result+=num%10;
            num/=10;
        }
        System.out.println(result);
    }
}