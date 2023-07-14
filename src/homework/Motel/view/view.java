package homework.Motel.view;

import java.util.Scanner;

public class view {
	
	
	
	public int printInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1.입실");
		System.out.print("2.퇴실");
		System.out.print("3.방보기");
		System.out.print("4.종료");
		System.out.print("선택:");
		int val = sc.nextInt();
		return val;
	}
	public int contain() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 번째 방에 입실 하겠습니까?");
		int val1 = sc.nextInt();
		System.out.println("입실 하셨습니다.");
		return val1;
	}
}
