package day23_properties.src1;

public class Nemo implements Figure{

	int garo;
	int sero;
	int area;
	
	public Nemo(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		setArea();
	}
	
	public void setArea() {
		area = garo * sero;
	}

	@Override
	public double getArea() {
		return area;
	}

	@Override
	public void toPrint() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Nemo [garo=" + garo + ", sero=" + sero + ", area=" + area + "]";
	}

	
}
