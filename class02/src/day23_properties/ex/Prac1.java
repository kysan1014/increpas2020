package day23_properties.ex;

import javax.swing.JOptionPane;

public class Prac1 {
	public Prac1() {
		execute();
	}

	public void execute() {
		String si = JOptionPane.showInputDialog("input");
		try {
		int i = Integer.parseInt(si);
		System.out.println(i);
		} catch (Exception e) {
			execute();
		}
	}
	
	public static void main(String[] args) {
		new Prac1();
	}
}
