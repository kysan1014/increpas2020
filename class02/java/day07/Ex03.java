package day07;

import java.util.Arrays;

public class Ex03 {

	/*
	 * 
	 * 성적 관리 프로그램
	 * 
	 * 다섯 학생의 국어, 영어, 수학, 코딩, 총점을 관리할 배열 생성 랜덤하게 과목 점수를 만들어서 입력 총점을 계산
	 * 
	 * 보너스 ]
	 * 
	 * 점수가 높은 사람부터 정렬해서 출력;
	 * 
	 */

	public static void main(String[] args) {

		String[] names = { "가", "나", "다", "라", "마" };
		String[] subjects = { "국어", "영어", "수학", "코딩", "총점" };

		int[][] table = new int[names.length][subjects.length];

		for (int j = 0; j < table.length; j++) {
			
			// 4번째까지 랜덤수
			for (int i = 0; i < table[j].length - 1; i++) {
				table[j][i] = (int) (Math.random() * 100 + 1);
				
			}
			
			// 총점 구하기
			int sum = 0;
			for (int i = 0; i < subjects.length - 1; i++) {
				table[j][subjects.length - 1] += table[j][i];
			}
		}
		
		for (int i = 0; i < table.length; i++) {			
			System.out.println(Arrays.toString(table[i]));
		}
		System.out.println("\n");
		
		// 내림차순 정렬 - 버블 정렬
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table.length - i - 1; j++) {
				if (table[j][table[j].length - 1] < table[j + 1][table[j].length - 1]) {
					for (int k = 0; k < table[j].length; k++) {
						int temp = table[j][k];
						table[j][k] = table[j + 1][k];
						table[j + 1][k] = temp;
					}
				}
//					System.out.print(i + " - " + j + " : ");
//					System.out.println(Arrays.toString(lotto));
			}
		}
		
		for (int i = 0; i < table.length; i++) {			
			System.out.println(Arrays.toString(table[i]));
		}
		
		System.out.println("\n");
		
		System.out.print("\t");
		for (int i = 0; i < subjects.length; i++) {
			System.out.printf("%s\t", subjects[i]);
		}
		System.out.println();
		for (int i = 0; i < table.length; i++) {
			System.out.printf("%s :\t", names[i]);
			for (int j = 0; j < table[i].length; j++) {
				System.out.printf("%2d\t", table[i][j]);
			}
			System.out.println();
		}

	}

}
