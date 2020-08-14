package day22.source;

public class Semo {

	int base;
	int height;
	double area;
	public Semo(int base, int height) {
		super();
		this.base = base;
		this.height = height;
		setArea();
	}
	
	public int getBase() {
		return base;
	}
	
	public int getHeight() {
		return height;
	}
	
	public double getArea() {
		return area;
	}

	public void setArea() {
		this.area = base * height / 2.0;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(area);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + base;
		result = prime * result + height;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Semo other = (Semo) obj;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
			return false;
		if (base != other.base)
			return false;
		if (height != other.height)
			return false;
		return true;
	}
	
	
	
}
