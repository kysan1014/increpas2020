package day07;

public class Test04 {

	public static void main(String[] args) {
		
		String str = "가나다라abcdABCD";
		
		int sIdx = str.indexOf("abcd");

		System.out.printf("문자열 \"%s\"에서 문자열 \"abcd\"의 시작 위치 : %d", str, sIdx);
		
	}
	
}
