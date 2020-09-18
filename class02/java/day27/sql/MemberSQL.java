package day27.sql;

public class MemberSQL {

	public final int SEL_ID_LIST = 1001;
	public final int SEL_ID_INFO = 1002;
	public final int SEL_ID_CNT = 1003;
	
	public final int EDIT_MEMB = 2001;
	public final int ADD_MEMB = 3001;
	
	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		
		switch (code) {
		case SEL_ID_LIST:
			buff.append("select id from member01 where isshow = 'Y'");
			break;
			
		case SEL_ID_INFO:
			buff.append("select id, name, mail, tel, gen, avt, joindate from member01 where id = ?");
			break;
			
		case SEL_ID_CNT:
			buff.append("select count(*) cnt from member01 where id = ?");
			break;
			
		case EDIT_MEMB:
			
			break;
			
		case ADD_MEMB:
			buff.append("insert into member01");
			buff.append("(mno, id, name, pw, mail, tel, gen, avt)");
			buff.append("values");
			buff.append("((select nvl(max(mno), 1000) + 1 from member01), ?, ?, ?, ?, ?, ?, ?)");
			break;
			
		default:
			break;
		}
		
		return buff.toString();
	}

}
