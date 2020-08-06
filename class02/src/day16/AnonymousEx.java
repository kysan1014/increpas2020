package day16;

public class AnonymousEx {

	public static void main(String[] args) {
		
		new T() {
			@Override
			void toPrint() {
				System.out.println("Hey!");
			}
		}.toPrint();

	}
	
}

class T {
	void toPrint() {}
}
