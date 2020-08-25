package day25.extra;

//public class Nemo extends Figure{
//
//}
public class Nemo extends Figure implements AreaSetter{

	@Override
	public double setArea(int ... args) {
		return args[0] * args[1] * 1.0;
	}

}

