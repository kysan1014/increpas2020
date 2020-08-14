package day22.source;

public class Nemo implements Comparable<Nemo>{

	private int garo;
	private int sero;
	private int area;
	
	public Nemo() {
		super();
	}

	public Nemo(int garo, int sero) {
		super();
		this.garo = garo;
		this.sero = sero;
		setArea();
	}

	public int getGaro() {
		return garo;
	}

	public void setGaro(int garo) {
		this.garo = garo;
	}

	public int getSero() {
		return sero;
	}

	public void setSero(int sero) {
		this.sero = sero;
	}

	public int getArea() {
		return area;
	}

	public void setArea() {
		this.area = garo * sero;
	}

	@Override
	public String toString() {
		return "Nemo [garo=" + garo + ", sero=" + sero + ", area=" + area + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + area;
//		result = prime * result + garo;
//		result = prime * result + sero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (getClass() != obj.getClass())
			return false;
		Nemo other = (Nemo) obj;
		if (area != other.getArea())
			return false;
		return true;
	}


	@Override
	public int compareTo(Nemo n) {
		return this.area - n.getArea();
	}

	
	
}
