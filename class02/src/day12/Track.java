package day12;

public class Track {

	private int no;
	private String name;
	private String runningTime;
	private String composer;
	private String lyricist;
	private String arranger;
	private String lyrics;
	
	public Track() {
		super();
	}
	
	public Track(int no, String name, String runningTime, String composer, String lyricist, String arranger,
			String lyrics) {
		super();
		this.no = no;
		this.name = name;
		this.runningTime = runningTime;
		this.composer = composer;
		this.lyricist = lyricist;
		this.arranger = arranger;
		this.lyrics = lyrics;
	}

	@Override
	public String toString() {
		return "Track [no=" + no + ", name=" + name + ", runningTime=" + runningTime + ", composer=" + composer
				+ ", lyricist=" + lyricist + ", arranger=" + arranger + ", lyrics=" + lyrics + "]";
	}


	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRunningTime() {
		return runningTime;
	}
	public void setRunningTime(String runningTime) {
		this.runningTime = runningTime;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public String getLyricist() {
		return lyricist;
	}
	public void setLyricist(String lyricist) {
		this.lyricist = lyricist;
	}
	public String getArranger() {
		return arranger;
	}
	public void setArranger(String arranger) {
		this.arranger = arranger;
	}
	public String getLyrics() {
		return lyrics;
	}
	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}
	
}
