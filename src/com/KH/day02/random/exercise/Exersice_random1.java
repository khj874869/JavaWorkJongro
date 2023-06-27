package com.KH.day02.random.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exersice_random1 {
	public static void main(String []args)
	{
		for(;;) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=============동전 앞 뒤 맞추기 =======");
		System.out.println("숫자를 입력해주세요.:(1.앞면/2.뒷면) :");
		int coin = sc.nextInt();
		Random rand = new Random();
		if(coin>0||coin<3) {
			System.out.print("1 또는 2를 입력해주세요.");			
		do {
				System.out.println("숫자를 입력해주세요.:(1.앞면/2.뒷면) :");
				coin = sc.nextInt();
			}	while (coin<0 || coin>2); 
		}
		int j = rand.nextInt(2)+1;
		 if(coin ==  j ) {
			System.out.print("맞췄습니다.");
		}else  {
			System.out.print("틀렸습니다.");
		}
			
	}
}
}


//Scanner sc = new Scanner(System.in);
//Random rand = new Random();
//System.out.println("====== 동전 앞 뒤 맞추기 =======");
//while(true) {
//	System.out.print("숫자를 입력해주세요 (1.앞면 / 2.뒷면) : ");
//int choice = sc.nextInt();
//if(choice < 0 || choice > 2) {
//	System.out.println("1 또는 2 를 입력해주세요.");
//	while(true) {
//		System.out.print("숫자를 입력해주세요 (1.앞면 / 2.뒷면) : ");
//		choice = sc.nextInt();
//		if(choice == 1 || choice == 2) {
//			break;
//		}else {
//			System.out.println("1 또는 2 를 입력해주세요.");
//		}
//	}
////				do {
////					System.out.print("숫자를 입력해주세요 (1.앞면 / 2.뒷면) : ");
////					choice = sc.nextInt();					
////				}while(choice < 0 || choice > 2);
//}
//int computer = rand.nextInt(2) + 1;
//// 1 부터 2까지의 랜덤한 수
//// 0 부터 1까지의 랜덤 -> nextInt(2)
//// 1 부터 2까지의 랜덤 -> nextInt(2) + 1
//
//if(choice == computer) {
//	System.out.println("맞췄습니다.");
//}else {
//	System.out.println("틀렸습니다.");
//}