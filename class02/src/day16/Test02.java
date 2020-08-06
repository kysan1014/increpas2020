package day16;

public class Test02 {
	public Test02() {
		System.out.println(new Test02_01().new Inner01().num);
		new Test02_01().abc();
	}

	public static void main(String[] args) {
		new Test02();
	}
}

class Test02_01 { 
	int no = 100;
	void abc() {
		System.out.println("여기는 Test02_01");
	
		class Inner02 {
			public Inner02() {
				toPrint();
			}
			
			void toPrint() {
				System.out.print("여기는 Inner02 : ");
				System.out.println(new Inner01().xyz());
			}
		}
		
		new Inner02();
	}
	
	// a global inner class
	class Inner01 {
		int num = no + 2;
		int xyz() {
			return num;
		}
	}
}