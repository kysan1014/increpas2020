package day03;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.next();
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		System.out.printf("%s : %d", name, age);
		
		
	}
}
