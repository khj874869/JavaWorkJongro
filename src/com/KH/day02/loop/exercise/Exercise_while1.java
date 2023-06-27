package com.KH.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_while1 {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력:");
		int num = sc.nextInt();	
		int sum =0;
		while(num != -1)
		{
			sum += num;
		System.out.print("정수 하나 입력:");
		num = sc.nextInt();
		
	}
		System.out.print("입력하신 수의 합은:" + sum);	
		
		
		}
		}

