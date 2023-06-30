package com.KH.day05.oop;

public class Exam_ThisConstructor {
	public static void main(String [] args) {
		Book2 book= new Book2();
		Book2 loveStory = new Book2("춘향뎐");
		System.out.println(loveStory.title + ", " + loveStory.author);
//		Circle2 circle = new Circle2();
//		circle.radius = 12;
//		System.out.print("원의 넓이는" + circle.getArea());		
	}
}
class Circle2 {
	public int radius;
	public String name;
	
	public Circle2() {
		
	}
	public double getArea() {
		return	radius * radius * 3.14;
		
	}
}
class Book2 {
	public String title;
	public String author;
	
public Book2() {
	System.out.println("생성자 호출됨.");
}
public Book2(String title) {
//	this.title = title;
	this(title,"작자미상");
}
public Book2(String title, String author) {
	this.title = title;
	this.author = author;
}
}

	
