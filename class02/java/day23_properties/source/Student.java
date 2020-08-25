package day23_properties.source;

public class Student {

	private int id;
	private String name;
	private int java;
	private int db;
	private int jsp;
	private int web;
	private int total;

	public Student(int id, String name, int java, int db, int jsp, int web) {
		super();
		this.id = id;
		this.name = name;
		this.java = java;
		this.db = db;
		this.jsp = jsp;
		this.web = web;
		setTotal();
	}

	public Student() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getDb() {
		return db;
	}
	public void setDb(int db) {
		this.db = db;
	}
	public int getJsp() {
		return jsp;
	}
	public void setJsp(int jsp) {
		this.jsp = jsp;
	}
	public int getWeb() {
		return web;
	}
	public void setWeb(int web) {
		this.web = web;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal() {
		this.total = java + db + web + jsp;
	}
	
	public Object[] toArray() {
		return new Object[] {name, java, db, web, jsp};
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", java=" + java + ", db=" + db + ", jsp=" + jsp + ", web="
				+ web + ", total=" + total + "]";
	}
	


}
