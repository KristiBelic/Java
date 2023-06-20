package edunova;

import javax.swing.JOptionPane;

public class Z03 {

	public static void main(String[] args) {

		// Korisnik unosi ime mjesta iz jedne od 4 slavonske županije
		// Za uneseno ime mjesta program ispisuje ime županije

		String mjesto = JOptionPane.showInputDialog("Provjera županije");

		switch (mjesto) {

		case "Valpovo":
			System.out.println("Osječko-baranjska županija");
			break;
		case "Vukovar":
			System.out.println("Vujovarsko-srijemska županija");
			break;
		case "Karlovac":
			System.out.println("Karlovačka županija");
			break;
		case "Hvar":
			System.out.println("Splitsko-dalmatinska županija");
			break;
		}

	}

}
