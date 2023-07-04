package edunova;

public class Grad {

	private String ime;
	private int brojStanovnika;
	private boolean sjedistezupanije;
	private float projecnaPlaca;
	
	
	
	
	public Grad() {
		super();
	}
	public Grad(String ime, int brojStanovnika, boolean sjedistezupanije, float projecnaPlaca) {
		super();
		this.ime = ime;
		this.brojStanovnika = brojStanovnika;
		this.sjedistezupanije = sjedistezupanije;
		this.projecnaPlaca = projecnaPlaca;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public int getBrojStanovnika() {
		return brojStanovnika;
	}
	public void setBrojStanovnika(int brojStanovnika) {
		this.brojStanovnika = brojStanovnika;
	}
	public boolean isSjedistezupanije() {
		return sjedistezupanije;
	}
	public void setSjedistezupanije(boolean sjedistezupanije) {
		this.sjedistezupanije = sjedistezupanije;
	}
	public float getProjecnaPlaca() {
		return projecnaPlaca;
	}
	public void setProjecnaPlaca(float projecnaPlaca) {
		this.projecnaPlaca = projecnaPlaca;
	}
	
	
	
	
	
}
