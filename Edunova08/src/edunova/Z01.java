package edunova;

public class Z01 {
	
	
	public static void main(String[] args) {

	

	// Kreirajte klase Zivotinja, Sisavac, Riba, Pas i Som
	// U svakoj klasi definirajte jedno svojstvo koje je "na pravom mjestu"

	// Kreirati za Psa i Soma po jednu instancu te dodjeliti vrijednosti
	// za sva svojtva

	
	Pas pas= new Pas("Canis lupus familiaris", 36, "Jack Russell terijer");
	
	Som som = new Som("Silurus glanis", "Dno bare", 6);
	

		System.out.println(pas.getLatinskiNaziv());
		System.out.println(som.getBrojBrkova());

	}



}
