/*Create an abstract class Sports class with following specifications:-
Methods: 
getName(String): String, 
   getName method returns a String value as "Sports".
getNumberOfTeamMembers() :String
	 getNumberOfTeamMembers method returns a String value as "Each team has ‘n’ players in Sports".	

Create sub classes of Sports called Soccer  with following specifications 
Methods: 
override getName(String) from parent class.
	         This method returns a String value as any sports name.
 override getNumberOfTeamMembers from parent class.
	This method returns a String value as "In sports(given via getName()),each team has 11 players".

Sample Output
In Soccer, each team has 11 players.

A class Testing is given to you with a main method.  Use this class to test your solution's classes and methods.*/
package com.hasnat.abstraction;
	

public abstract class Sports {
	
	int numberOfPlayers;
	
	
	public Sports(int numberOfPlayers) {
		super();
		this.numberOfPlayers = numberOfPlayers;
	}
	public abstract String getName();
	public abstract String getNumberOfTeamMembers();
}
