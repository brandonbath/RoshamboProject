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
		
		System.out.println("================================================================================");
		
		String continueYN = "n";
		do {
			Player opponent = null;
			String opponentName = Validator.getStringMatchingRegex(scan, "Who do you want to play (Rock or Random?)", "[rR]ock|[rR]andom");
			System.out.println("");
			
			switch (opponentName) {
				case "rock":
				case "Rock":
					opponent = new RockPlayer("Rock player");
					break;
				case "random":
				case "Random":
				default:
					opponent = new RandomPlayer("Random player");
			}
			
			Roshambo humanResult = humie.generateRoshambo();
			Roshambo opponentResult = opponent.generateRoshambo();
			
			String humanWon = "lost! You're a friggen' LOSER";
			if (humanResult == Roshambo.PAPER && opponentResult == Roshambo.ROCK) {
				humanWon = "won";
			} else if (humanResult == Roshambo.ROCK && opponentResult == Roshambo.SCISSORS) {
				humanWon = "won";
			} else if (humanResult == Roshambo.SCISSORS && opponentResult == Roshambo.PAPER) {
				humanWon = "won";
			} else if (humanResult == Roshambo.PAPER && opponentResult == Roshambo.PAPER) {
				humanWon = "tied (awww)";
			} else if (humanResult == Roshambo.ROCK && opponentResult == Roshambo.ROCK) {
				humanWon = "tied (awww)";
			} else if (humanResult == Roshambo.SCISSORS && opponentResult == Roshambo.SCISSORS) {
				humanWon = "tied (awww)";
			}
				//All others, the human lost!
			
			System.out.println("");
			System.out.println(" You chose: " + humanResult);
			System.out.println(opponent.getName() + " chose: " + opponentResult);
			System.out.println(humie.getName() + ", you " + humanWon + "!");
			
			System.out.println("================================================================================");
			continueYN = Validator.getStringMatchingRegex(scan, "Continue (y/n)?", "[yY]|[nN]");
		} while (continueYN.equalsIgnoreCase("y"));
		
		System.out.println("================================================================================");
		System.out.println("Goodbye!");
	}

}
