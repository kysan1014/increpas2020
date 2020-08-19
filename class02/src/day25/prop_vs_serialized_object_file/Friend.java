package day25.prop_vs_serialized_object_file;

public class Friend {

	String name;
	int age;
	char gen;

	public Friend(String name, int age, char gen) {
		super();
		this.name = name;
		this.age = age;
		this.gen = gen;
	}

	public Friend() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGen() {
		return gen;
	}

	public void setGen(char gen) {
		this.gen = gen;
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + ", age=" + age + ", gen=" + gen + "]";
	}

}
