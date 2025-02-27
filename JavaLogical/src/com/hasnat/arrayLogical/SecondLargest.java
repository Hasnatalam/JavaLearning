package com.hasnat.arrayLogical;

public class SecondLargest {
	
	public static void main(String[] args) {
		int arr[]= {1,6,3,5,8,2,9};
		int max=arr[0] ;int second=arr[0];
		
		for(int num: arr) {
			if(max<num) max=num;
		}
		for(int num:arr) {
			if(num>second&&num<max) second=num;
		}
		System.out.println(second);
		//System.out.println(max);
	}

}
