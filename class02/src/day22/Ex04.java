package day22;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Ex04 {

	private HashSet<String> names;
	private HashMap<String, Student> studs;
	private Scanner sc;
	private String[] info;
	
	public Ex04() {
		
		initStudentNames();
		initStudentMap();
		
	}

	private void executeProgram() {
		sc = new Scanner(System.in);
		System.out.println("반가워요! 학생 정보 시스템이에용!");
		
		String command = "";
		boolean isRunning = true;
		while(isRunning) {
		
			System.out.print("원하는 메뉴를 선택하세요.\n학생 정보 조회 : 1\n학생 등록 : 2\n종료 : q\n----------------------------->");
			command = sc.next();
			sc.nextLine();
			if (command.equals("1")) {
				searchStudent();
			} else if (command.equals("2")) {
				insertStudent();
			} else if (command.equals("q")){
				isRunning = false;
			}
			
		}
		sc.close();
		
	}

	private void insertStudent() {
		System.out.print("학생의 이름, Java, DB, Web, JSP 성적을 입력하세요. (예 : 홍길동, 0, 0, 0, 0)\n");
		info = sc.nextLine().trim().split(",");
		try {
		studs.put(
				info[0].trim(), 
				new Student(
						info[0].trim(),
						Integer.parseInt(info[1].trim()),
						Integer.parseInt(info[2].trim()),
						Integer.parseInt(info[3].trim()),
						Integer.parseInt(info[4].trim())
							)
				);
		System.out.println("완료되었습니다.");
		} catch (Exception e) {
			System.out.println("잘못입력하셨습니다.");
		}
	}

	private void searchStudent() {
		System.out.println("조회할 학생의 이름을 입력하세요 : ");
		String name = sc.next();
		Student stud = studs.get(name);
		
		System.out.println("--------------------");
		if (stud != null) {
			System.out.println(name + "의 정보");
			System.out.println(stud);
		} else {
			System.out.println("해당 학생의 정보를 찾을 수 없습니다.");
		}
		System.out.println("--------------------");
	}

	private void initStudentMap() {
		studs = new HashMap<String, Student>();
		names.forEach(x -> studs.put(
									x, 
									new Student(
											x,
											(int) (Math.random() * 100 + 1),
											(int) (Math.random() * 100 + 1),
											(int) (Math.random() * 100 + 1),
											(int) (Math.random() * 100 + 1)
												)
									));
	}

	private void initStudentNames() {
		names = new HashSet<String>();
		names.add("둘리");
		names.add("또치");
		names.add("고길동");
		names.add("도우너");
		names.add("마이콜");
	}
	
	public static void main(String[] args) {
		new Ex04().executeProgram();
	}
}

class Student {
	private String name;
	private int java;
	private int db;
	private int web;
	private int jsp;
	private int total;
	public Student() {
		super();
	}
	public Student(String name, int java, int db, int web, int jsp) {
		super();
		this.name = name;
		this.java = java;
		this.db = db;
		this.web = web;
		this.jsp = jsp;
		this.total = setTotal();
	}
	public int getWeb() {
		return web;
	}
	public String getName() {
		return name;
	}
	public int getJava() {
		return java;
	}
	public int getDb() {
		return db;
	}
	public int getJsp() {
		return jsp;
	}
	public int setTotal() {
		return java + db + web + jsp;
	}
	@Override
	public String toString() {
		return "java = " + java + "\ndb = " + db + "\nweb = " + web + "\njsp = " + jsp + "\ntotal = "
				+ total;
	}
	
}
