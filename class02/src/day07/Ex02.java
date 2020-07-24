package day07;

public class Ex02 {

	/*
	 * 
	 * 정수 5개를 저장할 배열 3개 만들어서 첫 번째 배열에는 램덤한 사각형의 가로의 길이 저장 두 번째 배열에는 램덤한 사각형의 세로의 길이
	 * 저장 세 번째 배열에는 면적을 계산해서 저장
	 * 
	 */

	public static void main(String[] args) {

		int[][] table = new int[3][5];
		String[] sidx = { "첫", "두", "세", "네", "다섯" };

		for (int k = 0; k < 2; k++) {
			for (int i = 0; i < table[k].length; i++) {
				table[k][i] = (int) (Math.random() * 100 + 1);
				for (int j = 0; j < i; j++) {
					if (table[k][i] == table[k][j]) {
						i--;
						break;
					}
				}
			}
		}
		
		for(int i = 0; i < table[0].length; i++) {
			System.out.printf( "%s번째 사각형 : 가로 - %d | 세로 - %d | 넓이 - %d\n",
								sidx[i], table[0][i], table[1][i], table[0][i] * table[1][i]);
		}

	}

}
