package day04;

public class Test02 {

	public static void main(String[] args) {
		
		// 랜덤하게 대문자 두 개를 발생시켜 작은 순서부터 출력되게 하세요.
		
		char ch1 = (char) (Math.random() * ('Z' - 'A' + 1) + 'A');
		char ch2 = (char) (Math.random() * ('Z' - 'A' + 1) + 'A');
		
		String msg = ch1 < ch2 ? String.format("[ %c %c ]", ch1, ch2) : String.format("[ %c %c ]", ch1, ch2);
		
		System.out.println(msg);
	}
	
}
