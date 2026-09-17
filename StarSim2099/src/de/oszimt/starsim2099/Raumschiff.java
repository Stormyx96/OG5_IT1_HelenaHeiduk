package de.oszimt.starsim2099;

/**
 * Write a description of class Raumschiff here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Raumschiff {

	// Attribute
	private int maxKapazitaet;
	private String typ;
	private String antrieb;
	private int winkel;
	private double posX;
	private double posY;
	
	// Methoden
public Raumschiff(int maxKapazitaet, String typ, String antrieb, int winkel, double posX, double posY) {
}	

// Darstellung
	public static char[][] getDarstellung() {
		char[][] raumschiffShape = { 
				{'\0', '\0','_', '\0', '\0'},
				{'\0', '/', 'X', '\\', '\0'},
				{'\0', '{', 'X', '}', '\0'},
				{'\0', '{', 'X', '}', '\0'},
				{'/', '_', '_','_', '\\'},				
		};
		return raumschiffShape;
	}

	public int getMaxLadeKapazitaet() {
		return this.maxLadeKapazitaet;
	}
	public void setMaxLadeKapazitaet(int neuMaxLadeKapazitaet) {
		this.maxLadeKapazitaetn = neuMaxLadeKapazitaet;
	}

		
	public String getTyp() {
		return this.typ;
	}
	public void setTyp(String neuTyp) {
		this.typ = neuTyp;
	}
	
	
	public String getAntrieb() {
		return this.antrieb;
	}
	public void setAntrieb(String neuAntrieb) {
		this.antrieb = neuAntrieb;
	}


	public int getWinkel() {
		return this.Winkel;
	}
	public void setWinkel(int neuWinkel) {
		this.winkel = neuWinkel;
	
	
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
