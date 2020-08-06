package day15;

public class Test01 {

	
	
	public static void main(String[] args) {
		Son s = new Son();
		Father f = s; // 자동 형변환
//		Son2 s2 = (Son2) f; // 불가 (f 주소가 Son 타입에서 Father 타입으로 캐스팅된 상태, Son2는 될 수 없음) 
		
	}
	
}

class Father {}
class Son extends Father {}
class Son2 extends Father {}