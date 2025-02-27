package com.hasnat.abstraction;

public class Soccer extends Sports {
	
	
	public Soccer(int numberOfPlayers) {
		super(numberOfPlayers);
	}

	@Override
	public String getName() {
		
		return "Soccer";
	}

	@Override
	public String getNumberOfTeamMembers() {
		
		return "Each team has "+super.numberOfPlayers+ " players";
	}

}
