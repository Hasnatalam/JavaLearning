package com.hasnat.medium;

import java.util.*;
public class ThirdMax{
    public static void main(String [] args){
        List<Integer> list = Arrays.asList(4,5,5);
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        
        for(Integer num : list){
            if (max1<num){
                max3=max2;
                max2=max1;
                max1=num;
            }
            else if(max2<num && max1!=num ){
            max3=max2;
            max2=num;
            }
            else if(max3<num && max1!=num && max2!=num)max3=num;
        }
        if (max3==Integer.MIN_VALUE)System.out.println("Third max no is not there");
        else
        System.out.println(max3);
    }
}
