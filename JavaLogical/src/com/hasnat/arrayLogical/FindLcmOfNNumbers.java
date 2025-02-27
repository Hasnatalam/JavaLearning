package com.hasnat.arrayLogical;

public class FindLcmOfNNumbers {
    public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);
        int []arr={7, 9, 11, 13, 17, 19};
        long lcm =arr[0];
          
        for(int n : arr){
            if(lcm<n)lcm=n;
        }
         System.out.println(lcm);
         
            for(int i=0;i<arr.length;i++){
                for(int j=1;lcm%arr[i]!=0;j++){
                    
                    if(lcm*j % arr[i]==0) lcm*=j;
                    
                    
                    System.out.println(lcm+" "+arr[i]);
                }
            }
        
        
    System.out.println(lcm);
    }
}
