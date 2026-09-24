package de.oszimt.starsim2099;

/**
 * Write a description of class Pilot here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pilot extends Standort{

	// Attribute
	private String grad;
	private String name;
	

	
	// Methoden
	public Pilot() {

}

public String getGrad() {
	return this.grad;
}
public void setGrad(String neuGrad) {
	this.grad = neuGrad;
}

	
public String getName() {
	return this.name;
}
public void setName(String neuName) {
	this.name = neuName;
}



	
}