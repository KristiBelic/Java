package edunova;

import javax.swing.JOptionPane;

public class CiklicnaMatrica04 {

	public static void main(String[] args) {
		
		
		boolean dev=false;
		
		int red =dev ? 5 : Integer.parseInt(JOptionPane.showInputDialog("Unesite broj redova"));
		int stupac = dev ? 5 :Integer.parseInt(JOptionPane.showInputDialog("Unesite broj stupaca"));

		int matrica[][] = new int[red][stupac];

		int b = 1;

		int prviRed = red - 1;
		int zadnjiRed = 0;

		int prviStupac = stupac - 1;
		int zadnjiStupac = 0;

		while (b <= red * stupac) {

			for (int i = prviStupac; i >= zadnjiStupac; i--) {

				if (b > red * stupac) {

					break;

				} else {
					matrica[prviRed][i] = b++;
				}

			}
			prviRed--;
			for (int i = prviRed; i >= zadnjiRed; i--) {
				if (b > red * stupac) {
					break;

				} else {
					matrica[i][zadnjiStupac] = b++;
				}

			}
			zadnjiStupac++;

			for (int i = zadnjiStupac; i <= prviStupac; i++) {
				if (b > red * stupac) {
					break;

				} else {
					matrica[zadnjiRed][i] = b++;
				}
			}
			zadnjiRed++;

			for (int i = zadnjiRed; i <= prviRed; i++) {
				if (b > red * stupac) {

				} else {
					matrica[i][prviStupac] = b++;
				}
			}
			prviStupac--;

			for (int i = 0; i < red; i++) {
				for (int j = 0; j < stupac; j++) {
					System.out.print(matrica[i][j] + "\t");
				}
				System.out.println();
			}
		}
	}
}
