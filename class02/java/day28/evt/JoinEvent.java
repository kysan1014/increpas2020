package day28.evt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import day28.dao.MemberDao;
import day28.ui.MemberJoin;
import day28.vo.MemberVO;

public class JoinEvent implements ActionListener {

	private MemberJoin join;
	private MemberDao mDao;

	public JoinEvent(MemberJoin join) {
		this.join = join;
		mDao = new MemberDao();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		MemberVO mVO = new MemberVO();
		mVO.setId(join.id.getText().trim());
		mVO.setName(join.name.getText().trim());
		mVO.setPw(join.pw.getText().trim());
		mVO.setEmail(join.mail.getText().trim());
		mVO.setTel(join.tel.getText().trim());
		mVO.setGen(join.gen.getText().trim());
		mVO.setAno(Integer.parseInt(join.avt.getText().trim()));

		System.out.println(mVO.getName());
		
		int cnt = mDao.idCount(mVO.getId());
		if (cnt > 0) {
			JOptionPane.showMessageDialog(null, mVO.getId() + "는 현재 사용중인 아이디입니다.");
		} else {
			cnt = mDao.joinMember(mVO);

			if (cnt == 0) {
				JOptionPane.showMessageDialog(null, "잘못입력하셨습니다");
			} else {
				JOptionPane.showMessageDialog(null, "회원가입되었습니다.");
				join.id.setText("");
				join.name.setText("");
				join.pw.setText("");
				join.mail.setText("");
				join.tel.setText("");
				join.gen.setText("");
				join.avt.setText("");
				
			}
		}
	}

}
