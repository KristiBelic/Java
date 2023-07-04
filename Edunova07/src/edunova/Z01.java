package edunova;

public class Z01 {
	
	// Kreirati klasu Grad s minimalno 5 različitih svojstava (različitih tipova podataka)
	// Ovhjed u main metodi napraviti instancu klase Grad, dodjeliti vrijednosti za sva svojstva
	// te po želji ispisati jedno svojstvo
	
	public static void main(String[] args) {
		
		Grad grad= new Grad("Osijek", 200000, true, 1100.50f);
		
		System.out.println(grad.getIme() + " " + grad.getBrojStanovnika());
		
		
		
		
		
	}

}
