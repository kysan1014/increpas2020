package day09;

import java.util.Arrays;

public class Ex01 {

	/*
		
		다음 형태의 배열을 요구하는 형태로 변경하기
		
		1	2	3
		4	5	6
		
		->
		
		1	4
		2	5
		3	6
		
	 */
	
	public static void main(String[] args) {
		
		
		int[][] no1 = new int[][] {{1,2,3}, {4,5,6}};
		
		int[][] no2 = new int[3][2];
		
		for (int i = 0; i < no1.length; i++) {
			for (int j = 0; j < no1[i].length; j++) {
				no2[j][i] = no1[i][j];
			}
		}
		
		for (int[] no : no2) {
			System.out.println(Arrays.toString(no));
		}
		
		
		
	}
}
