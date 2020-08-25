package day12;

/*
	
	문제 2)
		
		1.	java, oracle, html, jsp, total 점수를 기억할 클래스를 만들고
			학생 한 명의 데이터를 입력해서 출력
			70~95 사이의 랜덤 점수
		
		2.	생성자 한수를 오버로딩하여
			4개 과목 점수를 입력해서 객체가 만들어지게 하세요
			출력
			
		3.	데이터를 관리할 배열 만들기
	
 */

public class Ex02 {

	Student[] students;
	int len = 3;
	
	public Ex02() {

		printRandomStudent();
		
		setStudents();
		
		printRandomStudents();
		
	}

	public void printRandomStudents() {
		for (int i = 0; i < len; i++) {
			System.out.println(students[i].toString());
		}
	}

	public void setStudents() {
		students = new Student[len];
		for (int i = 0; i < len; i++) {
			students[i] = new Student();
		}
	}
	
	public void printRandomStudent() {
		System.out.println(new Student().toString());
	}
	
	public static void main(String[] args) {
		new Ex02();
	}
	
}
