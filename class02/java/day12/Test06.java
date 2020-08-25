package day12;

public class Test06 {

	
	public Test06() {

		toPrint("a","b","c","d","e","f","g");
	
	}
	
	public static void main(String[] args) {
		new Test06();
	}
	
	public void toPrint(String... names) {
		for (String name : names) {
			System.out.println(name);
		}
	}
	
}
