package com.KH.day02.condition_exercise;
import java.util.Scanner;
public class Exercise_swich {
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("커피의 메뉴를 입력해주세요.:");
		String menu = sc.next();
		int charge = 0;
		switch (menu) {
		case "에스프레소" : 
		case "카푸치노" :  
		case "카페라떼": charge =3500; break;
		case "아메리카노": charge =2000; break;
		default : System.out.println("없는 메뉴입니다.");
		}
		 System.out.println(charge + "원입니다.");
	}
}
