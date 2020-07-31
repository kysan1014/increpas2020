package day12;

public class Student {

	private int java = 0;
	private int oracle = 0;
	private int html = 0;
	private int jsp = 0;
	private int sum = 0;
	
	public Student() {
		this(	(int) (Math.random() * 26 + 70),
				(int) (Math.random() * 26 + 70),
				(int) (Math.random() * 26 + 70),
				(int) (Math.random() * 26 + 70)	);
	}
	
	public Student(int java, int oracle, int html, int jsp) {
		super();
		this.java = java;
		this.oracle = oracle;
		this.html = html;
		this.jsp = jsp;
		this.sum = java + oracle + html + jsp;
	}
	
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getOracle() {
		return oracle;
	}
	public void setOracle(int oracle) {
		this.oracle = oracle;
	}
	public int getHtml() {
		return html;
	}
	public void setHtml(int html) {
		this.html = html;
	}
	public int getJsp() {
		return jsp;
	}
	public void setJsp(int jsp) {
		this.jsp = jsp;
	}
	public int getSum() {
		return sum;
	}
	public void setSum() {
		sum = java + oracle + html + jsp;
	}
	@Override
	public String toString() {
		return "Student [java=" + java + ", oracle=" + oracle + ", html=" + html + ", jsp=" + jsp + ", sum=" + sum
				+ "]";
	}

	
	
}
