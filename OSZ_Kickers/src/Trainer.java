
public class Trainer extends Mitglied{

	private char lizenzklasse;
	private int monatAufwandsentschaedigung;
	
	
public Trainer(String name, int telefonnummer, int jahresbeitrag, char lizenzklasse, int monatAufwandsentschaedigung) {
	super(name, telefonnummer, jahresbeitrag);
	this.lizenzklasse = lizenzklasse;
	this.monatAufwandsentschaedigung = monatAufwandsentschaedigung;
	}
	

	public char getLizenzklasse() {
		return lizenzklasse;
	}
	public void setLizenzklasse(char lizenzklasse) {
		this.lizenzklasse = lizenzklasse;
	}
	
	
	public int getMonatAufwandsentschädigung() {
		return monatAufwandsentschaedigung;
	}
	public void setMonatAufwandsentschädigung(int monatAufwandsentschädigung) {
		this.monatAufwandsentschaedigung = monatAufwandsentschädigung;
	}
	
}

