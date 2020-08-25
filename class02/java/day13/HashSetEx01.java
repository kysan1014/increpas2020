package day13;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx01 {

	
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		set.add("abcd");
		set.add("bcde");
		set.add("cdef");
		
		Iterator<String> iter = set.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
