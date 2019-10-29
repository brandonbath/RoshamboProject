package co.grandcircus;

import java.util.Scanner;

/*
 * implements the
generateRoshambo() method. For this class, generateRoshambo() gets input from
the human player and returns the value chosen.

 */

public class HumanPlayer extends Player{
	private Scanner scan;
	
	public HumanPlayer(String name, Scanner scan) {
		super(name);
		this.scan = scan;
	}

	@Override
	public Roshambo generateRoshambo() {
		String strategy = Validator.getStringMatchingRegex(scan, "Select: Rock, paper, or scissor.", "[rR]ock|[pP]aper|[sS]cissor|[sS]cissors");
		switch (strategy) {
			case "rock":
			case "Rock":
				return Roshambo.ROCK;
			case "paper":
			case "Paper":
				return Roshambo.PAPER;
			case "scissor":
			case "Scissor":
			case "scissors":
			case "Scissors":
			default:
				return Roshambo.SCISSORS;
		}
	}
}
