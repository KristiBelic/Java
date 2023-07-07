package edunova;

public class Pas extends Sisavac{
	
	private String pasmina;
	


	public Pas() {
		super();
	}



	public Pas(String latinskiNaziv, int daniGravidnosti, String pasmina) {
		super(latinskiNaziv, daniGravidnosti);
		this.pasmina = pasmina;
	}



	public String getPasmina() {
		return pasmina;
	}

	public void setPasmina(String pasmina) {
		this.pasmina = pasmina;
	}
	
	

}
