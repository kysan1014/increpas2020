package day15;

public class Test00 {

	public Test00() {

		Saram[] nugu = new Saram[5];
		String[] names = {"윤요셉", "유병욱", "오혜찬", "이지우", "장성환"};
		int[] ages = {33, 29, 28, 26, 27};
		char gen = 'M';
		
		for (int i = 0; i < nugu.length; i++) {
			nugu[i] = new Saram(names[i], ages[i], gen);
		}
	
		for (Saram saram : nugu) {
			System.out.println(saram.toString());
		}
		
	}
	
	public static void main(String[] args) {
		new Test00();
	}
	
}

class Saram {
	
	String name;
	int age;
	char gen;
	
	public Saram() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Saram(String name, int age, char gen) {
		super();
		this.name = name;
		this.age = age;
		this.gen = gen;
	}

	@Override
	public String toString() {
		return "Saram [ name = " + name + ", age = " + age + ", gen = " + gen + " ]";
	}
	
	
}