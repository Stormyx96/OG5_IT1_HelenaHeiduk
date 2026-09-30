
public class Manschaftsleiter extends Mitglied{
	
	private String mannschaftsname;
	private double rabatt;
	

	public Manschaftsleiter(String name, int telefonnummer, int jahresbeitrag, String mannschaftsname, double rabatt) {
		super(name, telefonnummer, jahresbeitrag);
		this.mannschaftsname = mannschaftsname;
		this.rabatt = rabatt;
	}
	
	
	public String getMannschaftsname() {
		return mannschaftsname;
	}
	public void setMannschaftsname(String mannschaftsname) {
		this.mannschaftsname = mannschaftsname;
	}


	public double getRabatt() {
		return rabatt;
	}
	public void setRabatt(double rabatt) {
		this.rabatt = rabatt;
	}

	
	

}
