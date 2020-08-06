package day16;

import javax.swing.JOptionPane;

public class Test01 {

	public Test01() {

		String sno = JOptionPane.showInputDialog("정수를 입력하세요.");
		System.out.println("###########################");
		int no = 0;
		try {
			no = Integer.parseInt(sno);	
		} catch (Exception e) {
			no = -999;
		}
		System.out.println("입력한 정수 : " + no);
	}
	
	public static void main(String[] args) {
		new Test01();
	}
}
