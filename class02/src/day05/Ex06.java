package day05;

public class Ex06 {

	/*
		문제 6 ]
			
			수학 방정식
				2x + 4y = 10
			의 결과를 출력하세요.
			
			단, x, y는 모두 0보다 크거나 같고 10 보다 작거나 같다.
	 */
	
	public static void main(String[] args) {
		
		int target = 10;
		int x = 2;
		int y = 4;
		for (int i = 0; i < target / x + 1; i++) {
			for (int j = 0; j < target / y + 1; j++) {
				if (x * i + y * j == target) {
					System.out.printf("%d * [ %d ] + %d * [ %d ] = %d%n", x, i, y, j, target);
				}
			}
		}

	}

}
