package de.oszimt.starsim2099;

/**
 * Write a description of class Planet here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Planet {

	// Attribute
	private int anzahlHafen;
	private String name;
	private double posX;
	private double posY;
	
	// Methoden
public Planet()int anzahlHafen, String name, double posX, double posY) {
}
	// Darstellung
	public static char[][] getDarstellung() {
		char[][] planetShape = { { '\0', '/', '*', '*', '\\', '\0' }, { '|', '*', '*', '*', '*', '|' },
				{ '\0', '\\', '*', '*', '/', '\0' } };
		return planetShape;

	}
	
	public int getAnzahlHafen() {
		return this.anzahlHafen;
	}
	public void setAnzahlHafen(int neuAnzahlHafen) {
		this.anzahlHafen = neuAnzahlHafen;
	}

		
	public String getName() {
		return this.name;
	}
	public void setName(String neuName) {
		this.name = neuName;
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
