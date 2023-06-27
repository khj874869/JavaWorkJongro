package com.KH.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_caculator {
	public static void main(String [] args)
//	int i =1;
	{
		int count = 0;
		for(;;)
	{
//		while(i<4) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력:");
		int p = sc.nextInt();
		System.out.print("정수 하나 더 입력:");
		int pl = sc.nextInt();
		System.out.print("연산자 입력");
		char cal = sc.next().charAt(0);
		int result = 0;
		switch (cal) {
		case '+' : result=p + pl ;  break;
		case '-' : result=p - pl ; break;
		case '*' : result=p * pl ; break; 
		case '/' : result=p/ pl ; break; 
		case '%' : result=p % pl ; break; 
		
		}
		System.out.println(p + " " + cal + " " + pl + "=" + result );
//		}
//		i++;
		count++;
		if(count==3) break;
	}
	}
}
