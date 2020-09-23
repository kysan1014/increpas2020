package day29.thread;

public class Trd01 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("\t\t오혜찬씨가 공부합니다." + (i + 1));
		}
	}

}
