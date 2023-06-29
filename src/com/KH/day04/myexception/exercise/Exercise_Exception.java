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
	public void exercise2() {
		//3개의 정수를 입력 받아 합을 구하는 프로그램을 작성하여.
		//사용자가 정수가 아닌 문자를 입력할 때 발생하는 InputMismatchException예외를
		//처리하여 다시 입력 받도록 하여라.
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true) {
		for(int i =0;i<3;i++)
		{ 
			System.out.print(i+">>");
		
		try {
			sum+=sc.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("정수가 아닙니다. 다시 입력하세요.");
			sc.next();//입력문자 제거
			i--;	  // 2에서 다시 1로 i값을 만들고 i++를 만나 다시 증가함
			continue; // i++ 돌아가 다시 작동하게 함
		}
		}
		
		
		}
		
	}
	public void exercise3() 
	{//범위를 벗어난 배열의 접근 
		int [] arrs = new int[5];
		try {
			System.out.println(arrs[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 범위를 벗어 났습니다.");
		}
		
	}
	public void exercise4() {
		//정수가 아닌 문자열을 정수로 변환할 때 예외 발생
		//NumberFormatException
		String [] str = new String[2];
		str[0] = "1026";
		str[1] = "5.15";	
		//String -> int
		try {
			int result = Integer.parseInt(str[0]);
			System.out.printf("숫자로 변환된 값은 %d\n",result);
			int check = Integer.parseInt(str[1]);
			System.out.printf("정수가 아닌 변환은 %d\n",check);
			
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.printf("해당 문자열은 정수 처리 할 수 없습니다.");
		}
	}
	public void fora() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력:");
		int inputnum = sc.nextInt();		
		int count = 0;
		for(int i =1 ; i <=inputnum ; i++) {
			if(i%2 == 0 || i%3==0)
			{
				System.out.print(i + " ");
			}
			if (i%6 == 0) {
				count++;
			}										
		}
	System.out.println("2와 3의 공배수는"+count);
	}
		
    public void fora2() {
    	for(int i=1 ; i <4 ; i++) {
    		for(int j = 1 ; j<i+1;j++) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    	for(int i=0 ; i <4 ; i++) {
    		for(int j = i+1 ; j<3;j++) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }
    public void fora3() {
    	int k =2;
    	for(int i=1;i<4;i++) {
    			for(int j=i+k;j<8;j++) {
    				System.out.print("*");
    			}
    		}
    	System.out.println();
    		k++;
    	}
    
    



}


	


				


