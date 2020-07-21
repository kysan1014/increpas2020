package day04;

import java.util.Random;
import java.util.Scanner;

/*
 윈도우 창을 띄워 입력받는 방법
	
	1. 라이브러리 추가
		import javax.swing
	
*/
import javax.swing.JOptionPane;

public class Ex02 {

	/*
	 * 문제 2)
	 * 
	 * 랜덤하게 다섯자리 숫자를 만들고; 각 자리의 숫자의 합을 구해서 출력해주는 프로그램 작성
	 * 
	 */

	public static void main(String[] args) {

		String snum = JOptionPane.showInputDialog("다섯자리 숫자를 입력하세요.");

		int temp = Integer.parseInt(snum);
		int result = 0;
		
		for (int i = 0, j = 10000; i < 4; i++, j /= 10) {
			result += temp / j;
			temp %= j;

		}
		
		String msg = String.format("입력한 숫자 : %s\n각 자리수의 합 : %d", snum, result);

		JOptionPane.showMessageDialog(null, msg);
		
		
//		int rand = new Random().nextInt(100000);
//		int result = 0;
//		
//		int temp = rand;
//		for (int i = 0, j = 10000; i < 4; i++, j /= 10) {
//			result += temp / j;
//			temp -= temp / j * j;
//
//		}
//
//		System.out.printf("%d -> %d",rand, result);
	}

}
