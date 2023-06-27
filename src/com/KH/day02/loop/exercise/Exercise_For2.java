package com.KH.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_For2 {
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("1~9까지의 수를 입력하세요.");
		int i = sc.nextInt();
	   if(i>0 && i<10) {
			for(int j =1;j<10;j++) {
				System.out.println(i+"*"+j+"="+i*j);

			}

		}
	   else {
		   System.out.print("1부터 9까지의 숫자만 입력하세요.");
	   }
	}
}
