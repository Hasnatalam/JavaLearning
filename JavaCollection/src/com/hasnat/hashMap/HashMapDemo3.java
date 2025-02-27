package com.hasnat.hashMap;

import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo3 {
	public static void main(String[] args) {
		Map<User,Integer> map = new TreeMap<>((u1,u2)->u1.id().compareTo(u2.id()));
		map.put(new User(1,"aaa"), 1);
		map.put(new User(2,"ccc"), 2);
		map.put(new User(3,"bbb"), 3);
		map.forEach((k,v)->System.out.println(k.id()+" "+k.name()+" "+v));
	}
}
record User(Integer id, String name) {}