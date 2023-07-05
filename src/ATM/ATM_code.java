package ATM;

import java.util.Scanner;

public class ATM_code {
	Casino cs = new Casino();
	public int inputval() {
		Scanner sc = new Scanner(System.in);
		 System.out.print("1.인출하기");
		 System.out.println("2.입금하기");
		 System.out.println("3.나가기"); 
		System.out.print("입력:");
		int input = sc.nextInt();
		return input;
		}
	public void outputCharge() {
		Scanner sc = new Scanner(System.in);
		System.out.println("얼마를 인출 하시겠습니까?");
		int minus = sc.nextInt();
		
	}
	}

