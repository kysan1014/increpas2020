package day05;

/*
	구구단 5단 출력하기
 */

public class Test03 {

	public static void main(String[] args) {
		int dan = 5;
		
		for (int i = 0; i < 9; i++) {
			/*
				5 * 1 = 5
				5 * 2 = 10
				...
				5 * 9 = 45
			 */
			
			System.out.printf("%d * %d = %d%n", dan, i + 1, dan * (i+1));
		}
	}
	
}
