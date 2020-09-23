package day29.thread;

public class Trd08 extends Thread {
	
	public boolean isStart = true;
	
	@Override
	public void run() {
		for (int i = 0; isStart; i++) {
			System.out.println("\t\t선생님이 아이스크림을 사줍니다. - " + (i + 1));
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
