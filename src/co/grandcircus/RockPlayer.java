package co.grandcircus;

/*
 * One of these players should always select rock.
 */

public class RockPlayer extends Player{

	public RockPlayer(String string) {
		super(string);
	}

	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}
	


}
