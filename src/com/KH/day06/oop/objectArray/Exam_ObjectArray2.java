package com.KH.day06.oop.objectArray;

import java.util.Scanner;
//기본형 boolean Byte char int long float double short 기본형
public class Exam_ObjectArray2 {
	public static void main(String[] args) {
	
		Book[] books = new Book[2];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<books.length ; i++)
		{
			System.out.print("제목 >>");
			String title = sc.nextLine();
			System.out.print("제목 >>");
			String author = sc.nextLine();
			books[i] = new Book(title,author);
			System.out.println("(" + books[i].title + "," + books[i].author + ")" );
		}
			
//		System.out.println("(" + books[0].title + "," + books[0].author + ")" );
//		
//		System.out.print("제목 >>");
//		 title = sc.nextLine();
//		System.out.print("제목 >>");
//		 author = sc.nextLine();
//		books[1] = new Book(title,author);
//		
//		System.out.println("(" + books[1].title + "," + books[1].author + ")" );
//		

		
	} 
}
