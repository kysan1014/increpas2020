package day23_properties;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import day23_properties.source.Student;

public class Ex02 {
	private ArrayList<Student> sList;
	private ArrayList<Integer> noList;
	private TreeMap<Integer, Student> map;

	public Ex02() {
		initList();
		initMap();
		printElement();
	}

//	private void printElement() {
//		Set<Entry<Integer, Student>> set = map.entrySet();
//		Iterator<Entry<Integer, Student>> iter = set.iterator();
//		while (iter.hasNext()) {
//			Entry<Integer, Student> s = iter.next();
//			System.out.println(s.getKey() + " : " + s.getValue());
//		}
//		
//	}
	
	private void printElement() {
		Set<Integer> set = map.descendingKeySet();
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
			Integer s = iter.next(); 
			System.out.println(s + " : " + map.get(s));
		}
	}

	private void initMap() {
		map = new TreeMap<Integer, Student>();
		for (int i = 0; i < sList.size(); i++) {
			map.put(sList.get(i).getId(), sList.get(i));
		}
	}

	private void initList() {
		noList = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			noList.add(1000 + i);
		}

		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("A");
		nameList.add("B");
		nameList.add("C");
		nameList.add("D");
		nameList.add("E");

		sList = new ArrayList<Student>();
		for (int i = 0; i < 5; i++) {
			sList.add(new Student(noList.get(i), nameList.get(i), (int) (Math.random() * 100 + 1),
					(int) (Math.random() * 100 + 1), (int) (Math.random() * 100 + 1), (int) (Math.random() * 100 + 1)));
		}

		Collections.sort(sList, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getTotal() - o2.getTotal();
			}
		});
	}

	public static void main(String[] args) {
		new Ex02();
	}
}
