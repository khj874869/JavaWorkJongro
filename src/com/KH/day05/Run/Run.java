package com.KH.day05.Run;

import java.util.Scanner;

import com.KH.day05.oop.Book;
import com.KH.day05.oop.Circle;
import com.KH.day05.oop.exercise.Rectangle;

public class Run {
	public static void main(String [] args) 
	{
		Scanner sc = new Scanner(System.in);
		
//	Circle circle = new Circle();
//	Circle circle2 = new Circle();
//	Circle circle3 = new Circle();
//	Circle circle4 = new Circle();
//
//	circle.radius = 1;
//	circle2.radius = 2;
//	circle3.radius = 3;
//	System.out.println(circle.getArea());
//	System.out.println(circle2.getArea());
//	System.out.println(circle3.getArea());
		Circle pizza;
		pizza = new Circle(10,"청년피자");
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은"+area);
		
		Circle donut = new Circle(2,"청년도넛");
		area = donut.getArea();
		System.out.printf("%s의 면적은 %.2f",donut.name,area);
			
		Book littleprince = 
				new Book("어린왕자","생텍쥐페리");	
		Book loveStory 
		=new Book("춘향뎐");
		System.out.println(littleprince.title+","+littleprince.author);
		System.out.println(loveStory.title+loveStory.author);

		Rectangle rectangle = new Rectangle();
		System.out.print("너비를 입력해주세요 : ");
		rectangle.width = sc.nextInt();
		System.out.print("높이를 입력해주세요 : ");
		rectangle.height = sc.nextInt();
		double result = rectangle.rectangle_Area();
		System.out.println(result);
	}
}
