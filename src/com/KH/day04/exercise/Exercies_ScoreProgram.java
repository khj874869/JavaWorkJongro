package com.KH.day04.exercise;

import java.util.Scanner;

public class Exercies_ScoreProgram {
	public static void main(String [] args) 
	{
		int sum =0;
		int kor =0;
		int eng =0;
		int math =0;
		finish : 
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("=========메인 메뉴===========");
			System.out.println("1.성적입력");
			System.out.println("2.성적출력");
			System.out.println("3.종료");
			System.out.print("선택 : " );
			int val = sc.nextInt();
			
			switch(val) 
			{
			case 1 : System.out.println("=========성적 입력==========="); 		
			System.out.print("국어 :" );
			kor=sc.nextInt();
			System.out.print("수학 :" );
			math =sc.nextInt();
			System.out.print("영어 :");
			eng=sc.nextInt();
			break;			
			case 2: 
				sum = kor + math + eng;
			System.out.println("국어 :" + kor);
			System.out.println("수학 :" + math);
			System.out.println("영어 :"+ eng);
			System.out.println("총점:"+sum);
			System.out.printf("평균: %.2f\n" , (double)sum/3);
			break;
			case 3: System.out.println("프로그램 종료");break finish;
			default : System.out.println("잘못 입력했습니다.");
			}
			}
			}
				}

