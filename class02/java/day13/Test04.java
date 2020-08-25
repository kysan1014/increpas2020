package day13;

import javax.swing.JFrame;

public class Test04 {

	JFrame frame;
	
	public Test04() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		frame.setSize(300, 500);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Test04();
	}
	
}
