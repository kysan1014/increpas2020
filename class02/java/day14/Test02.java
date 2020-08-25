package day14;

public class Test02 {

	public Test02() {
		Figure sg = new Sagak();
		Figure sm = new Samgak();
		Figure dg = new Dongle();
		
//		System.out.println("\nSagak");
//		System.out.printf("Instance of Object : %b%n", sg instanceof Object);
//		System.out.printf("Instance of Figure : %b%n", sg instanceof Figure);
//		System.out.printf("Instance of Sagak : %b%n", sg instanceof Sagak);
//		System.out.printf("Instance of Samgak : %b%n", sg instanceof Samgak);
//		System.out.printf("Instance of Dongle : %b%n", sg instanceof Dongle);
//		System.out.println("\nSamgak");
//		System.out.printf("Instance of Object : %b%n", sm instanceof Object);
//		System.out.printf("Instance of Figure : %b%n", sm instanceof Figure);
//		System.out.printf("Instance of Sagak : %b%n", sm instanceof Sagak);
//		System.out.printf("Instance of Samgak : %b%n", sm instanceof Samgak);
//		System.out.printf("Instance of Dongle : %b%n", sm instanceof Dongle);
//		System.out.println("\nDongle");
//		System.out.printf("Instance of Object : %b%n", dg instanceof Object);
//		System.out.printf("Instance of Figure : %b%n", dg instanceof Figure);
//		System.out.printf("Instance of Sagak : %b%n", dg instanceof Sagak);
//		System.out.printf("Instance of Samgak : %b%n", dg instanceof Samgak);
//		System.out.printf("Instance of Dongle : %b%n", dg instanceof Dongle);

		Sagak[] ss = new Sagak[2];
		
//		for (int i = 0; i < ss.length; i++) {
//			Sagak s = new Sagak();
//			ss[i] = s;
//		}
		
		for (Sagak s : ss) {
			s = new Sagak();
//			System.out.println(s.getWidth());
		}
		for (Sagak s : ss) {
//			s = new Sagak();
			System.out.println(s.getWidth());
		}
		
	}
	
	public static void main(String[] args) {
		new Test02();
	}
	
}

class Figure {
	double getArea() {
		return 0.0;
	}

//	public String toString() {
//		return "이것은 도형입니다.";
//	}
}

class Sagak extends Figure {

	int width;
	int height;

	public Sagak() {
	}

	public Sagak(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	double getArea() {
		return width * height * 1.0;
	}
	
	public int getWidth() {
		return width;
	}

//	public String toString() {
//		return "이것은 가로가 " + width + "이고 세로가 " + height + "이고 넓이가 " + getArea() + "인 사각형이다.";
//	}
//	@Override
//	public String toString() {
//		return width + "";
//	}
}

class Samgak extends Figure {

	private int width;
	int height;

	public Samgak() {
	}

	public Samgak(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	double getArea() {
		return width * height * 0.5;
	}

	public String toString() {
		return "이것은 가로가 " + width + "이고 세로가 " + height + "이고 넓이가 " + getArea() + "인 삼각형이다.";
	}

}

class Dongle extends Figure {

	int radius;

	public Dongle() {
	}

	public Dongle(int radius) {
		super();
		this.radius = radius;
	}

	double getArea() {
		return radius * radius * Math.PI;
	}

	public String toString() {
		return "이것은 반지름이 " + radius + "이고 넓이가 " + getArea() + "인 동그라미이다.";
	}

}