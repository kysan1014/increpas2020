package day21;

import java.util.ArrayList;
import java.util.Collections;

public class Test04 {

	public Test04() {

		ArrayList<Integer> list = initializeList();

		Collections.sort(list);
		Collections.sort(list, Collections.reverseOrder());
		Collections.reverse(list);
		System.out.println(list);

		myArrayList<Integer> myList = new myArrayList<Integer>(list);

		myList.addChain(1).addChain(2).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3)
				.addChain(3).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3)
				.addChain(3).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3)
				.addChain(3).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3)
				.addChain(3).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3)
				.addChain(3).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3)
				.addChain(3).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3)
				.addChain(3).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3)
				.addChain(3).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3)
				.addChain(3).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3)
				.addChain(3).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3)
				.addChain(3).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3)
				.addChain(3).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3)
				.addChain(3).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3).addChain(3)
				.addChain(3).addChain(3).addChain(3);
		System.out.println(myList);
	}

	private ArrayList<Integer> initializeList() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add((int) (Math.random() * 20 + 1));
		}
		return list;
	}

	public static void main(String[] args) {
		new Test04();
	}
}
