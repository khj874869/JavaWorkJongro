package com.KH.day10.collection.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentFunction {
//	Student [] Students;
	List<Student>stdList = new ArrayList<Student>();
//	int index;
	public StudentFunction() {
//		Students= new Student[100];
//		index= 0;
		stdList = new ArrayList<Student>();
	}
	
	public int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 정보 입력 프로그램");
		System.out.println("1.학생정보입력");
		System.out.println("2.학생 이름 검색");
		System.out.println("3.학생 정보 전체 출력");
		System.out.println("4.재평가여부");
		System.out.println("5.종료");
		System.out.print("선택 :");
		int val = sc.nextInt();
		return  val;
	}
	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.");
		  String name =sc.next();
		  System.out.print("1차점수:");
		  int firstScore =sc.nextInt();
		  System.out.print("2차점수:");
		  int secondScore =sc.nextInt();
		  Student  st = new Student(name,firstScore,secondScore);
		  stdList.add(st);
//		  Students[index] = st;
//		  index++;
	}
	public void printInfo() {
		for(Student student : stdList){
			System.out.println(student.toString());
//		for(int i =0; i<stdList.size() ;i++) {
//			System.out.println(Students[i].getname() + "/");
//			System.out.println(stdList.get(i).toString());
		}
	}
	public void  Checkpass() {
		for(Student student : stdList) {
			int firstScore = student.getfirstScore();
			int secondScore = student.getsecondScore();
			}

	}

	public void searchInfoByteName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 정보 이름 검색");
		System.out.println("검색할 이름 :");
		String searchName = sc.next();
		for(Student std : stdList) {
			if(std.getname().equals(searchName)) {
			System.out.println(std.toString());
			break;
			};
		}
	}
}
