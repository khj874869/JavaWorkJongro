package com.KH.day05.oop.exercise;

import java.util.Scanner;

public  class Student {
	public static String name;
	public static int kor;
	public static int math;
	public static int eng;
	public static int sum;
	public static void printStudentScore() {
		Student.sum = Student.kor + Student.math + Student.eng;
		System.out.println("국어 :" + Student.kor);
		System.out.println("수학 :" + Student.math);
		System.out.println("영어 :"+ Student.eng);
		System.out.println("총점:"+Student.sum);
		System.out.printf("평균: %.2f\n" , (double)Student.sum/3);
	}
	public static void inputStudentScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=========성적 입력==========="); 		
		System.out.print("국어 :" );
		Student.kor=sc.nextInt();
		System.out.print("수학 :" );
		Student.math =sc.nextInt();
		System.out.print("영어 :");
		Student.eng=sc.nextInt();
	}
}
