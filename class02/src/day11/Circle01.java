package day11;

public class Circle01 {
	final double PI = 3.14;
	/*
	 * 변수 만드는 형식
	 * 
	 * 	[접근지정자] [속성] 데이터타입 변수이름;
	 * 
	 * 참고 )
	 * 
	 * 		접근지정자는 public, protected, default, private이 있다.
	 * 
	 * 		위의 PI변수의 final은 변수의 내용을 더이상 변경할 수 없게 만드는 속성
	 */
	int radius;
	double circonference, area;

	// 반지름 대입해주는 함수

	public void setRadius(int radius) {
		this.radius = radius;
		setCirconference();
		setArea();
	}

	// 둘레 계산해서 대입해주는 함수
	public void setCirconference() {
		if (radius > 0) {
			this.circonference = (int) (2 * radius * PI * 100 + 0.5) / 100.;
		} else {
			System.out.println("Cannot set the circonference without a radius value");
		}
	}
	
	// 넓이 계산해서 대입해주는 함수
	public void setArea() {
		if (radius > 0) {
			this.area = (int) (radius * radius * PI * 100 + 0.5) / 100.;
		} else {
			System.out.println("Cannot set the area without a radius value");
		}
	}

}
