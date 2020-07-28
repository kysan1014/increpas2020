package day09;

import java.util.Arrays;

/*

	보너스 )
	
		1.		랜덤하게 정수 생성후 변수에 저장
		2.		발생한 정수의 길이만큼 정수를 저장할 배열 선언
		2-1.	배열에 랜덤한 정수를 저장
		3.		배열의 랜덤 정수 길이의 랜덤한 문자열 생성, 영문 대소문자만 가능
		4.		각 문자열 출력

 */

public class Bonus01 {

	public static void main(String[] args) {
		
		int range = 20;
		int len = (int) (Math.random() * range + 1);
		
		int[] strLengths = new int[len];
		
		for (int i = 0; i < strLengths.length; i++) {
			strLengths[i] = (int) (Math.random() * range + 1);
		}
		
		String[] randStrings = new String[len];
		for (int i = 0; i < strLengths.length; i++) {
			String temp = "";
			for (int j = 0; j < strLengths[i]; j++) {
				char c = (char) (Math.random() * ('z' - 'A') + 'A');
				if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
					temp += c;
				} else {
					j--;
				}
			}
			randStrings[i] = temp;
			
		}
		
		System.out.println(Arrays.toString(strLengths));
		System.out.println(Arrays.toString(randStrings));
		
	}
	
}
