package day25;

import java.io.Serializable;

public class Friend implements Serializable{

	private String name;
	private int age;
	private double height;
	private char gen;
	private String mail;
	private String tel;
	
	public Friend(String name, int age, double height, char gen, String mail, String tel) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.gen = gen;
		this.mail = mail;
		this.tel = tel;
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
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public char getGen() {
		return gen;
	}
	public void setGen(char gen) {
		this.gen = gen;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Override
	public String toString() {
		return "Friend [name=" + name + ", age=" + age + ", height=" + height + ", gen=" + gen + ", mail=" + mail
				+ ", tel=" + tel + "]";
	}

}
