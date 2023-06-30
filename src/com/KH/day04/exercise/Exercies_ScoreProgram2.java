package com.KH.day04.exercise;
import java.util.Scanner;

import com.KH.day05.oop.exercise.Student;

public class Exercies_ScoreProgram2 {
	Student student = new com.KH.day05.oop.exercise.Student();

	public static void main(String [] args) 
	{
		finish : 
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			printmenu();
			int val = sc.nextInt();
			
			switch(val) 
			{
			case 1 : Student.inputStudentScore();
			break;			
			case 2: Student.printStudentScore();
			;
			break;
			case 3: showGoodByte();break finish;
			default : printException();
			}
			}
			}
	
	public static void printmenu() {
		System.out.println("=========메인 메뉴===========");
		System.out.println("1.성적입력");
		System.out.println("2.성적출력");
		System.out.println("3.종료");
		System.out.print("선택 : " );
		
	}
	

	public static void showGoodByte() {
		System.out.println("프로그램 종료");
	}
	public static void printException() {
		System.out.println("잘못 입력했습니다.");
	}
				}