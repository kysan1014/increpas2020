package day25.extra;

public class Won extends Figure implements AreaSetter{

	@Override
	public double setArea(int ... args) {
		return Math.PI * args[0] * args[0];
	}

}
