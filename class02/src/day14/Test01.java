package day14;

public class Test01 {

	public Test01() {
		Test01_01 t1 = new Test01_01();
		System.out.println(t1.no);
		System.out.println(t1.getRnd());
		System.out.println(t1);
	}
	
	public static void main(String[] args) {
		new Test01();
	}
	
}

class Test01_01 {
	int no = 100;
	public Test01_01() {
		
	}
	public int getRnd() {
		return (int) (Math.random() * 100 + 1);
	}
}

