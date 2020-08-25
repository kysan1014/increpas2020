package day13;

/*
문제 2]
	Figure 클래스를 만들고
		
		class Figure {
			double getArea(){
				return 0.0;
			}
			public String toString(){
				return "이것은 도형입니다.";
			}
		}
	
	
	이 클래스를 상속받아서 Sagak(사각형), Semo(삼각형), Dongle(원) 클래스를 만들어서
	각 도형의 내용을 출력하세요.
*/
public class Ex02 {

	public Ex02() {

		Figure[] figures = new Figure[10];

		for (int i = 0; i < figures.length; i++) {
			int rand = (int) (Math.random() * 3);
			if (rand == 0) {
				figures[i] = new Sagak((int) (Math.random() * 10 + 1), (int) (Math.random() * 10 + 1));
			} else if (rand == 1) {
				figures[i] = new Samgak((int) (Math.random() * 10 + 1), (int) (Math.random() * 10 + 1));
			} else {
				figures[i] = new Dongle((int) (Math.random() * 10 + 1));
			}
		}

		for (int i = 0; i < figures.length; i++) {
			System.out.println(figures[i].toString());
		}
	}

	public static void main(String[] args) {
		new Ex02();
	}
}

class Figure {
	double getArea() {
		return 0.0;
	}

	public String toString() {
		return "이것은 도형입니다.";
	}
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

	public String toString() {
		return "이것은 가로가 " + width + "이고 세로가 " + height + "이고 넓이가 " + getArea() + "인 사각형이다.";
	}
}

class Samgak extends Figure {

	int width;
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