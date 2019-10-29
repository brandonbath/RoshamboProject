package co.grandcircus;

import java.util.Scanner;

/*
 * Create a class called RoshamboApp that allows the user to play against either of
your first two player classes

Use a Validator class to validate the user’s entries.
 */

/*
 * Prompt the player to enter a name and select an opponent.
 Prompt the player to select rock, paper, or scissors. Then display the player’s choice,
the opponent’s choice, and the result of the match.
 Continue until the user doesn’t want to play anymore.
 If the user makes an invalid selection, display an appropriate error message and
prompt the user again until the user makes a valid selection.

 * 
 */

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userName = Validator.getString(scan, "Please enter your name: ");
		HumanPlayer humie = new HumanPlayer(userName, scan);
		System.out.println(humie);
		
		Player opponent = null;
		String opponentName = Validator.getStringMatchingRegex(scan, "Who do you want to play (Rock or Random?)", "[rR]ock|[rR]andom");
		switch (opponentName) {
			case "rock":
			case "Rock":
				opponent = new RockPlayer("Rock");
				break;
			case "random":
			case "Random":
			default:
				opponent = new RandomPlayer("Random");
		}
		
		
		
		//System.out.println(opponent);
	}

}
