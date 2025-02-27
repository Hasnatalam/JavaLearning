package com.hasnat.multithreading2;

import java.util.Arrays;

class Test{
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,1,1,2,2,3,4};
		Arrays.sort(arr);
		//[1, 1, 1, 2, 2, 2, 3, 3, 4]
		int c=1;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				c++; //3
			}
			else
			{
				System.out.println(arr[i]+"="+c);
				c=1;
			}
			if(i+1==arr.length-1)
			{
				System.out.println(arr[i+1]+"="+c);
			}
		}
		
	}
	
}