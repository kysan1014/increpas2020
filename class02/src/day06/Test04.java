package day06;

import javax.swing.JOptionPane;

public class Test04 {

	/*
		1. 정수 랜덤 발생
		2. 숫자 입력 받기
		3. 같은 숫자가 입력될 경우 종료
		(while 문 사용)
	 */
	
	public static void main(String[] args) {
	
		int rand = (int) (Math.random() * 90 + 10);
		boolean isSameNumber = true;
		String snum = "";
		String msg = "";
		
		while(isSameNumber) {
			snum = JOptionPane.showInputDialog(String.format("숫자를 입력하세요.\n랜덤생성 수 : %d\n빠른 탈주 : q", rand)).trim();
			
			if (snum.equals("q")) break;
			
			int num = Integer.parseInt(snum);
			
			if (rand == num) {
				msg = "수고하셨습니다.";
				isSameNumber = false;
			} else if (rand < num) {
				msg = String.format("입력하신 수 [ %d ]는 랜덤생성된 수보다 큽니다.", num);
			} else {
				msg = String.format("입력하신 수 [ %d ]는 랜덤생성된 수보다 작습니다.", num);
			}
			
			JOptionPane.showMessageDialog(null, msg);
			
		}
		
		System.out.println("시스템 종료");
		
	}
	
}
