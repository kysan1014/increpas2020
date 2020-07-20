package day03;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.printf("%s : %d", name, age);
		
		
		/*
		
			System.out.print("이름을 입력하세요 : ");
			StringBuffer personalInfo = new StringBuffer(sc.next());
			
			System.out.print("나이를 입력하세요 : ");
			personalInfo = personalInfo.append(new String(" : " + sc.nextInt()));
			
			System.out.println(personalInfo);
		
		*/
	}
}
