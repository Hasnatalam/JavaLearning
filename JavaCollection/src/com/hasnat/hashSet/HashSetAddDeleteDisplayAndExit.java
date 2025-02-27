package com.hasnat.hashSet;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetAddDeleteDisplayAndExit {
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<>();
		System.out.println("Options");
		System.out.println("1 Add Element");
		System.out.println("2 Delete Element");
		System.out.println("3 Display all Element");
		System.out.println("4 Exit");
		while (true) {
			Scanner sc = new Scanner (System.in);
			
			System.out.print("Enter your choice :");
			int choice = sc.nextInt();
			switch(choice) {
				case 1: {
					System.out.print("Enter the element to add : ");
					String str=sc.nextLine();str=sc.nextLine();
					hs.add(str);break;
				}
				case 2:{
					System.out.print("Enter the element to delete : ");
					String str=sc.nextLine();str=sc.nextLine();
					hs.remove(str);break;
				}
				case 3: {
					hs.forEach(s ->System.out.println(s));
					break;
				}
				case 4:{
					sc.close();System.exit(0);
				}
				default: {
					System.out.println("Please enter a correct option");
				}
			}
		}
	}
}
