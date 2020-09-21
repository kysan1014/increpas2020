package day28.sql;

public class MemberSQL {

	public final int SEL_MEMB_LIST = 1001;
	public final int SEL_MEMB_INFO = 1002;
	public final int SEL_MEMB_CNT = 1003;
	public final int INSERT_MEMB = 2001;

	public MemberSQL() {

	}

	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		
		switch (code) {
		
		case SEL_MEMB_LIST:
			buff.append("select mno, id, name, mail from member01 where isshow = 'Y'");
			break;

		case SEL_MEMB_INFO:
			buff.append("select mno, id, name, email, tel, avt, aname, m.gen, afile, dir");
			buff.append("from member01 m, avatar a");
			buff.append("where avt = ano");
			buff.append("and mno = ?");
			break;
			
		case SEL_MEMB_CNT:
			buff.append("select count(*) cnt ");
			buff.append("from member01 ");
			buff.append("where id = ? ");
			break;
			
		case INSERT_MEMB:
			buff.append("insert into member01 ");
			buff.append("( mno, id, pw, name, mail, tel, gen, avt)");
			buff.append("values");
			buff.append("( (select nvl(max(mno), 10) + 1 from member01), ?, ?, ?, ?, ?, ?, ?)");
			break;

		default:
			break;
		}
		return buff.toString();
	}
}
