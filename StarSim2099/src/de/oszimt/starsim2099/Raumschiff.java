package de.oszimt.starsim2099;

/**
 * Write a description of class Raumschiff here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Raumschiff extends Standort{

	// Attribute
	private int maxKapazitaet;
	private String typ;
	private String antrieb;
	private int winkel;
	
	
	
	// Methoden
public Raumschiff() {
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

	public int getMaxLadekapazitaet() {
		return this.getMaxLadekapazitaet();
	}
	public void setMaxLadekapazitaet(int neuMaxLadekapazitaet) {
		this.maxKapazitaet = neuMaxLadekapazitaet;
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
		return this.winkel;
	}
	public void setWinkel(int neuWinkel) {
		this.winkel = neuWinkel;
	
	

	}
	
	
	
	
	
}
