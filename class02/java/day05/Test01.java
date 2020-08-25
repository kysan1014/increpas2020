package day05;

import javax.swing.JOptionPane;

public class Test01 {

	// 지역번호를 입력하면 지역을 출력하는 프로그램

	public static void main(String[] args) {

		String code = JOptionPane.showInputDialog("지역번호를 입력하세요.");

		String slocal = "";

		switch (code) {

		case "02":
			slocal = "서울";
			break;

		case "031":
			slocal = "경기";
			break;

		case "032":
			slocal = "인천";
			break;

		case "033":
			slocal = "강원";
			break;

		case "041":
			slocal = "충남";
			break;

		case "042":
			slocal = "대전";
			break;

		case "043":
			slocal = "충북";
			break;

		case "051":
			slocal = "부산";
			break;

		case "052":
			slocal = "울산";
			break;

		case "053":
			slocal = "대구";
			break;

		case "054":
			slocal = "경북";
			break;

		case "055":
			slocal = "경남";
			break;

		case "061":
			slocal = "전남";
			break;

		case "062":
			slocal = "광주";
			break;

		case "063":
			slocal = "전북";
			break;

		case "064":
			slocal = "제주";
			break;

		default:
			slocal = "";
			break;

		}

		/*
			구 버전의 자바에서는 switch case 구문에서 
			문자열 데이터의 비교를 지원하지 않았음
			1.6 버전부터 문자열 비교를 지원
		 */
		
		String msg = "";
		if (slocal.length() == 2) {
			msg = String.format("입력하신 [ %s ]는 [ %s ]의 지역번호 입니다.", code, slocal);
		} else {
			msg = String.format("입력하신 [ %s ]는 지역번호가 아닙니다..", code, slocal);
		}
		
		JOptionPane.showMessageDialog(null, msg);

	}

}
