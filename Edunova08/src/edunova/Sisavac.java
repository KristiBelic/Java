package edunova;

public class Sisavac extends Zivotinja {

	private int daniGravidnosti;
	
	
	

	public Sisavac() {
		super();
	}


	public Sisavac(String latinskiNaziv, int daniGravidnosti) {
		super(latinskiNaziv);
		this.daniGravidnosti = daniGravidnosti;
	}

	public int getDaniGravidnosti() {
		return daniGravidnosti;
	}

	public void setDaniGravidnosti(int daniGravidnosti) {
		this.daniGravidnosti = daniGravidnosti;
	}
	
	
	
}
