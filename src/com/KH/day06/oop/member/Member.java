package com.KH.day06.oop.member;

import java.util.Scanner;
public class Member {

	public static void main(String[] args) {
		memberrun [] memArr = new memberrun[3];
		finish :
			
			while(true) {int select = printmenu();
				switch(select) {
				case 1 : inputscore(memArr); break;		
				case 2 : outputscore(memArr);  break;
				case 3 : correct(memArr);  break;
				case 4 : showGoodByte();  break finish;
				default : printException();
				}
				}	
	}

	private static void correct(memberrun[] memArr) {
		// TODO Auto-generated method stub
		
	}

	private static void outputscore(memberrun[] memArr) {
		// TODO Auto-generated method stub
		
	}

	private static void inputscore(memberrun[] memArr) {
		// TODO Auto-generated method stub
		
	}

	public static void printException() {
		System.out.println("잘못 입력 하셨습니다..");

	}

	public static void showGoodByte() {
		System.out.println("종료 합니다.");
	}

	public static void correct(Member[] memArr) {
		
	}

	public static void outputscore(Member[] memArr) {
		
	}

	public static void inputscore(Member[] memArr) {
		Scanner sc = new Scanner(System.in);
		for( int i = 0 ; i<memArr.length;i++) {
			System.out.print("차종의 가격을 설정:" );
			int money = sc.nextInt();
	
		}
	}

	public static int printmenu() {
		System.out.println("차종보기");
		System.out.println("가격보기");
		System.out.println("감가삼각보기");
		System.out.println("종료");		
		Scanner sc = new Scanner(System.in);
		int select  = sc.nextInt();
		
		return select;
	}
	

}
