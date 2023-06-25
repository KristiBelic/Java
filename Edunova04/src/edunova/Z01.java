package edunova;

import javax.swing.JOptionPane;

public class Z01 {

	public static void main(String[] args) {

		// Korisnik unosi dva cijela broja
		// Program ispisuje
		// zbroj svih neparnih brojeva
		// između dva unesena broja

		int prvi = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int drugi = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));

		int manji = prvi < drugi ? prvi : drugi;
		int veci = prvi > drugi ? prvi : drugi;
		int zbroj = 0;

		for (int i = prvi; i <= drugi; i++) {
			if (i % 2 != 0) {
				zbroj += 1;
			}
		}
		System.out.println(zbroj);
	}

}
