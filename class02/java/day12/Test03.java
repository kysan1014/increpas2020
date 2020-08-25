package day12;

public class Test03 {

	public Test03() {
	
		Saram s;
		if ((s = new Saram("ㅎ",1)) != null) {
			System.out.println(s.toString());
		}
			
	
	}
	
	public static void main(String[] args) {
		new Test03();
		
	}
	
}

class Saram {
	String name;
	int age;
	
	public Saram(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void toPrint() {
		System.out.println(name + " - " + " age");
	}

	@Override
	public String toString() {
		return "Saram [name=" + name + ", age=" + age + "]";
	}
	
}