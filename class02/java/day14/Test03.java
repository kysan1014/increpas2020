package day14;

public class Test03 {

	public Test03() {
		Object[] obj = new Object[5];
		obj[0] = "문자열";
		obj[1] = 100;
		obj[2] = 'a';
		obj[3] = 3.14;
		obj[4] = true;

		for (int i = 0; i < obj.length; i++) {
			System.out.print("obj[i] is an instance of a ");
			if (obj[i] instanceof String) {
				System.out.print("String");
			} else if (obj[i] instanceof Integer) {
				System.out.print("Integer");
			} else if (obj[i] instanceof Character) {
				System.out.print("Character");
			} else if (obj[i] instanceof Double) {
				System.out.print("Double");
			} else if (obj[i] instanceof Boolean) {
				System.out.print("Boolean");
			} else {
				System.out.print("Object");
			}
			System.out.println(" Class");
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
