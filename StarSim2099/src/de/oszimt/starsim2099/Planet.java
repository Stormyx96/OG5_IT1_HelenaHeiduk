package de.oszimt.starsim2099;

/**
 * Write a description of class Planet here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Planet extends Himmelskoerper{

	// Attribute
	private int anzahlHafen;
	private String name;

	
	// Methoden
public Planet() {
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


	
	
	
}
