package day05;

public class Ex05 {

	/*
		문제 5 ]
			주사위를 2개를 던질 경우 
			두 눈의 합이 6이 되는 경우를 출력하세요.
	 */
	
	public static void main(String[] args) {
		
		int dice = 6;
		
		for (int i = 1; i < dice + 1; i++) {
			for (int j = 1; j < dice + 1; j++) {
				if (i + j == 6) {
					System.out.printf("%d + %d = 6%n", i, j);
				}
			}
		}
		
	}
	
}
