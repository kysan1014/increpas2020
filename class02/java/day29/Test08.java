package day29;

import day29.thread.Trd08;

public class Test08 {

	public Test08() {
		Trd08 t1 = new Trd08();
		t1.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("반장님이 아이스크림을 사달라고 조릅니다. - " + (i + 1));
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		t1.isStart = false;
	}

	public static void main(String[] args) {
		new Test08();
		
	}
}
