package com.hasnat.interviewPurpose;

public class SecondLargest {
	public static void main(String[] args) {
		int arr[] = {1,2,13,2,8,7,15,5,4};
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		int thirdMax = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			
			if(firstMax<arr[i]) {
				thirdMax=secondMax;
				secondMax=firstMax;
				firstMax=arr[i];
			}
			
			else if (secondMax < arr[i] && arr[i]<firstMax) {
				thirdMax=secondMax;
				secondMax=arr[i];
			}
			else if(thirdMax < arr[i] && arr[i]<firstMax && arr[i]<secondMax) {
				thirdMax=arr[i];
			}
				
		}
		
		System.out.println(firstMax);
		System.out.println(secondMax);
		System.out.println(thirdMax);
	}
}
