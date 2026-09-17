package de.oszimt.starsim2099;

/**
 * Write a description of class Ladung here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ladung {

	// Attribute
private String typ;
private int masse;
private double posX;
private double posY;

	// Methoden
public Ladung (String typ, int masse, double posX, double posY) {

	
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

public double getPosX() {
	return this.PosX;
}
public void setPosX(double neuPosX) {
	this.posX = neuPosX;
}

public double getPosY() {
	return this.PosY;
}
public void setPosY(double neuPosY) {
	this.posY = neuPosY;
}




}

