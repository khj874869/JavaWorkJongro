package com.KH.day02.operator.exercise;
import java.io.IOException;
import java.util.Scanner;

public class Exercise_Logica1 {
	public static void main(String [] args)
	{
		//입력한 정수가 1~100사이인지 판별하세요.
		//변수명은 num에 추가
		//1부터 100사이의 숫자인가? True
		Scanner sc = new Scanner(System.in);
		System.out.print("1~100까지의 숫자를 입력해주세요.:");
		int num = sc.nextInt();
		boolean result = num>1 && num<100;
		System.out.println("1부터 100 사이의 숫자 입니까?" );
		System.out.println(result);
		
	}
}
