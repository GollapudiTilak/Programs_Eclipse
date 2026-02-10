package com.project;

public class CricketTeam {
	// Instance variable: stores multiple player names in an array
	// This variable belongs to the object of CricketTeam
	String[] players = { "Rohit Sharma", "Virat Kohli", "Jasprit Bumrah", "Ravindra Jadeja", "Hardik Pandya" };

	void printPlayers() {
		// Instance method: used to print player names

		for (String player : players) {
			// Enhanced for loop:
			// 'player' stores one name from the players array in each iteration
			System.out.println(player);
		}
	}

	public static void main(String[] args) {
		// Creating only ONE object of CricketTeam
		// Memory is allocated for instance variables
		CricketTeam team = new CricketTeam();
		// Calling the instance method using the object
		// This prints all player names
		// Access instance variables using that one object
		team.printPlayers();
	}

}
