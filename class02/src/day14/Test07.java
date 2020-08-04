package day14;

import day14.sub.Class00;
import day14.sub.Class01;
import day14.sub.Class02;

public class Test07 extends Class02{
	public Test07() {
		// private 접근 지정자 - 해당 클래스 내에서만 접근 가능
		Class00 c00 = new Class00();
//		System.out.println(Class00.no); // 에러
		System.out.println(c00.getNo()); // public getter 만들어서 접근 가능
		
		// default 접근 지정자 - 같은 패키지 내의 클래스들만 접근 가능
		Class01 c01 = new Class01();
//		int num = c01.no; 
		// public getter 만들어서 접근 가능
		
		// protected 접근 지정자 - 같은 패키지 내에서 사용하거나, 상속된 클래스에서만 접근 가능
		Class02 c02 = new Class02();
		String className = super.str;
		
		System.out.println(className);
		
//		System.out.println(c02.toPrint()); // 에러
		super.toPrint();
		
	}

	public static void main(String[] args) {
		new Test07();
	}
}
