package day22.source;

public class Student {
	private String name;
	private int ban;
	private int score;
	
	public Student(String name, int ban, int score) {
		super();
		this.name = name;
		this.ban = ban;
		this.score = score;
	}
	
	public Student() {
		super();
	}
	
	public String getName() {
		return name;
	}
	
	public int getBan() {
		return ban;
	}
	
	public int getScore() {
		return score;
	}
	
	public Student setScore(int score) {
		this.score = score;
		return this;
	}
	
//	@Override
//	public String toString() {
//		return "Student [name=" + name + ", ban=" + ban + ", score=" + score + "]";
//	}
	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ban;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		result = prime * result + score;
//		return result;
//	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (ban != other.ban)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (score != other.score)
			return false;
		return true;
	}
	
	
}
