package day11;

public class Friend {

	private String name;
	private char gender;
	private int age;
	private String tel;
	private String address;

	public Friend(String name, char gender, int age, String tel, String address) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.tel = tel;
		this.address = address;
	}
	
	public Friend() {
		super();
	}

	@Override
	public String toString() {
		return "My Friend [name=" + name + ", gender=" + gender + ", age=" + age + ", tel=" + tel + ", address="
				+ address + "]";
	}
	

	public String toString(int index) {
		return "My Friend " + index + " [name=" + name + ", gender=" + gender + ", age=" + age + ", tel=" + tel + ", address="
				+ address + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
