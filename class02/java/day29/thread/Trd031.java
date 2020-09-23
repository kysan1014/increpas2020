package day29.thread;

public class Trd031 extends Thread{

	private String name;
	
	public Trd031() {
		this.name = "장성환";
	}
	
	public Trd031(String name) {
		this.name = name;
	}
	
	public String getTName() {
		return name;
	}
	
	@Override
	public void run() {
		Thread t1 = Thread.currentThread();
		String msg = name + "씨가 공부합니다. ";
		if (!name.equals("이지우")) msg = "\t\t" + msg;
		for (int i = 0; i < 1000; i++) {
			System.out.println(msg + (i + 1));
		}
	}

}
