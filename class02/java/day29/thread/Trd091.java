package day29.thread;

import day29.Test09;

public class Trd091 extends Thread {

	private Test09 main;
	
	public Trd091(Test09 main) {
		this.main = main;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("반장님이 아이스크림을 사달라고 조릅니다. - " + (i + 1));
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		main.t2.isStart = false;
	}

}
