package com.KH.day10.collection.Student;

public class Student {
private String name;
private int firstScore;
private int secondScore;

public Student() {
	
}
public Student(String name, int firstScore,int secondScore) {
	this.name = name;
	this.firstScore = firstScore;
	this.secondScore = secondScore;

}
public String getname(){

	return this.name; 
}
public int getfirstScore() {
	return this.firstScore ;
}
public int getsecondScore() {
	return this.secondScore  ;
}
public void setname (String name) {
	this.name = name;
}
public void setfirstScore (int firstScore) {
	this.firstScore = firstScore;
}
public void setsecondScore (int secondScore) {
	this.secondScore = secondScore;
}
@Override 
public String toString() {
return "name :"+	this.name + ","+"firstScore:" + this.firstScore + ","+"secondScore:"+ this.secondScore;
}
@Override
	public int hashCode() {
		return (this.name+this.firstScore+this.secondScore).hashCode();//Set은 해쉬코드로 비교가능

}
@Override
	public boolean equals(Object obj) {
	if(obj instanceof Student) {
		Student std = (Student)obj;
		return this.hashCode() == std.hashCode();
	}else {
		return false;
	}
	}
}



