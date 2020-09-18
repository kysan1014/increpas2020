package day27.vo;

import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;

public class MemberVO {

	private int mno;
	private int avt;
	private String id;
	private String pw;

	private String name;
	private String mail;
	private String tel;
	private String gen;
	private String sdate;
	private String avatar;
	private Date joinDate;
	private Time joinTime;
	
	public MemberVO() {}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public int getAvt() {
		return avt;
	}

	public void setAvt(int avt) {
		this.avt = avt;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getGen() {
		return gen;
	}

	public void setGen(String gen) {
		this.gen = gen;
	}

	public String getSdate() {
		return sdate;
	}

	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	
	public void setSdate() {
		SimpleDateFormat form1 = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat form2 = new SimpleDateFormat("HH:mm:ss");
		this.sdate = form1.format(joinDate) + " " + form2.format(joinTime);
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public Time getJoinTime() {
		return joinTime;
	}

	public void setJoinTime(Time joinTime) {
		this.joinTime = joinTime;
	}

	
	
}
