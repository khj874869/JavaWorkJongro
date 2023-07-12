package com.KH.day13.swing.Student;

public class Student {
	private int Score; 
	private int SecScore;
	private String name;
	
	
	
	public Student(int Score,int SecScore, String name) {
		this.Score = Score;
		this.SecScore = SecScore;
		this.name = name;
	}
	public int getScore( ) {
		this.Score = Score;
		
		return Score;
	}
	public int getSecScore() {
		this.SecScore = SecScore;
		return SecScore;
	}
	public String getname() {
		this.name = name;
		return name;
	}
	public void setScore(int Score) {
		this.Score = Score;
	}
	public void setSecScore(int SecScore) {
		this.SecScore = SecScore;
	}
	public void setname(String name ) {
		this.name = name;
	}
}
