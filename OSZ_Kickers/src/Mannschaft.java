
public class Mannschaft {

	private int spielerAnzahl;
	private int ersatzspielerAnazhl;
	private int gewonneneSpiele;
	private Spieler [] spieler;
	
	
public Mannschaft(int spielerAnzahl, int ersatzspielerAnazhl, int gewonneneSpiele) {
	super();
	this.spielerAnzahl = spielerAnzahl;
	this.ersatzspielerAnazhl = ersatzspielerAnazhl;
	this.gewonneneSpiele = gewonneneSpiele;
	}
	
	
	public int getSpielerAnzahl() {
		return spielerAnzahl;
	}
	public void setSpielerAnzahl(int spielerAnzahl) {
		this.spielerAnzahl = spielerAnzahl;
	}
	
	
	public int getErsatzspielerAnazhl() {
		return ersatzspielerAnazhl;
	}
	public void setErsatzspielerAnazhl(int ersatzspielerAnazhl) {
		this.ersatzspielerAnazhl = ersatzspielerAnazhl;
	}
	
	
	public int getGewonneneSpiele() {
		return gewonneneSpiele;
	}
	public void setGewonneneSpiele(int gewonneneSpiele) {
		this.gewonneneSpiele = gewonneneSpiele;
	}
	
	
	
	
	
}
