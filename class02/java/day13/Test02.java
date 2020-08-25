package day13;

public class Test02 {
	static int num = 10;
	int no = 100;

	public static void main(String[] args) {
//		static int no1 = 100;
		System.out.println(Test02.num);
//		System.out.println(no);
		Test02 t = new Test02();
		System.out.println(t.no);
		Test02 t1 = new Test02();

		new Test02_01();
		System.out.println("Test02 main : " + Test02.num);
	}

}

class Test02_01 {

	public Test02_01() {
		Test02.num = 20;
		System.out.println("Test02_01 Test02.num : " + Test02.num);
	}
}
