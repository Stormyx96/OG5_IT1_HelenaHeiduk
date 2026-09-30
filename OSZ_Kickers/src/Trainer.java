
public class Trainer extends Mitglied{

	private char lizenzklasse;
	private int monatAufwandsentschädigung;
	
	
public Trainer(String name, int telefonnummer, int jahresbeitrag, char lizenzklasse, int monatAufwandsentschädigung) {
	super(name, telefonnummer, jahresbeitrag);
	this.lizenzklasse = lizenzklasse;
	this.monatAufwandsentschädigung = monatAufwandsentschädigung;
	}
	

	public char getLizenzklasse() {
		return lizenzklasse;
	}
	public void setLizenzklasse(char lizenzklasse) {
		this.lizenzklasse = lizenzklasse;
	}
	
	
	public int getMonatAufwandsentschädigung() {
		return monatAufwandsentschädigung;
	}
	public void setMonatAufwandsentschädigung(int monatAufwandsentschädigung) {
		this.monatAufwandsentschädigung = monatAufwandsentschädigung;
	}
	
}

