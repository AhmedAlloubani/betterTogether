package day21_static_members;

public class Games {
	
	public static void main(String[] args) {
		
		Game game1 = new Game();
		game1.addPlayer(5);
		game1.addPlayer(4);
		game1.gameName = "Chess";
	
		System.out.println(game1.getNumOfPlayers());	
		
		Game game2 = new Game();
		game2.addPlayer(3);
		game2.gameName = "Checkers";
	
		System.out.println(game2.getNumOfPlayers());
		
		System.out.println(game1.getNumOfPlayers());
		
		System.out.println(Game.numOfPlayers); // directly accessing static variable using class name;
		
		System.out.println(game1); // depending on if you have provided the to String() method this will
		// either print a hashcode or a some meaningful info from the toString method.
		
		System.out.println(game2);
		
		System.out.println(Game.gameName);
		
		
	}

}
