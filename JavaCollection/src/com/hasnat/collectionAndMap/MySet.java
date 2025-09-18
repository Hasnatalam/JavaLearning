package com.hasnat.collectionAndMap;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class MySet {
	public static void main(String[] args) {
		HashSet<Player> players = new HashSet<>();
		players.add(new Player(1,"Virat"));
		players.add(new Player(1,"Virat"));
		players.add(new Player(2,"Rohit"));
		players.add(new Player(2,"Sachin"));
		
		players.forEach(System.out::println);
		
	}
}
class Player{
	int jerseyNo;
	String name;
	Player(int jn,String name){
		this.jerseyNo=jn;
		this.name=name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj )return true;
		else if (this.getClass()!= obj.getClass()||obj==null)return false;
		if (obj instanceof Player) {
			Player p = (Player) obj;
			
		
		return this.jerseyNo==p.jerseyNo & this.name==p.name;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(jerseyNo,name);
	}

	@Override
	public String toString() {
		return "Player [jerseyNo=" + jerseyNo + ", name=" + name + "]";
	}
	
}