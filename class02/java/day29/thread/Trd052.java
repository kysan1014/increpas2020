package day29.thread;

public class Trd052 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("반장님이 아메리카노를 사줍니다 - " + (i + 1));
			yield();
		}
	}

}
