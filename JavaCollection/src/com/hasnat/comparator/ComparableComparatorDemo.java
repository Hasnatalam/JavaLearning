package com.hasnat.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

record Player (Integer jurseyno,String name,String team) implements Comparable<Player>{


	@Override
	public int compareTo(Player p) {
		
		if(this.jurseyno>p.jurseyno)
		return 1;
		else return -1;
	}
}
class JurseySorting implements Comparator<Player> {

	@Override
	public int compare(Player p1, Player p2) {
		
		return p1.jurseyno()-p2.jurseyno();
	}
	
}

public class ComparableComparatorDemo {
	public static void main(String[] args) {
		ArrayList<Player> player = new ArrayList<>();
		
		player.add(new Player(18,"Virat","Bengalore"));
		player.add(new Player(45,"Rohoit","Mumbai"));
		player.add(new Player(63,"Buttler","Rajasthan"));
		player.add(new Player(12,"Russel","Kolkata"));
		player.add(new Player(31,"Warner","Delhi"));
		player.add(new Player(93,"Bumrah","Mumbai"));
		//(1)Using comparable
		Collections.sort(player);
		
		
		//(2)Using comparator
		player.sort(new JurseySorting());				//(1)
		Collections.sort(player, new JurseySorting());  //(2)
		
		//(3)Using Anonymous Comparator
		Comparator<Player> compname = new Comparator<Player>() 
		{
			@Override
			public int compare(Player p1, Player p2) 
			{
			  return p1.name().compareTo(p2.name());
			}
		};
		
		Collections.sort(player, compname); 
		//(4)Using lambda Expression
		Comparator<Player> comp = (a,b)->(a.team().compareTo(b.team()));
		Collections.sort(player, comp); 
		
		player.forEach(System.out::println);
		
	}
}
