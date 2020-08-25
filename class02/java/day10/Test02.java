package day10;

public class Test02 {

	public Test02() {
		
		// 생성자 문법
		// 리턴값이 없고, 함수명이 클래스 명과 같음
		
		// 함수 안에서 함수를 선언해도 되지만
		// 관례상 자바에서는 함수 안에서 함수를 선언하지 않음
		
		int no1 = (int) (Math.random() * 1000001);
		int no2 = (int) (Math.random() * 1000001);
		
		int result = duhagi(no1, no2);
		
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		new Test02();
	}
	
	// 이곳에 함수를 만들어도 됨
	
	// 두 수를 입력받아 더한 값을 반환하는 함수
	public int duhagi(int no1, int no2) {
		/*
			이 함수를 실행할 때는 반드시 정수 데이터 두 개를 입력하여 실행할 것이다
			이때 각 데이터는 no1, no2에 대입된다.
			함수 내부에서는 입력되는 데이터를 no1, no2를 사용하여 처리하면 된다.
		 */
		return no1 + no2;
	}
}
