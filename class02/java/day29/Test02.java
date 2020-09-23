package day29;

import day29.thread.Trd021;
import day29.thread.Trd022;

public class Test02{

	public Test02() {
		
		Trd021 t01 = new Trd021();
		Trd022 t02 = new Trd022();
		
		t01.run();
		t02.run();
		
	}


	public static void main(String[] args) {
		new Test02();
	}

}
