package day12;

import java.util.ArrayList;

public class Test02 {

	public Test02() {
		Member m = new Member();
		ArrayList<Member> mList = m.getMembers();

		m.toPrint("아이유", mList);
		m.toPrint("윤요셉", mList);
		
		m.toPrint(mList);
	}

	public static void main(String[] args) {
		new Test02();
	}

}

class Member {
	int mno;
	String id, name, mail, tel;
	char gen;

	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(int mno, String id, String name, String mail, String tel, char gen) {
		super();
		this.mno = mno;
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.tel = tel;
		this.gen = gen;
	}

	public String[] getIds() {
		return new String[] { "iu", "joseph", "wook", "chan", "jiwoo" };
	}

	public String[] getNames() {
		return new String[] { "아이유", "윤요셉", "윤병옥", "오혜찬", "이지우" };
	}

	public String[] getTels() {
		return new String[] { "010-1111-1111", "010-5069-8600", "010-2587-2304", "010-7648-5213", "010-3843-4798" };
	}

	public String[] getMails() {
		return new String[] { "iu@increpas.com", "joseph@increpas.com", "wook@increpas.com", "chan@increpas.com",
				"jiwoo@increpas.com" };
	}

	public char[] getGenders() {
		return new char[] { 'f', 'm', 'm', 'm', 'm' };
	}

	public ArrayList<Member> getMembers() {
		ArrayList<Member> mList = new ArrayList<Member>();

		String[] ids = getIds();
		String[] names = getNames();
		String[] mails = getMails();
		String[] tels = getTels();
		char[] genders = getGenders();

		for (int i = 0; i < getNames().length; i++) {
			mList.add(new Member(i, ids[i], names[i], mails[i], tels[i], genders[i]));
		}

		return mList;
	}

	// 회원 이름을 입력하면 해당 회원의 이름 출력
	public void toPrint(String name, ArrayList<Member> mList) {
		for (int i = 0; i < mList.size(); i++) {
			if (name.equals(mList.get(i).name)) {
				String msg = mList.get(i).toString();
				for (int j = 0; j < msg.length() + 3; j++)
					System.out.print("-");
				System.out.println();
				System.out.println(msg);
				for (int j = 0; j < msg.length() + 3; j++)
					System.out.print("-");
				System.out.println();
				break;
			}
		}
	}

	// 모든 회원 데이터 출력
	public void toPrint(ArrayList<Member> mList) {
		for (int i = 0; i < mList.size(); i++) {
			String msg = mList.get(i).toString();
			for (int j = 0; j < msg.length() + 3; j++)
				System.out.print("-");
			System.out.println();
			System.out.println(msg);
			for (int j = 0; j < msg.length() + 3; j++)
				System.out.print("-");
			System.out.println();
		}
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", id=" + id + ", mno=" + mno + ", mail=" + mail + ", tel=" + tel + ", gen="
				+ gen + "]";
	}

}