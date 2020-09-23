package day29.thread;

public class Trd04 implements Runnable{
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		String msg = name + "씨가 공부합니다. ";
		if (!name.equals("이지우")) msg = "\t\t" + msg;
		for (int i = 0; i < 1000; i++) {
			System.out.println(msg + (i + 1));
		}
	}
	
}
