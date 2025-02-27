/*Program 01 :
------------
Create a BLC(Business Logic Class) called Bowler. Add below details to the class. 

1. Instance variables:
 name: private-String,
 wickets: private-int,
 matches: private-int,
 balls_bowled: private-int,
 runs_conceded: private-int. 

2. Create a parameterized constructor to initialized all obejct properties.


3. Create below public methods,
 Method name: computeBowlingAverage
 Return type: void

 This method should print the bowling average of the bowler by dividing runs_conceded with wickets.

 Input:
 name = "Sachin",
 wickets = 10,
 matches = 5,
 balls_bowled = 750,
 runs_conceded 463.

 Output:
 Name: Sachin
 bowling_avg=46.3
 Note: a. If any values are negative print 'Error'.

 b. If runs_conceded or balls_bowled are greater than 0 when matches are 0 print 'Error'.

 Method name: computeStrikeRate
 Return type: void

This method should print the Strike Rate of the bowler by dividing runs_conceded with balls_bowled.

 Input:
 name = "Sachin",
 wickets = 10,
 matches = 5,
 balls_bowled = 750,
 runs_conceded 463.

 Output:
 Name: Sachin
 Strike_rate=0.61733335
 Note: a. If any values are negative print 'Error'.

 b. If runs_conceded or balls_bowled are greater than 0 when matches are 0 print 'Error'.

 Method name: showStatistics
 Return type: void

 This method should print the details of the batter.
 Input:
 name = "Sachin",
 wickets = 10,
 matches = 5,
 balls_bowled = 750,
 runs_conceded 463.

 Output:
 Name=Sachin
 wickets=10
 matches=5

 balls_bowled=750
 runs_conceded=463

 Note: a. If any values are negative print 'Error'.

 b. If runs_conceded or balls_bowled are greater than 0 when matches are 0 print 'Error'.

 An ELC(Executable Logic Class) Test that contains main method. Use this class to test your code.
*/
package com.hasnat.constructor;

public class Bowler
{
	private String name;
	private int wicket;
	private int matches;
	private int ballsBowled;
	private int runsConceded;
	
	public Bowler(String name, int wicket, int matches, int ballsBowled, int runsConceded) {
		super();
		this.name = name;
		this.wicket = wicket;
		this.matches = matches;
		this.ballsBowled = ballsBowled;
		this.runsConceded = runsConceded;
	}
	
	public void computeBowlingAverage() {
		if(wicket<0&&matches<0&&ballsBowled<0&&runsConceded<0) {
			System.err.println("Error");
		}
		else {
		System.out.println("Name :"+name);
		System.out.println("Bowling avg"+((double)runsConceded/matches));
		}
	}
	
	public void  computeStrikeRate(){
		
		if(wicket<0&&matches<0&&ballsBowled<0&&runsConceded<0) {
			System.err.println("Error");
		}
		else {
		System.out.println("Name :"+name);
		System.out.println("Bowling avg"+((double)runsConceded/ballsBowled));
		}
		
	}
	
	public void showStatistics() {
		if(wicket <= 0 && matches <= 0 && ballsBowled <= 0 && runsConceded <= 0) {
			System.err.println("Error");
		}
		else {
		System.out.println("Name :"+name);
		System.out.println("Wickets :"+wicket);
		System.out.println("Matches :"+matches);
		System.out.println("Balls bowled :"+ballsBowled);
		System.out.println("Runs Conceded :"+runsConceded);
		}
	}
	
}




