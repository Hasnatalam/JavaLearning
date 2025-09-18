package com.hasnat.collectionAndMap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class MyList {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		arrayList.add("e1");
		arrayList.add("e2");
		arrayList.add("e3");
		arrayList.add("e4");
		arrayList.add("e5");
		
		System.err.println(
		
		arrayList.contains("e1")+" "+
		arrayList.get(0)+" "+
		arrayList.size()+" "+
		arrayList.lastIndexOf("e5"));
		arrayList.forEach(str-> System.out.print(str+" "));
		
		LinkedList<String> linkedList = new LinkedList<>();
		
		linkedList.add("l1");
		linkedList.add("l2");
		linkedList.add("l3");
		linkedList.add("l4");
		linkedList.add("l5");
		linkedList.add("l6");
		System.out.println("\n"+
				
				linkedList.size()+" "+
				linkedList.get(0)
				
				);
		linkedList.forEach(System.out::print);
		
		Stack<String> stack= new Stack<>();
		System.out.println();
		stack.add("s1");
		stack.add("s2");
		stack.add("s3");
		stack.add("s3");
		stack.forEach(System.out :: print);
		stack.push("p1");
		stack.push("p2");
		stack.push("p3");
		stack.push("p4");
		System.out.println();
		stack.forEach(System.out :: print);
		stack.pop();
		System.out.println();
		stack.forEach(System.out :: print);
		System.err.println(stack.peek());
		stack.forEach(System.out :: print);
		System.err.println(stack.containsAll(List.of("p1","p2")));
		
		
		
		
		
	}
}
