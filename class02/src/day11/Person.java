package day11;

public class Person {

	private String name;
	private int age;
	private char gender;
	private String tel;
	private String email;
	
	public Person(String name, int age, char gender, String phone, String email) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.tel = phone;
		this.email = email;
	}
	
	

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", tel=" + tel + ", email=" + email
				+ "]";
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
	public String getPhone() {
		return tel;
	}
	public void setPhone(String phone) {
		this.tel = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
