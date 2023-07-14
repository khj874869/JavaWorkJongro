package com.KH.day13.swing.Studentview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.KH.day13.swing.Student.Student;

public class view {
	List<view> vi ; 
	List<Student> std;
	public view() {
		vi = new ArrayList<view>();
	}
	
	public int printInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.학생 점수 입력");
		System.out.println("2.학생 점수 출력");
		System.out.println("3. 재수강 평가");
		System.out.println("4. 종료 ");
		System.out.print("5.선택:");
		int val = sc.nextInt();
		return val;
	}

	public int injection() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1학기 성적 입력");
		int num = sc.nextInt();
		System.out.println("2학기 성적 입력");
		int num1= sc.nextInt();
		return num;
	}
	
}
