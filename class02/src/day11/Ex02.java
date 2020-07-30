package day11;

import java.util.ArrayList;

public class Ex02 {

	ArrayList<Friend> friendList;

	String[] names;
	char[] genders;
	int[] ages;
	String[] tels;
	String[] addresses;

	public Ex02() {
		setFriendsInformation();

		storeFriendsInformationToList();

		for (int i = 0; i < friendList.size(); i++) {
			System.out.println(friendList.get(i).toString(i + 1));
		}

	}

	public void storeFriendsInformationToList() {
		friendList = new ArrayList<Friend>();
		for (int i = 0; i < names.length; i++) {
			friendList.add(new Friend(names[i], genders[i], ages[i], tels[i], addresses[i]));
		}
	}

	public void setFriendsInformation() {
		names = new String[] { "홍길동", "김길동", "박길동" };
		genders = new char[] { 'm', 'm', 'm' };
		ages = new int[] { 1, 2, 3 };
		tels = new String[] { "010-0000-0001", "010-0000-0002", "010-0000-0003" };
		addresses = new String[] { "서울", "대전", "대구" };
	}

	public static void main(String[] args) {
		new Ex02();

		for (String arg : args) {
			System.out.println(arg);
		}
	}

}
