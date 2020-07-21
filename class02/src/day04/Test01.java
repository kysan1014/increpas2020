package day04;

public class Test01 {
	
	public static void main(String[] args) {
		
		// 랜덤한 대문자 알파벳 생성

		char ch = (char) (Math.random() * ('Z' - 'A' + 1) + 'A');

		System.out.printf("랜덤하게 발생한 문자는 \'%c\'입니다.", ch);

	}
	
}
