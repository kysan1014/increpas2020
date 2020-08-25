package day21;

import java.text.MessageFormat;
import java.util.Vector;

public class Test01 {
	
	public Test01() {
		
	
		Vector<Stud> scores = new Vector<Stud>();
		
		initializeArray(scores);
		
		printScores(scores);
		
	}

	private void initializeArray(Vector<Stud> scores) {
		String[] names = {"A", "B", "C", "D", "E"};
		for (int i = 0; i < names.length; i++) {
			scores.add(new Stud(
								names[i],
								(int) (Math.random() * 100 + 1),
								(int) (Math.random() * 100 + 1),
								(int) (Math.random() * 100 + 1),
								(int) (Math.random() * 100 + 1)
								));
		}
	}
	
	private void printScores(Vector<Stud> scores) {
		System.out.println("	JAVA	DB	WEB	JSP");
		String format = "{0} :	{1},	{2},	{3},	{4}";
		MessageFormat form = new MessageFormat(format);
		for (int i = 0; i < scores.size(); i++) {
			System.out.println(form.format(scores.get(i).toArray()));
		}
	}

	public static void main(String[] args) {
		new Test01();
	}
}

//class Stud {
//	private String name;
//	private int java;
//	private int db;
//	private int jsp;
//	private int web;
//
//	public Stud(String name, int java, int db, int jsp, int web) {
//		super();
//		this.name = name;
//		this.java = java;
//		this.db = db;
//		this.jsp = jsp;
//		this.web = web;
//	}
//	public Stud() {
//		super();
//	}
//	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getJava() {
//		return java;
//	}
//	public void setJava(int java) {
//		this.java = java;
//	}
//	public int getDb() {
//		return db;
//	}
//	public void setDb(int db) {
//		this.db = db;
//	}
//	public int getJsp() {
//		return jsp;
//	}
//	public void setJsp(int jsp) {
//		this.jsp = jsp;
//	}
//	public int getWeb() {
//		return web;
//	}
//	public void setWeb(int web) {
//		this.web = web;
//	}
//	
//	public Object[] toArray() {
//		return new Object[] {name, java, db, web, jsp};
//	}
//	
//	@Override
//	public String toString() {
//		return "Scores [name=" + name + ", java=" + java + ", db=" + db + ", jsp=" + jsp + ", web=" + web + "]";
//	}
//	
//	
//	
//}