package day10;

public class Test01 {

	int no = 10;
	
	public Test01() {
		// 생성자 함수는 반환값 타입이 존재하지 않음
		// 기본 생성자 함수는 매개변수가 존재하지 않는 함수를 기본 생성자 함수라고 한다.
		abc();
	}
	
	public static void main(String[] args) {
		new Test01();
	}
	
	void abc() {
		System.out.println("여기는 abc 함수!");
	}
	
}
