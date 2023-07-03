package edunova;

import javax.swing.JOptionPane;

public class Ciklicnamatrica {

	public static void main(String[] args) {
	
		boolean dev=true;
		
		int red=dev ? 5 : Integer.parseInt(JOptionPane.showInputDialog("Unesite broj redova"));
		int stupac=dev ? 5 : Integer.parseInt(JOptionPane.showInputDialog("Unesite broj stupaca"));
		
		
		int [] [] matrica = new int [red][stupac];
		
		
		int b = 1;
		for (int i = 1; i <= stupac; i++) {
			matrica[red - 1][stupac - i] = b++;
			
		}

		
		
		for(int i=2;i<=red;i++) {
			matrica[red-i][0]=b++;
		}

		
		
		for(int i=1;i<stupac;i++) {
			matrica[0][i]=b++;
		}

	
	for(int i =1;i<red-1;i++) {
		matrica[i][stupac-1]=b++;
	}
	
	

	
	for(int i=stupac-2;i>0;i--) {
		matrica[red-2][i]=b++;
	}

	
	for(int i =red-3;i>0;i--) {
		matrica[i][1]=b++;
	}
	

	
	for(int i=2;i<stupac-1;i++) {
		matrica[1][i]=b++;
	}

	
	for(int i=2;i<red-3;i++) {
		matrica[i][stupac-2]=b++;
	}

	
	for(int i=stupac-2;i>1;i--) {
		matrica[red-3][i]=b++;
	}
	for (int i = 0; i < red; i++) {
		for (int j = 0; j < stupac; j++) {
			System.out.print(matrica[i][j] + "\t");
		}
		System.out.println();
	}
	System.out.println("**********************************");
	}

}
