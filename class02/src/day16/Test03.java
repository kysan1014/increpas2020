package day16;

public class Test03 {
	public Test03() {

		Inner02.TopIn tin = Inner02.TopIn.getInstance();
		System.out.println(tin.no);
		Inner03.TopIn tin2 = new Inner03.TopIn();
		System.out.println(tin2.no);
		
	}

	public static void main(String[] args) {
		new Test03();
	}
}

class Inner02 {
	int num;
	void abc() {
		System.out.println("여기는 Inner02");
	}
	
	// Top-Level Inner Class
	static class TopIn {
		private static TopIn t = null;
		
		private TopIn() {}
		static TopIn getInstance() {
			return new TopIn();
		}
		int no = 10; 
		void xyz() {
			System.out.println("TopIn.xzy()");
		}
	}
}

class Inner03 {
	public static TopIn TopIn;
	int num;
	void abc() {
		System.out.println("여기는 Inner02");
	}
	
	// Top-Level Inner Class
	static class TopIn {

		int no = 10; 
		void xyz() {
			System.out.println("TopIn.xzy()");
		}
	}
}