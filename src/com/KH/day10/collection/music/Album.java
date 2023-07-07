package com.KH.day10.collection.music;

public class Album {
	private String singname;
	private String singer;
	
	
	public  Album(String singname ,String singer) {
		this.singname = singname;
		this.singer = singer;
	}
	public String getsingname() {
		return this.singname ;
	}
	public String getsinger() {
		return this.singer ;
	}
	public void setsingname(String singname) { 
		this.singname=singname;
	}
	public void setsinger(String singer) {
		this.singer = singer;		
	}
	@Override
	public String toString() {
		return "music title" + singname + "singer:" + singer +"]";
	}
	
}
