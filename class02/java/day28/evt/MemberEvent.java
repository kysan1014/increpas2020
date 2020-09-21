package day28.evt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import day28.controller.Member;
import day28.dao.MemberDao;
import day28.vo.MemberVO;

public class MemberEvent implements ActionListener {
	
	private Member main;
	private MemberDao mDao;
	
	public MemberEvent() {}
	
	public MemberEvent (Member main) {
		this.main = main;
		this.mDao = new MemberDao();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();

		if (command.equals("회원리스트")) {
			getList();
		} else if (command.equals("회원가입")) {
			main.fr.dispose();
			main.join.setVisible(true);
			
		} else if (command.equals("닫기")) {
			System.exit(0);
		}
	}

	public void getList() {
		ArrayList<MemberVO> list = mDao.getList();
		for (MemberVO mVO : list) {
			System.out.println(mVO);
		}
	}
	
}
