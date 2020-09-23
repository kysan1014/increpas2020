package day29;

import day29.thread.Trd091;
import day29.thread.Trd092;

public class Test09 {

	public Trd091 t1;
	public Trd092 t2;
	
	public Test09() {
		t1 = new Trd091(this);
		t2 = new Trd092();
		
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Test09();
	}
}
