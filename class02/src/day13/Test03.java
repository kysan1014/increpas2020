package day13;

public class Test03 {
	public static void main(String[] args) {
		// Test03_01.no 출력
		System.out.println("Test03_01.no : " + Test03_01.no);
	}

}

class Test03_01 {
	static int no;
	int no1;
	int num1 = 11; // 명시적 초기화
	int num2;

	{ // 초기화 블럭을 이용한 초기화
		no1 = 100;
	}

	static { // static 블럭을 이용한 초기화
		no = 1000;
	}

	public Test03_01() {
	}

	public Test03_01(int num2) { // 생성자 함수를 이용한 초기화
		this.num2 = num2;
	}
}
