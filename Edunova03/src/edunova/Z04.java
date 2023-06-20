package edunova;

import javax.swing.JOptionPane;

public class Z04 {

	public static void main(String[] args) {

		// Korisnik unosi dva cijela broj
		// program ispisuje veći
		// 3 i 5 -> 5
		// 5 i 3 -> 5
		// 5 i 5 ->

		int pb = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int db = Integer.parseInt(JOptionPane.showInputDialog("unesi drugi broj"));

		if (pb > db) {
			System.out.println(pb);
		} else if (db > pb) {
			
			System.out.println(db);
		}

	}

}
