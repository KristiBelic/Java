package edunova;

public class Riba extends Zivotinja{

	private String dubinaZarona;
	
	

	public Riba() {
		super();
	}

	public Riba(String latinskiNaziv, String dubinaZarona) {
		super(latinskiNaziv);
		this.dubinaZarona = dubinaZarona;
	}

	public String getDubinaZarona() {
		return dubinaZarona;
	}

	public void setDubinaZarona(String dubinaZarona) {
		this.dubinaZarona = dubinaZarona;
	}
	
	
}
