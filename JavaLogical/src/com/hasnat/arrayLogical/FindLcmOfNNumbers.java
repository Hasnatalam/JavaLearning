package com.hasnat.arrayLogical;

import java.util.Arrays;

public class FindLcmOfNNumbers {
    public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);
        //int []arr={7, 9, 11, 13, 17, 19};
        int []arr={15,30,45};
          
        Arrays.sort(arr);
        long lcm =arr[0];
        
         System.out.println("lcm "+lcm);
         
            for(int i=0;i<arr.length;i++){
                for(int j=1;lcm%arr[i]!=0;j++){
                    
                    if(lcm*j % arr[i]==0) lcm*=j;
                    
                }
            }
        
        
    System.out.println(lcm);
    }
}
