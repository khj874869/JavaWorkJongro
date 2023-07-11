package com.KH.day12.music.model.vo;

public class Music {
	//field 생성
	private String title ;
	private String singer;
	//생성자, getter/setter, toString(), .... 자동완성 가능함
	public Music() {
		super();
	}
	public Music(String title) {
		super();
		this.title= title;
	}
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}
	

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
	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}
}
