package com.hasnat.stack;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("Element1");
		stack.push("Element2");
		stack.push("Element3");
		stack.push("Element4");
		stack.push("Element5");
		stack.push("Element6");
		stack.push("Element7");
		System.out.println(stack.peek());
		//stack.set(0, "Element0");
		while(stack.size()>0) {
			System.out.println(stack.pop());
		}
	}
}
