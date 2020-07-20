package day02;

import java.util.Scanner;

public class Answers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Questions q = new Questions(sc);
		
		double[] a1 = q.question1();
		if ((int) a1[0] == 3) {
			System.out.printf("삼각형의 넓이 : %.3f%n", a1[1]);
		} else {
			System.out.printf("사각형의 넓이 : %.3f%n", a1[1]);
		}
		System.out.println();
		
		double[] a2 = q.question2();
		System.out.printf("원의 넓이 : %.3f, 원의 둘레 : %.3f%n", a2[0], a2[1]);
		System.out.println();
		
		Object[][] a3 = q.question3();
		for (int i = 0; i < a3.length; i++) {
			System.out.printf("%s 개수 : %d%n", a3[i][0], a3[i][1]);
		}
		System.out.println();
		
		Object[][] a4 = q.question4();
		for (int i = 0; i < a4.length; i++) {
			System.out.printf("%s 수 : %d%n", a4[i][0], a4[i][1]);
		}
		System.out.println();
		
		sc.close();
		
		
	}

}
