package day11;

public class Test06 {

	/*
		친구의 정보를 Person에 담아 출력
	 */
	
	String[] names;
	String[] tels;
	String[] emails;
	char[] genders;
	int[] ages;

	Person[] people;
	
	public Test06() {
		
		setArrays();
		setMany();
		printMany();

	}
	
	public void printMany() {
		for (Person person : people) {
			System.out.println(person);
		}
	}
	
	public void setMany() {
		// 친구 배열 초기화
		setArrays();
		
		// people 배열 선언
		people = new Person[names.length];
		
		// people 배열에 친구의 정보를 담은 Person 인스턴스 저장
		for (int i = 0; i < people.length; i++) {
			people[i] = new Person(names[i], ages[i], genders[i], tels[i], emails[i]);
		}
		
	}

	public void setArrays() {
		names = new String[] {"아이유","윤요셉","윤병옥","오혜찬","이지우"};
		tels = new String[] {"010-1111-1111","010-5069-8600","010-2587-2304","010-7648-5213","010-3843-4798"};
		emails = new String[] {"iu@increpas.com","joseph@increpas.com","wook@increpas.com","chan@increpas.com","jiwoo@increpas.com"};
		genders = new char[] {'f','m','m','m','m'};
		ages = new int[] {28, 33, 29, 28, 26};
	}

	public static void main(String[] args) {
		new Test06();
	}

}
