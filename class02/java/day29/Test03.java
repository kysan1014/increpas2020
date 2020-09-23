package day29;

import day29.thread.Trd031;

public class Test03 {

	public Test03() {
		Trd031 t1 = new Trd031();
		Trd031 t2 = new Trd031("이지우");
		
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Test03();
	}
	
}
