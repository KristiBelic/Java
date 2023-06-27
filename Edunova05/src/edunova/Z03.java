package edunova;

import javax.swing.JOptionPane;

public class Z03 {
	// Program unosi broj elemenata niza cijelih brojeva
	// Unose se brojevi s while petljom u niz
	// ispisuju se uneseni brojevi iz niza s foreach petljom

	public static void main(String[] args) {

		
		int velicinaNiza = Integer.parseInt(JOptionPane.showInputDialog("Unesi velicinu Niza"));
		
		int [] nizbrojeva= new int[velicinaNiza];
		
		int brojac=0;
		
		while (brojac<velicinaNiza){
			nizbrojeva[brojac++] = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
			
		}for (int en: nizbrojeva) {
			System.out.println(en);
		}
		
		
		
		
		
		
	}

}
