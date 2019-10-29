package co.grandcircus;

/*
 * Create an enumeration called Roshambo that stores three values: rock, paper, and
scissors. This enumeration should include a toString method that can convert the
selected value to a String
 */

public enum Roshambo {
	ROCK, PAPER, SCISSORS;
	  @Override
	  public String toString() {
	     switch (this)
	     {
	        case ROCK:
	           return "Rock";
	        case PAPER:
	           return "Paper";
	        case SCISSORS:
	           return "Scissors";
	        default:
	           return "HWaaah?";
	     }
	  }
}


