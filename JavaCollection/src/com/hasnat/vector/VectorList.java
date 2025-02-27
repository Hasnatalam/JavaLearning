package com.hasnat.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;

public class VectorList {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		System.err.println("All the important method used");
		
		
		Vector<String> colour = new Vector<>();
		colour.add("Red");
		colour.add("Black");
		colour.add("White");
		colour.add("Blue");
		colour.add("Green");
		
		
		
		System.out.println("(1) Using to string method vector 1");
		System.out.println(colour);
		
		Vector<String> colour2 = new Vector<>(4,3);
		
		colour2.add("Yellow");
		colour2.add("Orange");
		colour2.add("Aqua");
		colour2.add("Green");
		colour2.add("Black");
		
		System.out.println("Size "+colour2.size());
		System.out.println("Capacity "+colour2.capacity());
		
		
		
		
		System.out.println("(2) Using foreach loop vector 2");
		for(String s:colour2) {
			System.out.print(s+" ");
			
		}
		
		colour2.addAll(colour);
		
		System.out.println("\n\n(3)Using for loop in vector 2 combinig 2");
		for(int i =0;i<colour2.size();i++) {
			System.out.print(colour2.get(i)+" ");
			
		}
		
		
		
		colour2.sort(null);
		System.out.println("\n\n(4) Using Enumeration vector 2 after sorting ");
		
		Enumeration<String> em = colour2.elements();
		while(em.hasMoreElements()) {
			System.out.print(em.nextElement()+" ");
		}
	
		Vector<String> colour3 = new Vector<>();
		colour3.add("Yellow");
		colour3.add("Black");
		colour3.add("White");
		colour3.retainAll(colour);
		
		
		System.out.println("\\nn(5) Using Iterator vector 3 after retain");
		
		Iterator<String> it = colour3.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		colour2.remove(0);
		System.out.println("\n\n(6) Using ListIterator vector 2 after deleting index 0 element");
		
		ListIterator<String> lit= colour2.listIterator();
		while(lit.hasNext()) {
			System.out.print(lit.next()+" ");
		}
		System.out.println("\\nn(6) In reverse order");
		while(lit.hasPrevious()) {
			System.out.print(lit.previous()+" ");
		}
		
		colour2.remove("Yellow");
		
		System.out.println("\n\n(7) Using for each remaining Spliterator vector 2 ");
		Spliterator<String> sit = colour2.spliterator();
		sit.forEachRemaining(colours->System.out.print(colours+" "));
		
		
		
		
		
		System.out.println("\n\n(8) Using for each method vector 1");
		colour.forEach(colours->System.out.print(colours+" "));
		
		System.out.println("\n\n(9) Using for each method refrence vector 1");
		colour.forEach(System.out::print);
		
		
		colour3.removeAll(colour3);
		
		System.out.println("\\nn"+colour3);
		colour2.set(1, "Grey");
		System.out.println("\\nn"+colour2);
		System.out.println(colour2.lastIndexOf(colour2));
		System.out.println(colour2.indexOf("Grey"));
		
	}
}
