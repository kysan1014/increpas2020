package day12;

public class Test04 {

	
	int no1;
	int no2;
	
	public Test04() { // 기본 생성자 함수
//		new Test04(10, 10); // 전혀 다른 Test04 타입의 인스턴스를 힢에 만드는 것 // 이 주석을 풀면 아래 에러남
		this(10,10); // 오버로드된 다른 생성자를 호출 // 생성자의 가장 첫 줄에서만 동작함
	}
	
	public Test04(int no1, int no2) {
		super();
		this.no1 = no1;
		this.no2 = no2;
	}
	
	public static void main(String[] args) {
		Test04 t1 = new Test04();
		
		Test04 t2 = new Test04(1,2);
	}
	
}
