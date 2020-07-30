package day11;

public class Test01 {

	// Heap Type이 Moyang[]인 변수 만들기
	Moyang[] m1;
	
	public Test01() {
		m1 = new Moyang[5];
		
		for (int i = 0; i < m1.length; i++) {
			m1[i] = new Moyang();
		}
		
		m1[0].figure = "Triangle";
		m1[1].figure = "Square";
		m1[2].figure = "Rectangle";
		m1[3].figure = "Pentagon";
		m1[4].figure = "Rhombus";
		
		for (int i = 0; i < m1.length; i++) {
			System.out.printf("%d 번째 모양 : %s%n", i, m1[i].figure);
		}
		
	}
	
	public static void main(String[] args) {
		new Test01();
	}
	
}
