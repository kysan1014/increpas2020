package day15;

public class Test06 {

	public Test06() {

		Test06_01[] ts = new Test06_01[8];
		
		for (int i = 0; i < ts.length; i++) {
			ts[i] = new Test06_01();
		}
		
		for ( Test06_01 t : ts ) {
			t= new Test06_01();
		}
		for ( Test06_01 t : ts ) {
			t.display();
		}
// 		
//		System.out.println(Inter01.num);
//
//		Inter01 inter = new Test06_01();
//		inter.display();
//		System.out.println(inter.toString());

	}
	
	public static void main(String[] args) {
		new Test06();
	}
	
}

class Test06_01 implements Inter01 {
	
	public Test06_01() {
		
	}

	@Override
	public void display() {
		
		System.out.println("Inter01을 구현한 Test06_01 클라스...");
		
	}
	
}