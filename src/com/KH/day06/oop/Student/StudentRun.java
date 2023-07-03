package com.KH.day06.oop.Student;

import java.util.Scanner;

public class StudentRun {
	static int index= 0;
public static void main(String[] args) {
	
	Student [] student =  new Student[3];
	
	finish :
	while(true) {
		int val = printmenu();
		switch(val) {
		case 1 : inputscore(student); break;		
		case 2 : outputscore(student);  break;
		case 3 : correct(student);  break;
		case 4 : showGoodByte();  break finish;
		default : printException();
		}
		}	
	
}

public static void inputscore(Student[] student) {
	Scanner sc = new Scanner(System.in);
	for(int i = 0 ; i<student.length;i++) 
	{		
		student[i] = new Student();
		System.out.print("학생 이름 입력");
		String name = sc.next();
		System.out.print("1차 점수 입력:");
		int score= sc.nextInt();
		System.out.print("2차 점수 입력:");
		int score1 = sc.nextInt();
		student[i] = new Student();
		student[i].setName(name);
		student[i].setscore(score);
		student[i].setscore1(score1);
		
		if(index < student.length-1 ) index++; 
	}
}
public static void outputscore (Student[] student) {
	for(int i = 0; i <student.length ; i++) {	
		System.out.println((i+1)+"번째 학생 정보 출력");
		System.out.println(student[i].getName() +" 학생의 점수는 1차 점수 : " 
				+ student[i].getscore() + "점, 2차 점수 : " 
				+ student[i].getscore1() + "점입니다.");	}
}
public static void correct (Student[] student)
{
	for(int i =0; i<student.length ; i++) {
		double avg = student[i].avg();
		int num1 = student[i].getscore();
		int num2 = student[i].getscore1();
	if(60.00<=student[i].avg()) {
		if(num1<40) {			
			System.out.println((i+1)+"번째, " + student[i].getName() + "학생 확인 결과");
			System.out.println("1차 재평가 대상입니다..");
		}else if(num2 <40){
			System.out.println("2차 재평가 대상입니다..");
		}
		System.out.println("합격 하였습니다.");
	}else{
		if(num1<60) {
			System.out.println("1차 재평가 대상입니다..");
			}
		
	}if(num2<60){
		System.out.println("2차 재평가 대상입니다.");
		
	}
	
	
}
}
public static int printmenu() {
	System.out.println("=========메인 메뉴===========");
	System.out.println("1.성적입력");
	System.out.println("2.성적출력");
	System.out.println("3.재평가여부");
	System.out.println("4.종료");
	System.out.print("선택 : " );
	Scanner sc = new Scanner(System.in);
	int val = sc.nextInt();
	System.out.println(1);
	System.out.println('A');
	System.out.println("Hello Java");
	System.out.println(true);
	return 	val;	
}
public static void showGoodByte() {
	System.out.println("프로그램 종료");
}
public static void printException() {
	System.out.println("잘못 입력했습니다.");
}
}
