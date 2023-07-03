package com.KH.day06.oop.objectArray.exercise;

public class Student {
	 String name = "";
	 int kor,eng,math,sum =0;
	 

public Student() {
	name = "";
	kor = 0;
	eng = 0;
	math = 0;
	sum = 0;
}
public Student(String name ) {
	this.name = name;
	
}
public Student(int kor,int eng,int math ,int sum)
{
	this.kor = kor;
	this.eng = eng;
	this.math = math;
	this.sum = sum;
}
public Student(String name, int kor,int math, int eng , int sum) {
	this.name = name;
	this.kor = kor;
	this.eng = eng;
	this.math = math;
	this.sum = sum;
	
}
//합계 메소드
	public int getTotal() {
		int total = this.kor + this.math + this.eng;
		return total;
	}
//평균 메소드
	public double getAvg() {
		double avg= (double)this.getTotal()/3;
		return avg;
	}

}
