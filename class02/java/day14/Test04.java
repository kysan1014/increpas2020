package day14;

public class Test04 {

	public Test04() {
		
		Object[] objs = new Object[] {1,2,3,4,5};
		
		for (int i = 0; i < objs.length; i++) {
			System.out.println(objs[i].toString() + 1);
//			System.out.println((int) objs[i] + 1);
			System.out.println(objs[i].getClass());
		}
		
	}
	
	public static void main(String[] args) {
		new Test04();
		
	}
	
}
