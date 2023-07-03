package com.KH.day06.oop.Student;

public class Student {
	//이름
	//첫번째 성적
	//두번째 입력
	//평균충력
	private String name ="";
	private int score =0;
	private int score1 =0;
	public Student() {
		name = "";
		score=0;
		score1=0;
	}
	public Student(String name, int score,int score1) {
		this.name = name;
		this.score = score;
		this.score1 = score1;
	}
	
	public double avg() {
		double avg = (double)(this.score+this.score1)/2;
		return avg;
	}
	public String getName() {
		return this.name;
	}
	public int getscore() {
		return this.score;
	}
	public int getscore1() {
		return this.score;
	}
	public void setscore(int score) {
		 this.score = score;		
	}
	public void setscore1(int score1) {
		this.score1 = score1;
	}
	public void setName(String name) {
		this.name = name;
	}

}

