package day22;

import java.util.HashSet;

import day22.source.Nemo;

public class Test02 {

	public Test02() {

		HashSet<Nemo> set = new HashSet<Nemo>();
		for (int i = 0; i < 10; i++) {
			set.add(getNemo());
		}
		
		set.add(new Nemo(3,4));
		set.add(new Nemo(4,3));
		set.add(new Nemo(2,6));
		
		
		for(Nemo m : set) {
			System.out.println(m.hashCode());
		}
		
		System.out.println(set.size());
	}
	
	public Nemo getNemo() {
		return new Nemo(
					(int) (Math.random() * 10 + 1),
					(int) (Math.random() * 10 + 1)
					);
	}
	
	public static void main(String[] args) {
		new Test02();
	}
}
