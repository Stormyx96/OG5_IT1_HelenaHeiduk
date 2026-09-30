
public class Spieler extends Mitglied{
	
	private int trikotnummer;
	private String spielposition;

	
public Spieler(String name, int telefonnummer, int jahresbeitrag, int trikotnummer, String spielposition) {
	super(name, telefonnummer, jahresbeitrag);
	this.trikotnummer = trikotnummer;
	this.spielposition = spielposition;
	}
	

	public int getTrikotnummer() {
		return trikotnummer;
	}
	public void setTrikotnummer(int trikotnummer) {
		this.trikotnummer = trikotnummer;
	}
	
	
	public String getSpielposition() {
		return spielposition;
	}
	public void setSpielposition(String spielposition) {
		this.spielposition = spielposition;
	}
	

}