package day04;

import javax.swing.*;

public class Ex03 {

	/*
		문제3)
			다섯 자리 숫자를 입력받아
			그 숫자가 회문수인지 아닌지 판별하여 출력
			
		참고) 
			회문수는 앞으로 보나 뒤로 보나 같은 숫자 121
	 */
	
	public static void main(String[] args) {
		
		String snum = JOptionPane.showInputDialog("숫자를 입력하세요.");
		
		boolean isPalindrome = true;
		for (int i = 0; i < snum.length() / 2; i++) {
			if (snum.charAt(i) != snum.charAt(snum.length() - 1 - i)) {
				isPalindrome = false;
				break;
			}
		}
		
		String msg = String.format("입력하신 숫자 %s는 회문수%s", snum, isPalindrome ? "입니다." : "가 아닙니다.");
		
		JOptionPane.showMessageDialog(null, msg);

	}
	
}
