package day18;

import javax.swing.JOptionPane;

public class Test01 {

	public Test01() {

		String sno = JOptionPane.showInputDialog("1~10 사이의 정수를 입력하세요.");
		
		int no = 0;
		
		try {
			no = checkStringNumber(sno);
		} catch (Exception01 e1) {
			e1.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		if (no != 0) {
			System.out.println("입력한 정수는 : " + no);
		}
	}
	
	public static void main(String[] args) {
		new Test01();
	}

	public int checkStringNumber(String sno) throws Exception01 {
		
		int no = Integer.parseInt(sno.trim());
		
		if (no > 0 && no <= 10) {
			return no;
		} else {
			throw new Exception01();
		}
		
	}
	
}

class Exception01 extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3475500224350837324L;
	
	public String toString() {
		return "1 ~ 10 사이의 문자가 아닙니다.";
	}
	
}