package day08;

import java.util.Arrays;

public class Test03 {

	public static void main(String[] args) {
		
		int[] no1 = new int[] {1,2,3,4,5,6,7,8,9,10};
		int[] no2;
		
		no2 = no1; // 얕은 복사 - 주소만 복사
		
		no1[9] = 100;
		
		System.out.println(Arrays.toString(no2));
		
		int[] no3 = new int[10];
		
		System.arraycopy(no1, 0, no3, 0, no1.length); // 깊은 복사
		
		no1[9] = 10;
		
		System.out.println(Arrays.toString(no1));
		System.out.println(Arrays.toString(no2));
		System.out.println(Arrays.toString(no3));
		
	}
	
}
