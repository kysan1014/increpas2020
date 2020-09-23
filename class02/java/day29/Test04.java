package day29;

import day29.thread.Trd04;

public class Test04 {

	public Test04() {
		Trd04 tmp = new Trd04();
		
		Thread t1 = new Thread(tmp, "장성환");
		Thread t2 = new Thread(tmp, "이지우");

		t1.start();
		t2.start();
	}
	public static void main(String[] args) {
		new Test04();
	}
}
