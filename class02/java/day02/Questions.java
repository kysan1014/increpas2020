package day02;

import java.util.Scanner;

public class Questions {

	Scanner sc;
	
	public Questions(Scanner sc) {
		this.sc = sc;
	}
	
	/*
		1. 두 수를 입력받아 삼각형이나 사각형의 넓이를 구하기
	*/
	
	public double[] question1() {
		
		System.out.print("숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("숫자를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.println("삼각형은 3, 사각형은 4를 입력하세요 : ");
		int flag = sc.nextInt();
		
		return solveQ1(flag, num1, num2);
	}
	
	private double[] solveQ1(int flag, int num1, int num2) {
		double answer = 0;
		if (flag == 3) answer = num1 * num2 / 2.0;
		else if (flag == 4) answer = (double) (num1 * num2);
		else {
			System.out.println("다시 입력하세요.");
			question1();
		}
		return new double[] {flag, answer};
	}

	/*
		2. 반지름을 입력받아 원의 넓이와 둘레를 구하시오
	 */
	
	public double[] question2() {
		
		System.out.print("숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		return solveQ2(num1);
	}
	
	private double[] solveQ2(int num1) {
		return new double[] {num1 * num1 * Math.PI, 2 * num1 * Math.PI};
	}
	
	/*
		3. 금액을 입력받아 화폐 단위별 필요한 개수를 구하시오.
	 */
	
	public Object[][] question3() {
		
		System.out.print("금액을 입력하세요 : ");
		int money = sc.nextInt();
		
		return solveQ3(money);
	}
	
	private Object[][] solveQ3(int money) {

		int temp = money;
		int currency = 50000;
		String[] currencyStr = {"오만원", "만원", "오천원", "천원", "오백원", "백원", "십원"};
		
		Object[][] answers = new Object[currencyStr.length][2];
		
		for (int i = 0; i < currencyStr.length; i++) {
			answers[i][0] = currencyStr[i];
			answers[i][1] = temp / currency;
			temp %= currency;
			
			if (i == currencyStr.length - 2) currency /= 10;
			else if (i % 2 == 0) currency /= 5;
			else currency /= 2;
			
//			System.out.printf("%d ", temp);
		}
		
		System.out.println();
		return answers;
	}

	/*
		4. 년수를 입력받아 해당 년이 몇 일, 몇 시간, 몇 분, 몇 초인지 계산
	 */
	
	public Object[][] question4() {
		
		System.out.print("년수를 입력하세요 : ");
		double time = sc.nextDouble();
		
		return solveQ4(time);
	}

	private Object[][] solveQ4(double time) {

		double temp = time;
		int[] measurement = {24, 60, 60};
		String[] measurementStr = {"일", "시간", "분", "초"};
		Object[][] answers = new Object[measurementStr.length][2];
		
		for (int i = 0; i < measurementStr.length; i++) {
			answers[i][0] = measurementStr[i];
			answers[i][1] = (int) temp;
			temp -= (int) temp;
			
			if (i < measurementStr.length - 1) temp *= measurement[i];
		}
		
		return answers;
	}
	
}
