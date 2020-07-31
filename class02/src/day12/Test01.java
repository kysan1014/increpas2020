package day12;

public class Test01 {
	
	private double area;
	
	public Test01() {
		
		setArea(10, 5);
		
		System.out.println("area : " + area);
		
		area =  setArea(10);
		
		System.out.println("area : " + area);
		
	}
	
	public static void main(String[] args) {
		new Test01();
	}
	
	// 사각형 넓이 구해주는 함수
	public void setArea(int width, int height) {
		area = width * height;
	}
	
	// 원의 넓이 구하는 함수
	public double setArea(double radius) {
		return Math.PI * radius * radius;
	}
	
	
}
