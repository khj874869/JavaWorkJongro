package com.KH.day05.oop;

public class Book {
	//제목과 저자를 나타내는 필드를 가진 Book 클래스를 작성하고
	//생성자를 작성하여 필드를 초기화 하여라
	//클래스 바로 밑에 선언하는 변수 = 필드 = 멤버변수
	public String title ;
	 public String author;
	
public Book() {
//	초기화
	author = "";
	title = "";
}
public Book(String title) {
	this.title = title;
}
public Book(String title,String author) {
	this.title = title;
	this.author = author;
}
}