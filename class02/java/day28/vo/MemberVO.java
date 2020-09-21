package day28.vo;

import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;

public class MemberVO {

	private int mno,ano;
	private String id, pw, name, email, tel, avatar, aname, gen, afile, dir, sdate;
	private Date joinDate;
	private Time joinTime;
	
	public MemberVO() {

	}
	
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public String getAfile() {
		return afile;
	}
	public void setAfile(String afile) {
		this.afile = afile;
	}
	public String getDir() {
		return dir;
	}
	public void setDir(String dir) {
		this.dir = dir;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	
	public String getSdate() {
		return sdate;
	}

	public void setSdate() {
		this.sdate = new SimpleDateFormat("yyyy/MM/dd").format(joinDate) 
				+ " " + new SimpleDateFormat("HH:mm:ss").format(joinTime);
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

	@Override
	public String toString() {
		return "MemberVO [mno=" + mno + ", ano=" + ano + ", id=" + id + ", pw=" + pw + ", name=" + name + ", email="
				+ email + ", tel=" + tel + ", avatar=" + avatar + ", aname=" + aname + ", gen=" + gen + ", afile="
				+ afile + ", dir=" + dir + ", sdate=" + sdate + ", joinDate=" + joinDate + ", joinTime=" + joinTime
				+ "]";
	}


	
}
