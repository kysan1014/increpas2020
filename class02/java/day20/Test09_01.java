package day20;

import java.util.ArrayList;
import java.util.Vector;

public class Test09_01 {

	public Test09_01() {

		Vector<Integer> vec = new Vector<Integer>(20);
		
		for (int i = 0; i < 21; i++) {
			vec.add(10);
		}
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		
		vec = new Vector<Integer>(20, 5);
		
		for (int i = 0; i < 31; i++) {
			System.out.println("+++++++++++");
			vec.add(10);
			System.out.println(vec.size());
			System.out.println(vec.capacity());
			System.out.println("+++++++++++");
		}
		
		System.out.println("\n-----------------------------------------------\n");
		
		for (int i = 0; i < vec.size(); i++) {
			System.out.println(vec.get(i) + i);
		}
		
		System.out.println("\n-----------------------------------------------\n");
		
		ArrayList list = new ArrayList<>();
//		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < 21; i++) {
			list.add(10);
		}		
		System.out.println(list.size());
		
		
	}
	
	public static void main(String[] args) {
		new Test09_01();
	}
}
