package day21_static_members;

public class Game {
	
	static int numOfPlayers;
	static String gameName;
	public void addPlayer(int players) {
		numOfPlayers = numOfPlayers + players; //  numOfPlayers += players; 
	}
	public int getNumOfPlayers() {
		return numOfPlayers;
	}
	public String toString() {
		return gameName;
	}
}
