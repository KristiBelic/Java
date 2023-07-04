package edunova;

public class Z02 {

	// Kreirati klasu Racunalo
	// Definirati minimalno 3 svojstava 
	// različitih tipova podataka
	
	// U U ovoj klasi napraviti dvije 
	// instance klase Racunalo
	
	
public static void main(String[] args) {
	
	Racunalo racunalo= new Racunalo("Laptop", 16, 1.60f);
	
	Racunalo r= new Racunalo("Stolno", 64, 2.40f);
	

	
	System.out.println(racunalo.getProcesor() + " " + r.getVrsta());
	
	
}	
	


	}
	

