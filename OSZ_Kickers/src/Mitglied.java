
public class Mitglied {

	private String name;
	private int telefonnummer;
	private int jahresbeitrag;
	
	
public Mitglied(String name, int telefonnummer, int jahresbeitrag) {
	super();
	this.name = name;
	this.telefonnummer = telefonnummer;
	this.jahresbeitrag = jahresbeitrag;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getTelefonnummer() {
		return telefonnummer;
	}
	public void setTelefonnummer(int telefonnummer) {
		this.telefonnummer = telefonnummer;
	}
	

	public int getJahresbeitrag() {
		return jahresbeitrag;
	}
	public void setJahresbeitrag(int jahresbeitrag) {
		this.jahresbeitrag = jahresbeitrag;
	}
	
	
}
