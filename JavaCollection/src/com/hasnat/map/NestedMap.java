package com.hasnat.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NestedMap {
	public static void main(String[] args) {
		Map<String,Map<String,Integer>> populations = new HashMap<>();
		
		Map<String,Integer> india = new HashMap<>();
		List<Population> pop = Arrays.asList(
					new Population("India","Jharkhand",100000000),
					new Population("India","West Bengal",150000000),
					new Population("India","Telanga",120000000),
					new Population("USA","California",100000000),
					new Population("Palestian","Gaza",10000000)
				);
		
		for(Population p : pop) {
			populations.computeIfAbsent(p.country, k -> new HashMap<>()).put(p.state, p.population);
		}
		
		populations.forEach((k,v) -> v.forEach((a,b)->System.out.println(k+" "+a+" "+b)));
		
	}	
	static class Population {
		private String country;
		private String state;
		private Integer population;
		public Population(String country, String state, Integer population) {
			super();
			this.country = country;
			this.state = state;
			this.population = population;
		}
		
	}
}
