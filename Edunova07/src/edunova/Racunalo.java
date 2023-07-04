package edunova;

public class Racunalo {

	private String vrsta;
	private int RAM;
	private float procesor;
	
	

	public Racunalo() {
		super();
	}
	public Racunalo(String vrsta, int rAM, float procesor) {
		super();
		this.vrsta = vrsta;
		RAM = rAM;
		this.procesor = procesor;
	}
	public String getVrsta() {
		return vrsta;
	}
	public void setVrsta(String vrsta) {
		this.vrsta = vrsta;
	}
	public int getRAM() {
		return RAM;
	}
	public void setRAM(int rAM) {
		RAM = rAM;
	}
	public float getProcesor() {
		return procesor;
	}
	public void setProcesor(float procesor) {
		this.procesor = procesor;
	}
	
	
	
	
	
	
}
