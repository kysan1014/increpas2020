package day10;

import javax.swing.JOptionPane;

/*
	반지름을 입력받아 원의 넓이와 둘레를 계산하고 출력하시오.
 */

public class Ex01 {

	public static void main(String[] args) {
		new TestEx01();
	}
	
}

class TestEx01 {
	
	private int radius = 0;
	private int[] results;
	public TestEx01() {
		
		this.radius = getRadius();
		
		results = new int[2];
		results[0] = getArea(radius);
		results[1] = getcirconference(radius);
		
		printResults(radius, results);
		
	}
	private void printResults(int radius, int[] results) {
		String msg = String.format("반지름의 길이가 %d인 원의 넓이는 %d이고 둘레는 %d이다.", radius, results[0], results[1]);
		JOptionPane.showMessageDialog(null, msg);
		
	}
	private int getcirconference(int radius) {
		return (int) (Math.PI * radius * 2);
	}
	private int getArea(int radius) {
		return (int) (Math.PI * radius * radius);
	}
	private int getRadius() {
		return Integer.parseInt(JOptionPane.showInputDialog("반지름의 길이를 입력하세요.").trim());
	}

	
}
