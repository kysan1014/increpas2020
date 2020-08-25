package day20;

import java.util.Vector;

public class Test10 {
public Test10() {

	// 모든 값을 디폴트
	int initCapacity = 10;
	Vector vec = new Vector();
	
	for ( int i = 0; i < initCapacity + 1; i++) {
		vec.add(1);
	}
	
	System.out.println(vec.capacity());
	System.out.println(vec.size());
	
	System.out.println("-------------------------------");
	
	// 모든 값을 디폴트
	int initCapacity1 = 5;
	Vector vec1 = new Vector(initCapacity1);
	
	for ( int i = 0; i < initCapacity1 + 1; i++) {
		vec1.add(1);
	}
	
	System.out.println(vec1.capacity());
	System.out.println(vec1.size());	
	
	System.out.println("-------------------------------");
	
	// 모든 값을 디폴트
	int initCapacity2 = 5;
	int capacityIncrement = 10;
	Vector vec2 = new Vector(initCapacity2, capacityIncrement);
	
	for ( int i = 0; i < initCapacity2 + 1; i++) {
		vec2.add(1);
	}
	
	System.out.println(vec2.capacity());
	System.out.println(vec2.size());

}

public static void main(String[] args) {
	new Test10();
}
}
