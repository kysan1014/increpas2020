package day12;

import javax.swing.JOptionPane;

/*

	1.
		노래 한 곡을 저장할 클래스를 정의하고
		앨범 한 장(12곡)을 저장할 배열을 만들고 내용을 출력하는 프로그램 작성

	2. 곡 명을 입력하면, 해당 곡의 정보를 출력
	

 */

public class Ex01 {

	Album album;

	public Ex01() {

		setAlbumInformation();
		printAlbumInfo();

		String songName = null;
		while (songName == null || songName.equals("")) {
			songName = JOptionPane.showInputDialog("노래 제목을 입력하세요.").trim();
		}
		System.out.println("\n");
		findTrackInfo(songName);

	}

	private void setAlbumInformation() {

		String singer = "아이유";
		int no = 4;
		String date = "2018";
		String title = "Palette";

		album = new Album(singer, no, date, title);

		Track[] tracks = new Track[album.MAX_LENGTH];

		tracks[0] = new Track(1, "이 지금", "", "김제휘", "아이유", "김제휘", "");
		tracks[1] = new Track(2, "팔레트 (Feat. G-DRAGON)", "", "아이유", "아이유", "이종훈", "");
		tracks[2] = new Track(3, "이런 엔딩", "", "샘김", "아이유", "이종훈", "");
		tracks[3] = new Track(4, "사랑이 잘 (With 오혁)", "", "이종훈, 아이유, 오혁", "아이유, 오혁", "이종훈", "");
		tracks[4] = new Track(5, "잼잼", "", "선우정아", "선우정아, 아이유", "선우정아, 윤석철", "");
		tracks[5] = new Track(6, "Black Out", "", "이종훈", "아이유", "이종훈", "");
		tracks[6] = new Track(7, "마침표", "", "손성제", "아이유", "손성제", "");
		tracks[7] = new Track(8, "밤편지", "", "김희원, 김제휘", "아이유", "김희원, 김제휘", "");
		tracks[8] = new Track(9, "그렇게 사랑은", "", "이병우", "이병우", "이병우", "");
		tracks[9] = new Track(10, "이름에게", "", "이종훈", "아이유, 김이나", "이종훈, 홍소진", "");

		album.setTracks(tracks);

	}

	public void printAlbumInfo() {
		for (int i = 0; i < album.getTracks().length; i++) {
			if (album.getTracks()[i] != null)
				System.out.println(album.getTracks()[i].toString());
			else
				break;
		}
	}

	public void findTrackInfo(String songName) {
		int index = -1;
		for (int i = 0; i < album.getTracks().length; i++) {
			if (album.getTracks()[i] == null) {
				break;
			}
//			System.out.println(album.getTracks()[i].getName() + " : " + songName);
			if (album.getTracks()[i].getName().equals(songName)) {
				index = i;
				break;
			}
		}
		if (index > 0) {
			System.out.println(album.getTracks()[index].toString());
		} else {
			System.out.println("해당 트랙은 존재하지 않습니다.");
		}
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
