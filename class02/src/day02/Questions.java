package day02;

import java.util.Scanner;

public class Questions {

	Scanner sc;
	
	public Questions(Scanner sc) {
		this.sc = sc;
	}
	
	/*
		1. �� ���� ���ڸ� �Է¹��� ��, �� ���� �̿��Ͽ� �簢��, �ﰢ���� ���̸� ���Ͽ� ����Ͻÿ�.
	*/
	
	public double[] question1() {
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		
		System.out.println("�ﰢ���� 3, �簢���� 4�� �Է��ϼ��� : ");
		int flag = sc.nextInt();
		
		return solveQ1(flag, num1, num2);
	}
	
	private double[] solveQ1(int flag, int num1, int num2) {
		double answer = 0;
		if (flag == 3) answer = num1 * num2 / 2.0;
		else if (flag == 4) answer = (double) (num1 * num2);
		else {
			System.out.println("�ٽ� �Է��ϼ���.");
			question1();
		}
		return new double[] {flag, answer};
	}

	/*
		2. �ϳ��� ����(������)�� �Է¹޾� ���� ���̿� �ѷ��� ���Ͽ� ���
	 */
	
	public double[] question2() {
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		
		return solveQ2(num1);
	}
	
	private double[] solveQ2(int num1) {
		return new double[] {num1 * num1 * Math.PI, 2 * num1 * Math.PI};
	}
	
	/*
		3. �ݾ��� �Է¹޾� ȭ�� ������ ������ ���Ͽ� ���
	 */
	
	public Object[][] question3() {
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int money = sc.nextInt();
		
		return solveQ3(money);
	}
	
	private Object[][] solveQ3(int money) {

		int temp = money;
		int currency = 50000;
		String[] currencyStr = {"������", "����", "��õ��", "õ��", "�����", "���", "�ʿ�"};
		
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
		4. ��¥�� �Է¹޾� �ش� ��¥�� �� ��, �� �ð�, �� ��, �� ������ ���Ͽ� ���
	 */
	
	public Object[][] question4() {
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		double time = sc.nextDouble();
		
		return solveQ4(time);
	}

	private Object[][] solveQ4(double time) {

		double temp = time;
		int[] measurement = {24, 60, 60};
		String[] measurementStr = {"��", "�ð�", "��", "��"};
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
