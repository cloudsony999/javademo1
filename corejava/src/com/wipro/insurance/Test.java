package com.wipro.insurance;

import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("enter name for Upper", "type here");
		Logic.takeNameUpper(name);
		Logic.takeNameLower(JOptionPane.showInputDialog("enter name for Lower ", "type here"));
	}

}
