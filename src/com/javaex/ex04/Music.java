package com.javaex.ex04;

public class Music {
	
	private String title;
	private String singer;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	
	public void showInfo() {
		System.out.println(singer + ", " + title + "(" + album + "," + year + "," + track + "track, " + composer + "작곡)" );
	}
	
	

}
