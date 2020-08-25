package day22;

import java.util.Comparator;
import java.util.TreeSet;

import day22.source.Student;

public class Ex03 {
	public Ex03() {

		TreeSet<Student> tree = new TreeSet<Student>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if (o1.getBan() > o2.getBan())
					return 1;
				else if (o1.getBan() < o2.getBan())
					return -1;
				else {
					if (o1.getScore() > o2.getScore())
						return -1;
					else if (o1.getScore() == o2.getScore())
						return 0;
					else return 1;
				}
			}
		});
		initSet(tree);
		
		for (Student s : tree) {
			System.out.println(s);
		}
	}
	
	public void initSet(TreeSet<Student> tree) {
		tree.add(new Student("홍길동",1,20));
		tree.add(new Student("김길동",2,40));
		tree.add(new Student("박길동",1,10));
		tree.add(new Student("최길동",1,60));
		tree.add(new Student("선우길동",3,20));
		tree.add(new Student("강길동",1,20));
		tree.add(new Student("이길동",4,90));
		tree.add(new Student("장길동",2,20));
		tree.add(new Student("유동",1,70));
		tree.add(new Student("제갈길동",2,90));
		tree.add(new Student("허길동",1,15));
	}

	public static void main(String[] args) {
		new Ex03();
	}
}
