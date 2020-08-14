package day22;

import day22.source.Student;

public class Main {
	public static void main(String[] args) {
//		String s1 = new String("1");
//		String s2 = new String("1");
//		System.out.println(s1);
//		System.out.println(s2);
		
		
		Student s1 = new Student("김길동", 1, 2);
		Student s2 = s1.setScore(20);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
	}
}
