package com.hasnat.easy;


public class Factorial{
    public static void main(String [] args){
    int num=5;
    // int fact=1;
    //     for(int i=num;i>1;i--){
    //     fact*=i;
    //     }
    //     System.out.println(fact);
    // }
    System.out.println(fact(num));
    }
        public static int fact(int num){
            if(num==0 || num==1)return 1;
         return num*fact(num-1);
        }
}