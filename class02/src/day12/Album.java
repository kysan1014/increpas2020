package day12;

import java.util.Arrays;

public class Album {

	public final int MAX_LENGTH = 12;

	private String singer;
	private int no;
	private String date;
	private String title;
	private Track[] tracks;
	
	public Album() {
		// TODO Auto-generated constructor stub
	}
	
	public Album(String singer, int no, String date, String title, Track[] tracks) {
		super();
		this.singer = singer;
		this.no = no;
		this.date = date;
		this.title = title;
		this.tracks = tracks;
	}
	
	public Album(String singer, int no, String date, String title) {
		super();
		this.singer = singer;
		this.no = no;
		this.date = date;
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Album [singer=" + singer + ", no=" + no + ", date=" + date + ", title=" + title + ", tracks="
				+ Arrays.toString(tracks) + "]";
	}

	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Track[] getTracks() {
		return tracks;
	}
	public void setTracks(Track[] tracks) {
		this.tracks = tracks;
	}
	
	
}
