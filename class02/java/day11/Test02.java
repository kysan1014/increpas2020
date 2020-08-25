package day11;

public class Test02 {

	Moyang mo1, mo2, mo3;
	
	public Test02() {
		
		// 변수 초기화
		setData();
		
		// 출력
		toPrint();
		
	}

	public void setData() {
		// Moyang 객체 세 개를 만들어 데이터 채우기
		
		Moyang m1 = new Moyang();
		Moyang m2 = new Moyang();
		Moyang m3 = new Moyang();
		
		m1.figure = "Convex";
		m2.figure = "Concave";
		m3.figure = "Equilateral";
		
		// 각 객체에 저장되어 있는 변수의 내용을 출력
		
//		System.out.println("m1.figure : " + m1.figure);
//		System.out.println("m2.figure : " + m2.figure);
//		System.out.println("m3.figure : " + m3.figure);
		
		mo1 = m1;
		mo2 = m2;
		mo3 = m3;
	}
	
	public void toPrint() {
		//전역 변수의 내용을 출력
		
		System.out.println("mo1.figure : " + mo1.figure);
		System.out.println("mo2.figure : " + mo2.figure);
		System.out.println("mo3.figure : " + mo3.figure);
	}
	
	public static void main(String[] args) {
		
		new Test02();
		
	}
}
