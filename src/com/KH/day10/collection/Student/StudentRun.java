package com.KH.day10.collection.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRun {

	public static void main(String[] args) {
		StudentFunction sFunc = new StudentFunction();
		List<Student> str = new ArrayList<Student>();
		finish:
		while(true) {
			int val = sFunc.menu();
			switch(val) {			
			case 1 : sFunc.inputScore() ;break;
			case 2 : sFunc.searchInfoByteName() ;break;
			case 3 : sFunc.printInfo() ;break;
			case 4 : sFunc.Checkpass() ;break;
			case 5 : System.out.println("프로그램이 종료되었습니다.") ;break finish;
			}
		}
		
	}

}
