package day12;

import java.util.Arrays;

/*

	문제 4]
		
		String 클래스의 api 문서를 참고해서 해결하세요.
		
		'A' ~ 'Z' 사이의 문자 10를 랜덤하게 배열로 만들어서
		이 배열을 이용해서 문자열을 만들어 보세요.
	
*/
public class Ex04 {

	char[] charArr;
	int len = 10;
	String str;
	
	public Ex04() {

		setCharArr();

		converToString();
		
	}

	public void converToString() {
		str = new String(charArr);
		
		System.out.println(str);
	}

	public void setCharArr() {
		charArr = new char[len];
		for (int i = 0; i < len; i++) {
			charArr[i] = (char) (Math.random() * ('Z' - 'A') + 'A');
		}
	
		System.out.println(Arrays.toString(charArr));
	}
	
	public static void main(String[] args) {
		new Ex04();
	}
	
}
