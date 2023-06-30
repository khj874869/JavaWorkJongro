package com.KH.day05.oop;

public class Circle {
	public int radius;  //원반지름
	public String name; //원이름
 //=============>필드
	public Circle() { //생성자 (기본) 객체 이름이 없고 생성자와 동일하며 리턴값이 없다.
		//초기화 기본 생성자는 생략이 가능하다. 반드시 호출되기 때문에.
		radius = 1;
		name = "아무개"; // 필드에 값을 넣음 -> 객체 초기화 
		//생성자 new를 통해 객체 생성 객체당 한번 호출
		
	}
	//매개변수가 있는 생성자 
	public Circle (int radius, String name) {
		this.radius = radius;
		this.name = name ;
	}
	//======================>생성자
	public double getArea() { //원 넓이 구해주는 메소드
		return 3.14*radius*radius;
	}
	//============================>메소드
public static void main(String [] args) {
	Circle pizza;
	pizza = new Circle();
	pizza.name = "청년피자";
	double area = pizza.getArea();
	System.out.println(pizza.name + "의 면적은"+area);
	
	Circle donut = new Circle();
	donut.radius = 2;
	donut.name = "청년도넛";
	area = donut.getArea();
	System.out.printf("%s의 면적은 %.2f",donut.name,area);
}
}