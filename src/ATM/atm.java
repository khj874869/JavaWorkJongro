package ATM;

import java.util.Scanner;

public class atm {
	public static void main(String[] args) {
		ATM_code at = new ATM_code();
		finish:
		while(true) {			
			Scanner sc = new Scanner(System.in);
			int val = at.inputval();
			switch(val) {
			case 1 :  at.outputCharge(); break;
			case 2 : at.inputCharge(); break;
			case 3 : at.now(); break ;
			case 4 : at.Casinogame(); break;
			case 5 : showGoodByte() ; break finish;
			default : printException(); break;
			}
		
		}
		finish:
		while(true) {		
			Scanner sc = new Scanner(System.in);
			int col = at.Casinogame();
			switch(col) {
			case 1 :  at.ledder(); break;
			case 2 : at.blackjack(); break;
			case 3 : at.russianRoullet(); break ;
			case 4 : showGoodByte() ; break finish;
			default : printException(); break;
			}
		}
		
		}
	private static void printException() {
		System.out.print("잘못 입력 하였습니다.");		
	}
	private static void showGoodByte() {
		System.out.print("프로그램 "
				+ "종료.");		
		
	}
}
