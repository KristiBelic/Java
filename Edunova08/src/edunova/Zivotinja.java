package edunova;

public abstract class Zivotinja {
	
	private String latinskiNaziv;
	
	
	

	public Zivotinja() {
		super();
	}

	public Zivotinja(String latinskiNaziv) {
		super();
		this.latinskiNaziv = latinskiNaziv;
	}

	public String getLatinskiNaziv() {
		return latinskiNaziv;
	}

	public void setLatinskiNaziv(String latinskiNaziv) {
		this.latinskiNaziv = latinskiNaziv;
	}
	
	
	
	
}
