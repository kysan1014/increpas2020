package day16;

public class Test05 {
	public Test05() {

		Ifc ifc = new Ifc() {

			@Override
			public void figureThisOut() {
				youGetMe();
			}

			@Override
			public void youGetMe() {
				System.out.println("Not Profitable at all!");
			}

		};

		ifc.figureThisOut();

		ifc = new IfcImpl();

		ifc.figureThisOut();

		new Test05_01().print(new Ifc() {

			@Override
			public void figureThisOut() {
				youGetMe();
			}

			@Override
			public void youGetMe() {
				System.out.println("Haha!");
			}

		});

	}

	public static void main(String[] args) {
		new Test05();
	}
}

interface Ifc {
	void figureThisOut();

	void youGetMe();
}

class IfcImpl implements Ifc {

	@Override
	public void figureThisOut() {
		System.out.println("Isn't that just right though, innit?");
	}

	@Override
	public void youGetMe() {
		System.out.println("You get me?");
	}

}

class Test05_01 {
	public Test05_01() {
		System.out.println("Test-5_01");
	}

	void print(Ifc i) {
		i.figureThisOut();
	}
}
