package co.grandcircus;

/*
 * Create an abstract class named Player that stores a name. This class should include
an abstract method named generateRoshambo() that allows an inheriting class to
generate and return a Roshambo value.

 */

public abstract class Player {
	private String name;

    public void setName(String name) {
    	this.name = name;
    }
    
    public String getName() {
    	return name;
    }
    
    public Player(String name) {
    	this.name = name;
    }
    
    @Override
    public String toString() {
    	return this.getClass().getSimpleName() + ": " + getName();
    }
    
    public abstract Roshambo generateRoshambo();
}
