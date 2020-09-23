package day29;

public class Temp extends Thread {

	private int t;
	private int t1;
	private String name;
	
	public Temp(int t, int t1, String name) {
		this.t = t;
		this.t1 = t1;
		this.name = name;
	}
	
	public Temp() {
		this(0, 0, "rand");
	}
	
	public Temp(String name) {
		this(0, 0, name);
	}

}


