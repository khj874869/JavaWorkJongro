package com.KH.day07.oop.Member;

import java.util.Scanner;

import com.KH.day06.oop.Student.Student;

public class MemberRun {
	
	public static void main(String[] args) {
		MemberFunction mFunc = new MemberFunction();
		finish :
		while(true) {
			int val = mFunc.printmenu();
			switch(val) {
			case 1 : mFunc.Inputinfo(); break;		
			case 2 : mFunc.printInfo();  break;
			case 3 : showGoodByte();  break finish;
			default : printException();
			}
			}
}

	private static void printException() {
System.out.print("잘못 입력 하였습니다.");		
	}

	private static void showGoodByte() {
		System.out.print("프로그램 종료.");		
		
	}

	
	



	
}