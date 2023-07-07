package edunova;

public class Som extends Riba {
	
	
	private int brojBrkova;
	
	

	public Som() {
		super();
	}

	public Som(String latinskiNaziv, String dubinaZarona, int brojBrkova) {
		super(latinskiNaziv, dubinaZarona);
		this.brojBrkova = brojBrkova;
	}

	public int getBrojBrkova() {
		return brojBrkova;
	}

	public void setBrojBrkova(int brojBrkova) {
		this.brojBrkova = brojBrkova;
	}
	
	
	

}
