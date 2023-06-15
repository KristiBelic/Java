package edunova;

import javax.swing.JOptionPane;

public class Z02 {

	public static void main(String[] args) {
		
		
		int i= Integer.parseInt(
				JOptionPane.showInputDialog("Prvi broj"));
		int a= Integer.parseInt(JOptionPane.showInputDialog("Drugi broj"));
		
		System.out.println(i/(float)a);
	}

}
