package co.grandcircus;

/*
 * The other player should randomly select rock, paper, or scissors (a 1 in 3
chance of selecting each).

 */

public class RandomPlayer extends Player{

	public RandomPlayer(String name) {
		super(name);
	}

	@Override
	public Roshambo generateRoshambo() {
		double selector = 3 * Math.random();
		//int anotherSelector = new java.util.Random().nextInt(3);
				
		if (selector >= 0 && selector < 1) {
			return Roshambo.PAPER;
		} else if (selector >= 1 && selector < 2) {
			return Roshambo.ROCK;
		} else {//if selector >= 2 && selector < 3, but we don't need to write it out
			return Roshambo.SCISSORS;
		}
	}

}
