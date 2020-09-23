package day29;

import day29.thread.Trd01;
import day29.thread.Trd02;

public class Test01 {

	public Test01() {

		Trd01 t1 = new Trd01();
		Trd02 t2 = new Trd02();
		
		t1.start();
		t2.start();
		
	}

	public static void main(String[] args) {
		new Test01();
	}
}
