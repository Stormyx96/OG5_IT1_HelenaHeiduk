package de.oszimt.starsim2099;

/**
 * Write a description of class Ladung here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ladung extends Standort{

	// Attribute
private String typ;
private int masse;

	// Methoden
public Ladung () {

	
}


	// Darstellung
	public static char[][] getDarstellung() {
		char[][] ladungShape = { { '/', 'X', '\\' }, { '|', 'X', '|' }, { '\\', 'X', '/' } };
		return ladungShape;
	}

public String getTyp() {
	return this.typ;
}
public void setTyp(String neuTyp) {
	this.typ = neuTyp;
}

public int getMasse() {
	return this.masse;
}
public void setMasse(int neuMasse) {
	this.masse = neuMasse;
}


}






