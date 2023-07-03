package com.KH.day06.oop.objectArray.exercise;

import java.util.Scanner;

public class Exercies_ScoreProgram {
	
//	static int kor =0;
//	static int eng =0;
//	static int math =0;
//	static int sum =0;

	static int index =0;
	public static void main(String [] args) 
	{
		Student [] stds = new Student[3];
		finish : 
		while(true) {
			Scanner sc = new Scanner(System.in);
			printmenu();
			int val = sc.nextInt();
			
			switch(val) 
			{
			case 1 : inputScore(stds);
			break;			
			case 2:  printScore(stds)
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
	public static void inputScore(Student[] stds) {
		Scanner sc = new Scanner(System.in);
//			for(int i = 0 ; i <stds.length;i++) {
				System.out.println("=========이름 입력==========="); 		
				stds[index] = new Student();
				//문자열 입력받는 메소드 next(),nextLine();
				//next() 공백없는 문자열
				//netLine() " 공백 있는 문자열 ex.주소
				System.out.print("이름 :" );
				stds[index].name = sc.next();
				System.out.println("=========성적 입력==========="); 		
				System.out.print("국어 :" );
				stds[index].kor=sc.nextInt();
				System.out.print("수학 :" );
				stds[index].math =sc.nextInt();
				System.out.print("영어 :");
				stds[index].eng=sc.nextInt();
				if(index<stds.length-1) index++;
	}
//	}
		
		
	
	public static void printScore(Student[] stds) {
		for(int i =0; i<=index;i++) {
//		stds[i].sum = stds[i].kor + stds[i].math + stds[i].eng;
		System.out.println("이름 :" + stds[i].name);
		System.out.println("국어 :" + stds[i].kor);
		System.out.println("수학 :" + stds[i].math);
		System.out.println("영어 :"+ stds[i].eng);
		System.out.println("총점:"+stds[i].getTotal());
		System.out.printf("평균: %.2f\n" , stds[i].getAvg());
		}
//		if(i<stds.length-1) i++;
	
	}
	public static void showGoodByte() {
		System.out.println("프로그램 종료");
	}
	public static void printException() {
		System.out.println("잘못 입력했습니다.");
	}
				}