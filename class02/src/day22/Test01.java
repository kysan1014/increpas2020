package day22;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

public class Test01 {

	public Test01() {

		HashSet<String> set = new HashSet<String>(10, (float) 1.67);
		set.add("A");
		set.add("G");
		set.add("E");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("C");
		set.add("E");
		set.add("A");
		set.add("F");
		set.add("G");
		set.add("B");
		set.add("F");
		set.add("D");
		
		System.out.println(set);
		
		for (String str : set) {
			System.out.println(str);
		}
		
		Iterator<String> iter = set.iterator();
		
		for (int i = 0; iter.hasNext(); i++) {
			System.out.println(i + " : " + iter.next());
		}
		
		Vector<String> vec = new Vector<String>(set);
	
		System.out.println(vec);
		
	}
	public static void main(String[] args) {
		new Test01();
	}
	
}
