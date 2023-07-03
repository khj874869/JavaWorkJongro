package com.KH.day06.oop.member;

public class Member {

	public static void main(String[] args) {
		Member [] memArr = new Member[3];
		finish :
				
			while(true) {int val = printmenu();
				switch(val) {
				case 1 : inputscore(memArr); break;		
				case 2 : outputscore(memArr);  break;
				case 3 : correct(memArr);  break;
				case 4 : showGoodByte();  break finish;
				default : printException();
				}
				}	
	}

	private static void printException() {
		System.out.println("잘못 입력 하셨습니다..");

	}

	private static void showGoodByte() {
		System.out.println("종료 합니다.");
	}

	private static void correct(Member[] memArr) {
		
	}

	private static void outputscore(Member[] memArr) {
		
	}

	private static void inputscore(Member[] memArr) {
		
	}

	private static int printmenu() {
		return 0;
	}

}
