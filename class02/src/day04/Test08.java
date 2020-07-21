package day04;

import javax.swing.*;

public class Test08 {

	/*
		예제 4)
		
			년도를 입력하고
			그 해가 윤년인지 아닌지 판별해서 출력하세요.
			
			해결은 다중 조건문으로 처리하세요.
	 */
	
	public static void main(String[] args) {
		
		String snum = JOptionPane.showInputDialog("년도를 입력하세요.");
		int year = Integer.parseInt(snum);
		
		String str = "";
		
		if(year % 400 == 0) {
			
			str = "윤년";
			
		} else if (year % 100 == 0) {

			str = "평년";
			
		} else if (year % 4 == 0) {

			str = "윤년";
			
		} else {
			
			str = "평년";
			
		}
		
		String msg = String.format("%s년은 %s입니다.", year, str);
		
		JOptionPane.showMessageDialog(null, msg);
		
	}
	
}
