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
			case 1 : ; break;
			case 2 : System.out.println("2.인출하기"); break;
			case 3 : System.out.println("3.현잔액"); break finish;
			case 4 : showGoodByte() ; break finish;
			default : printException(); break;
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
