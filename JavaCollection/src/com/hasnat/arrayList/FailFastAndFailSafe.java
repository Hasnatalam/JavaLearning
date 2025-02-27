package com.hasnat.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastAndFailSafe {
	public static void main(String[] args) throws InterruptedException {
		ArrayList<String> list = new ArrayList <>();
		list.add("Element1");
		list.add("Element2");
		list.add("Element3");
		list.add("Element4");
		list.add("Element5");
		list.add("Element6");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			//list.add("new ");//Here we will get ConcurrentModificationException
			//list.remove("Element4");//Here we will get ConcurrentModificationException
		}
		System.out.println(list);
		
		Thread.sleep(3000);
		CopyOnWriteArrayList<String> list2= new CopyOnWriteArrayList<>();
		list2.add("element1");
		list2.add("element2");
		list2.add("element3");
		list2.add("element4");
		list2.add("element5");
		Iterator<String> it2 = list2.iterator();
		while(it2.hasNext()) {
			String str= it2.next();
			System.out.println(str);
			
		if(str=="element4")list2.add("new element");
			
		}
		list2.forEach(System.out::println);
	}
}
