
public class Schiedsrichiter extends Mitglied{

	private int gepfiffendeSpiele;

public Schiedsrichiter(String name, int telefonnummer, int jahresbeitrag, int gepfiffendeSpiele) {
	super(name, telefonnummer, jahresbeitrag);
	this.gepfiffendeSpiele = gepfiffendeSpiele;
	}
	
	
	public int getGepfiffendeSpiele() {
		return gepfiffendeSpiele;
	}
	public void setGepfiffendeSpiele(int gepfiffendeSpiele) {
		this.gepfiffendeSpiele = gepfiffendeSpiele;
	}
	
}
