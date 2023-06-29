package com.KH.day04.myexception.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception {
	
	public void exercies1() 
	{
		//정수를 0으로 나누는 경우에 "0으로 나눌 수 없습니다!"를 출력하고
		//다시 입력받는 프로그램을 작성하여라.
		Scanner sc = new Scanner(System.in);
		while(true)
//		{	int num1, num2;	
//		num1 = 0 ;
//		num2 =0;
			 try {
				System.out.print("정수 입력:");
				int num1= sc.nextInt();
				System.out.print("정수 하나 더 입력:");
				int num2 = sc.nextInt();
				int result = num1/num2;
				System.out.printf("%d를 %d로 나눈 몫은 %d입니다." ,num1,num2, result);
			}
			 	catch(ArithmeticException e) 
			{
				System.out.println("0으로 나눌 수 없습니다!");
				
			}	catch(InputMismatchException e) 
				{
				System.out.print("문자 입력 불가");
				sc.next();
			}
		}
	public void practice2() {
		//3개의 정수를 입력 받아 합을 구하는 프로그램을 작성하여.
		//사용자가 정수가 아닌 문자를 입력할 때 발생하는 InputMismatchException예외를
		//처리하여 다시 입력 받도록 하여라.
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true) {
		try {
		System.out.print("정수 하나 입력:");
		int num1 = sc.nextInt();
		System.out.print("정수 둘 입력:");
		int num2 = sc.nextInt();
		System.out.print("정수 셋 입력:");
		int num3 = sc.nextInt();
		sum = num1 + num2 + num3;
		System.out.println(sum);
		}
		catch(InputMismatchException e) {
			System.out.println("정수 입력해주세요.");
			sc.next();
		}
		}
	}
		}
	


				


