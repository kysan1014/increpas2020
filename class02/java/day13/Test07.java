package day13;

public class Test07 {
	public Test07() {
		Father f = new Father();
		f.toPrint();

		Son s = new Son();
		s.toPrint();

		f = s;

		System.out.println("Son.num : " + s.num);
		System.out.println("Father.num : " + f.num);

		f.toPrint();

		s = (Son) f;
	}

	public static void main(String[] args) {
		new Test07();
	}
}

class Father {
	int no = 1000;
	int num = 11;

	public Father() {
	}

	public Father(int no) {
		this.no = no;
	}

	public void toPrint() {
		System.out.println("여기는 아부지 no : " + no);
	}
}

class Son extends Father {
	int num = 22;

	public Son() {
		super(10000);
	}

	public void toPrint() { // 함수의 오버라이딩(함수의 재정의)
		System.out.println("여기는 아들 no : " + no);
	}
}
