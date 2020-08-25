package day22;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.stream.Stream;

import day22.source.Nemo;

public class Test03 {

	class Test03_01 {

	}

	public Test03() {

		/*
		 * TreeSet의 경우 정렬을 하여 저장하기 때문에, Comparable을 구현한 클래스만 저장 가능함 아니면, Comparator를
		 * 처음부터 생성자의 매개변수로 넣어야 함
		 */

//		TreeSet<Nemo> set = new TreeSet<Nemo>();
		TreeSet<Nemo> set = new TreeSet<Nemo>(new Comparator<Nemo>() {
			@Override
			public int compare(Nemo n1, Nemo n2) {
				return n1.getArea() - n2.getArea();
			}
		});

		for (int i = 0; i < 10; i++) {
			set.add(getNemo());
		}

		Stream<Nemo> stream = set.stream();
		stream.forEach(n -> System.out.println(n.getArea()));
		set.stream().filter(n -> n.getArea() < 50).forEach(n -> {
			System.out.println("----------------------------");
			System.out.println(n);
			System.out.println("----------------------------");
			});

//		for (Nemo n : set) {
//			System.out.println(n);
//		}
	}

	public Nemo getNemo() {
		return new Nemo((int) (Math.random() * 10 + 1), (int) (Math.random() * 10 + 1));
	}

	public static void main(String[] args) {
		new Test03();
	}
}
