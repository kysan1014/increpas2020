package day25.extra;

//public class Semo extends Figure{
//
//	@Override
//	public void setArea(int x, int y) {
//		this.area = x * y / 2;
//		System.out.println(this.area);
//	}
//
//}
public class Semo extends Figure implements AreaSetter{

	@Override
	public double setArea(int ... args) {
		return args[0] * args[1] / 2.0;
	}


}
