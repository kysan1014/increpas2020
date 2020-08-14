package day20;

import java.util.Vector;

public class Test09 {

	public Test09() {

		Vector vec = new Vector();
		
		for (int i = 0; i < 10; i++) {
			vec.add(10);
		}		
		System.out.println(vec.size());
		System.out.println(vec.capacity());

		
		for (int i = 0; i < 10; i++) {
			vec.add(10);
		}		
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		
		vec.add(10);
		
		
		for (int i = 0; i < 10; i++) {
			vec.add(10);
		}
		System.out.println(vec.size());
		System.out.println(vec.capacity());

	}
	
	public static void main(String[] args) {
		new Test09();
	}
}
